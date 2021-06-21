/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheGame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import Display.Display;
import TheGame.State.*;
import TheGame.input.KeyManger;
import gfx.Assets;

/**
 *
 * @author amral
 */
public class Game implements Runnable {
    private Thread thread;
    private Display Display;
    private boolean running=false;
    private int width,height;
    public String title;
    private BufferStrategy bs;
    private Graphics g;
    private State gameState;
    private KeyManger keyManger;


    
    Game(String title,int width,int height)
    {
        this.height=height;
        this.width=width;
        this.title=title;
        keyManger= new KeyManger();
    }

    public Display getDisplay() {
        return Display;
    }
    
    
    private void init()
    {
       Display = new Display(title,width,height);
       Display.getFrame().addKeyListener(keyManger);
       Assets.init();
        gameState = new GameState(this);
        State.SetState(gameState);

    }
    
    private void tick()
    {
        keyManger.tick();
        
        if(State.GetState() != null)
            State.GetState().tick();
    }
    private void render()
    {
        bs = Display.getCanvas().getBufferStrategy();
        if(bs == null)
        {
            Display.getCanvas().createBufferStrategy(3);
            return;
        }
        g= bs.getDrawGraphics();
        
        g.clearRect(0, 0, width, height);
        
        if(State.GetState() != null)
        {
            State.GetState().render(g);
        }
        bs.show();
        g.dispose();
    }
    @Override
    public void run()
    {
        init();
        int fps=60;
        
        double timePerTick  = 1000000000 /   fps;
        double delta=0;
        long now;
        long lastTime =System.nanoTime();
        long timer =0;
        int ticks=0;
        
        while(running)
        {
            now = System.nanoTime();
            delta +=    (now - lastTime)    /   timePerTick;
            timer += now-lastTime; 
            lastTime=now;
            
            if(delta >= 1){
            tick();
            render();
            ticks++;
            delta--;   
        }
            if(timer >= 1000000000){
                System.out.println("Fps = "+ ticks);
                ticks=0;
                timer=0;
            }
            
        }
        stop();
    }
    
    public KeyManger getKeyManager()
    {
        return keyManger;
    }
    
    public synchronized void start()
    {
        if(running)
            return;
        running=true;
        thread = new Thread(this);
        thread.run();
    }
    public synchronized void stop() 
    {
        if(!running)
            return;
        running=false;
        
        try{thread.join();}
        catch(InterruptedException e){System.out.println(e);}
   }
   

    
    
}
