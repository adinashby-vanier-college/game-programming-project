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
    private int gunReloadTime = 20;
    private int reloadDelayCount = 0;
    private BananaBullet BB =  new BananaBullet();

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Monkey2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyPress();
        reloadDelayCount = reloadDelayCount + 1;
    }

    /**
     * 
     */
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(-3);
            if (isTouching(BlackWall.class)) {
                move(3);
            }
            if (isTouching(Bwall.class)) {
                move(3);
            }
        }
        if (Greenfoot.isKeyDown("right")) {
            move(3);
            if (isTouching(BlackWall.class)) {
                move(-3);
            }
            if (isTouching(Bwall.class)) {
                move(-3);
            }
        }
        if (Greenfoot.isKeyDown("up")) {
            moveUp();
            if (isTouching(BlackWall.class)) {
                moveDown();
            }
            if (isTouching(Bwall.class)) {
                moveDown();
            }
        }
        if (Greenfoot.isKeyDown("down")) {
            moveDown();
            if (isTouching(BlackWall.class)) {
                moveUp();
            }
            if (isTouching(Bwall.class)) {
                moveUp();
            }
        }
        if (Greenfoot.isKeyDown("space")) {
            fireBananaBullet();
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

    /**
     * 
     */
    public void setGunReloadTime(int reloadTime)
    {
        gunReloadTime = reloadTime;
    }

    /**
     * 
     */
    public void fireBananaBullet()
    {
        getWorld().addObject(BB, getX(), getY());
        reloadDelayCount = 0;
    }
}
