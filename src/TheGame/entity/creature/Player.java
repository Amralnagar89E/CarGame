/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheGame.entity.creature;

import Display.Display;
import TheGame.Game;
import gfx.Assets;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author amral
 */
public class Player extends Creature{
    
   

    public Player(Game game,float x, float y) {
        super(game,x, y,Creature.DEFAULT_VIHICLE_WIDTH,Creature.DEFAULT_VIHICLE_HEIGHT);
        bounds.x= 10;
        bounds.y=10;
        bounds.width=80;
        bounds.height=165;
    }
    
    private void getInput()
    {
        xMove = 0;
        yMove = 0;
        
        if(game.getKeyManager().up)
            if(y !=0){
            yMove= -speed;
            }
        if(game.getKeyManager().down)
            if(y !=1200)
            yMove= speed;
        if(game.getKeyManager().left)           
            if(x !=225)
            xMove= -speed;
        if(game.getKeyManager().right)
            if(x !=775)
            xMove= speed;
        
    }
   
 @Override
   public void tick() {
       getInput();
       move();
   }
   
    
    public void render(Graphics g) {

        g.drawImage(Assets.Car1, (int)x,(int) y,width,height, null);
        
        
        
        
    }
    
    public Rectangle getBounds(){
        return new Rectangle ((int)x,(int)y,80,165);
    }

    
    
}