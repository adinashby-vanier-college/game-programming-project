// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Monkey2 here.
 * @author (your name) @version (a version number or a date)
 */
public class Monkey2 extends Actor
{
    private int speed = 3;

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Monkey2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyPress();
    }

    /**
     * 
     */
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("up")) {
            moveUp();
        }
        if (Greenfoot.isKeyDown("down")) {
            moveDown();
        }
    }

    /**
     * 
     */
    public void moveUp()
    {
        setLocation(getX(), getY() - speed);
    }

    /**
     * 
     */
    public void moveDown()
    {
        setLocation(getX(), getY() + speed);
    }
}
