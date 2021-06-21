
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheGame.tile;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 *
 * @author amral
 */
public class Tile {
    
    Color c = new Color(0,0,0,0f );

    public static Tile[] tiles =new Tile[50];
    public static Tile road = new Road(0);
    public static Tile rock = new Road(1);
    public static Tile boom =new Boom(2);

    
    protected Rectangle bounds;
    protected BufferedImage texture;
    protected final int id ;
   public int TileWidth,TileHieght;

    
    
    public Tile (BufferedImage texture , int id ,int TileWidth,int TileHieght)
    {
        this.texture=texture;
        this.id=id;
        this.TileHieght=TileHieght;
        this.TileWidth=TileWidth;
        tiles[id]=this;
        
        bounds=new Rectangle(0,0,TileWidth,TileHieght);

    }
  

   
    
    public void render(Graphics g,int x,int y,int d)
    {   
        g.drawImage(texture,x,y,TileWidth,TileHieght+d,null);
        g.setColor(c);
        g.fillRect((int)(x+(bounds.x)), (int)(y+(bounds.y)), (int)((bounds.width)), (int)((bounds.height)));

    } 
 
    
    public boolean isSolid()
    {
        return false;
    }
    
    public int getId() {
        return id;
    }
    
    public int getTileWidth() {
        return TileWidth;
    }

    public int getTileHieght() {
        return TileHieght;
    }
    public Rectangle getBounds(){
        return new Rectangle ((int)120,(int)100,70,80);
    }
}
