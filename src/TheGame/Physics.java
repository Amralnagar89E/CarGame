
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheGame;

import TheGame.entity.creature.Creature;
import TheGame.tile.Rock;

/**
 *
 * @author amral
 */
public class Physics {
    
    public static boolean Collision(Creature e,Creature e1){
        
        for(int i=0;i<e.size();i++)
        {
            if(e.getBounds().intersects(e1.getBounds()))
            {
                return true;
            }
        }
        return false;
           
        
    }
    
    public static boolean CollisionRock(Creature e,Rock r){
        
        for(int i=0;i<e.size();i++)
        {
            if(e.getBounds().intersects(r.getBounds()))
            {
                return true;
            }
        }
        return false;
           
        
    }
    
}
