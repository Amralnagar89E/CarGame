/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheGame.entity.creature;

import TheGame.Game;
import gfx.Assets;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

/**
 *
 * @author amral
 */
public class carAi extends Creature {
    
    
      int n;
      Random rand =new Random();
      int  speed1=rand.nextInt(5)+2;


    public carAi(Game game,float x, float y,int n) {
        super(game,x, y,Creature.DEFAULT_VIHICLE_WIDTH,Creature.DEFAULT_VIHICLE_HEIGHT);
        bounds.x= 10;
        bounds.y=10;
        bounds.width=80;
        bounds.height=165;
        this.n=n;
        
        
    }
    
    private void getInput()
    {
         
        yMove = 0;
        if(y !=0){
        yMove-=speed1;
        }
        
    }

    public float getyMove() {
        return yMove;
    }

    public void setyMove(float yMove) {
        this.yMove = yMove;
    }
    
 @Override
   public void tick() {
       getInput();
       move();
	
	}
   
   
    public void render(Graphics g) {
        if(n==1)
        {
        g.drawImage(Assets.Car2, (int)x,(int) y,width,height, null);
        }
        if(n==2)
        {
        g.drawImage(Assets.Car3, (int)x,(int) y,width,height, null);
        }
        if(n==3)
        {
        g.drawImage(Assets.Car4, (int)x,(int) y,width,height, null);
        }
        if(n==4)
        {
        g.drawImage(Assets.Car5, (int)x,(int) y,width,height, null);
        }
        if(n==5)
        {
        g.drawImage(Assets.Car6, (int)x,(int) y,width,height, null);
        }
        
    }
    

        
        public Rectangle getBounds(){
        return new Rectangle ((int)x,(int)y,80,165);
    }

}