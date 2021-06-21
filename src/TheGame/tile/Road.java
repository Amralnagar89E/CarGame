/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheGame.tile;

import TheGame.Game;
import gfx.Assets;
import java.awt.Graphics;

/**
 *
 * @author amral
 */
public class Road extends Tile{
    
   private static int TileWidth=1100;
   private static int TileHieght=700;
   public Game game;
   
    public Road(int id) {
     super(Assets.Road,id,TileWidth,TileHieght);
    }
    
    public void render(Graphics g,int x,int y,int d)
    {   
        
        
        g.drawImage(texture,x,y,TileWidth,TileHieght+d,null);

        
    } 
    
    public int getTileWidth() {
        return TileWidth;
    }

    public int getTileHieght() {
        return TileHieght;
    }
 
   

    
}
