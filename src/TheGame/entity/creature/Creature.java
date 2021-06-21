/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheGame.entity.creature;

import TheGame.Game;
import TheGame.entity.Entity;
import TheGame.tile.Tile;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author amral
 */
 public abstract class Creature extends Entity {

    public static final float DEFAULT_SPEED=10.0f; 
    
    public static final int DEFAULT_VIHICLE_WIDTH = 100;
    public static final int DEFAULT_VIHICLE_HEIGHT = 200;


    protected float speed;
    protected float xMove ,yMove;
    public Tile Tile;
    
public Creature(Game game,float x, float y,int width,int height) {
        super(game,x, y,width,height);
        speed=DEFAULT_SPEED;
        xMove=yMove=0;
    }


    public void move()
    {
        moveX();
        moveY();
    }
    
   public void moveX(){
	x += xMove;		
	}
    public void moveY()
    {
      y += yMove;

    }
  
    public float getxMove() {
        return xMove;
    }

    public void setxMove(float xMove) {
        this.xMove = xMove;
    }

    public float getyMove() {
        return yMove;
    }

    public void setyMove(float yMove) {
        this.yMove = yMove;
    }
     
    
    

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
    }
   public int size()
    {
        return width*height;
    }
     public Rectangle getBounds(){
        return new Rectangle ((int)x,(int)y,80,165);
    }
}
