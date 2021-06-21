/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfx;

import java.awt.image.BufferedImage;

/**
 *
 * @author amral
 */
public class Assets {
    
    public static BufferedImage Car1,Car2,Car3,Car4,Car5,Car6,Road,Rock,Boom;
    public static void init()
    {
        
       Car1=ImageLoader.loadImage("/texture/car1.png");
       Car2=ImageLoader.loadImage("/texture/car2.png");
       Car3=ImageLoader.loadImage("/texture/car3.png");
       Car4=ImageLoader.loadImage("/texture/car4.png");
       Car5=ImageLoader.loadImage("/texture/car5.png");
       Car6=ImageLoader.loadImage("/texture/car6.png");
       Rock=ImageLoader.loadImage("/texture/rock.png");
       Road = ImageLoader.loadImage("/texture/road.gif");
       Boom = ImageLoader.loadImage("/texture/boom.png");

    }       
        
}
