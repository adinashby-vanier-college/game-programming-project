import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Security here. @author (your name) @version (a version number or a date)
 */
public class Security extends Actor
{
    private int hitCount = 0;
    private int speed = 3;

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Security wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(BananaBullet.class))
        {hitCount++;
            removeTouching(BananaBullet.class);
            if(hitCount>=2){
                getWorld().removeObject(this);}
            }
        
        }
    }

    /**
     * 
     */

