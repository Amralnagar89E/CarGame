/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheGame.input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author amral
 */
public class KeyManger extends KeyAdapter {

    private boolean [] keys;
    public boolean up,left,down,right;
    
    public KeyManger(){
        
        keys = new boolean[256];
    }
    
    public void tick(){
        
        up = keys[KeyEvent.VK_W] || keys[KeyEvent.VK_UP];
	down = keys[KeyEvent.VK_S] || keys[KeyEvent.VK_DOWN];
	left = keys[KeyEvent.VK_A]|| keys[KeyEvent.VK_LEFT];
	right = keys[KeyEvent.VK_D]|| keys[KeyEvent.VK_RIGHT];

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        keys[ke.getKeyCode()]=true;
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        keys[ke.getKeyCode()]=false;

    }
     @Override
    public void keyTyped(KeyEvent ke) {
    }
}
