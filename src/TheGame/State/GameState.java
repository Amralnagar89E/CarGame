/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheGame.State;

import Display.Display;
import TheGame.Game;
import TheGame.Physics;
import TheGame.entity.creature.*;
import TheGame.tile.Boom;
import TheGame.tile.Road;
import TheGame.tile.Rock;
import TheGame.tile.Tile;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author amral
 */
public class GameState extends State {

    Random rand =new Random();
    int Score=0;
    private Player player;
    public static Creature player2,player3,player4,player5,player6;
    private Road road;
    private Display disp;
    private Boom boom =new Boom(7); 

    private Rock [] rock=new Rock[5];
    int []x = new int[5];
    int []y = new int[5];
    
   public GameState(Game game){
        super(game);
        
        disp=game.getDisplay();
        player=new Player(game,775,750);//225,775
        player2=new carAi(game,675,750,1);
        player3=new carAi(game,575,750,2);
        player4=new carAi(game,420,750,3);
        player5=new carAi(game,320,750,4);
        player6=new carAi(game,225,750,5);

        
        
        road=new Road(1);
    for(int i=0;i<5;i++)
    {
        rock[i]=new Rock(2+i);    
         x[i]=rock[i].getX();
         y[i]=rock[i].getY();
    } 
    }
    @Override
    public void tick() {
        
        player.tick();
        player2.tick();
        player3.tick();
        player4.tick();
        player5.tick();
        player6.tick();
        
        
        if(Physics.Collision(player,player2)||Physics.Collision(player,player3)||
                Physics.Collision(player,player4)||Physics.Collision(player,player5)||Physics.Collision(player,player6))
         {
           game.stop(); 
           disp.getFrame().dispose();
           System.out.println("Collision W/car");
            JOptionPane.showMessageDialog(null, "Your Score is "+Score,"score", JOptionPane.PLAIN_MESSAGE);
           System.out.println(Score);
     
         }
	}

    int xx,a,b,c,counter;
    @Override
    public void render(Graphics g) {
         xx-=1;
         Score++;

        a=-350;b=0;c=350;
        
        a=a-xx;b=b-xx;c=c-xx;
        
        if(c >= 700)
        {
            counter++;
            c=350;
            a=-350;
            b=0;
            xx=0;
        }
       
        if(counter >= 6)
        {
            System.out.println("Finished");
            disp.getFrame().dispose();
            game.stop(); 
            JOptionPane.showMessageDialog(null, " Your Score is "+Score,"Score", JOptionPane.PLAIN_MESSAGE);
            System.out.println(Score);
 
        }
        Tile.road.render(g,0,a,0);
        Tile.road.render(g,0,b,0);
        Tile.road.render(g,0,c,0);

       

       
          for(int i=0;i<5;i++)
          {
          rock[i].render(g, x[i], y[i]-xx,0);
          }
    player.render(g);

    /***********************************/
   
    if(Physics.CollisionRock(player, rock[1])||Physics.CollisionRock(player, rock[2])||
            Physics.CollisionRock(player, rock[3])||Physics.CollisionRock(player, rock[4])||
            Physics.CollisionRock(player, rock[0]))
    {
           game.stop(); 
           disp.getFrame().dispose();
           System.out.println("Collision W/rock");
            JOptionPane.showMessageDialog(null, "Your Score is "+Score,"score", JOptionPane.PLAIN_MESSAGE);
           System.out.println(Score);
           Score=0;          
    }
      
    
    
    /************************************/
    
    
    for(int i=0;i<5;i++)
    {
    if(Physics.CollisionRock(player2, rock[i]))
    {            
            player2.setY(750);   
            boom.render(g, x[i], y[i]-xx, 0);
    }
    }
    
    for(int i=0;i<5;i++)
    {
    if(Physics.CollisionRock(player3, rock[i]))
    {            
            player3.setY(750);   
            boom.render(g, x[i], y[i]-xx, 0);
    }
    }
    
    for(int i=0;i<5;i++)
    {
    if(Physics.CollisionRock(player3, rock[i]))
    {            
            player3.setY(750);   
            boom.render(g, x[i], y[i]-xx, 0);
    }
    }
    
    for(int i=0;i<5;i++)
    {
    if(Physics.CollisionRock(player4, rock[i]))
    {            
            player4.setY(750);   
            boom.render(g, x[i], y[i]-xx, 0);
    }
    }
    
    for(int i=0;i<5;i++)
    {
    if(Physics.CollisionRock(player5, rock[i]))
    {            
            player5.setY(750);   
            boom.render(g, x[i], y[i]-xx, 0);
    }
    }
    /***********************************/    
    if(player2.getyMove()!=0)
        {
         player2.render(g);
        }
    else
        {
        player2.setY(750);
        player2.render(g);
        }
    if(player3.getyMove()!=0)
        {
         player3.render(g);
        }
    else
        {
        player3.setY(750);
        player3.render(g);
        }
    if(player4.getyMove()!=0)
        {
         player4.render(g);
        }
    else
        {
        player4.setY(750);
        player4.render(g);
        }
    if(player5.getyMove()!=0)
        {
         player5.render(g);
        }
    else
        {
        player5.setY(750);
        player5.render(g);
        }
    if(player6.getyMove()!=0)
        {
         player6.render(g);
        }
    else
        {
        player6.setY(750);
        player6.render(g);
        }
     
    }

    
    
    /*****************************************/
    
    
    
    
}
