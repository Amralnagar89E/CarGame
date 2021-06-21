/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheGame.State;

import TheGame.Game;
import java.awt.Graphics;

/**
 *
 * @author amral
 */
public abstract class State {
  
    private static State currentstate =null;
    
    public static void SetState(State state)
    {
        currentstate=state;
        
        
    }
    
    public static State GetState()
    {
        return currentstate;
    }
    
    protected Game game;
    
    public State(Game game)
    {
        this.game=game;
    }
    
   public abstract void tick();
   
   public abstract void render(Graphics g);

    public void genrateposrock() {
        
    }
   
}
