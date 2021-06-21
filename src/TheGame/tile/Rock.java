/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheGame.tile;

import gfx.Assets;
import java.awt.Rectangle;
import java.util.Random;

/**
 *
 * @author amral
 */
public class Rock extends Tile{
    
     public int x;
     public int y;
     Random rand =new Random();
    
    public Rock(int id) {
        super(Assets.Rock,id,120,100);
        x =rand.nextInt(600)+225;
        y =rand.nextInt(350); 
        
        bounds.x= 40;
        bounds.y=10;
        bounds.width=80;
        bounds.height=90;
    }
    
    
    
 
    
    public void genrateposrock()
    {
        
     x =rand.nextInt(600)+225;
     y =rand.nextInt(1400); 
    
     }  

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
     public int size()
    {
        return 120*100;
    }
    public Rectangle getBounds(){
        return new Rectangle ((int)x,(int)y,120,140);
    }
    
    
}
    