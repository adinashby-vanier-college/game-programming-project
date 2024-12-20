import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Monkey2 here.
 * @author (your name) @version (a version number or a date)
 */
public class Monkey2 extends Monkey
{
    private int speed = 8;
    private int gunReloadTime =10;
    private int reloadDelayCount = 0;
    private BananaBullet BB =  new  BananaBullet();
    private GreenfootImage imageRight = new GreenfootImage(getImage());
    private GreenfootImage imageLeft = new GreenfootImage(imageRight);
    public Monkey2(){
        imageLeft.mirrorHorizontally();
        setImage(imageRight);
    }
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Monkey2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyPress();
        reloadDelayCount = reloadDelayCount + 1;
        if(isTouching(Arrow.class)){
            Greenfoot.setWorld(new Level2());
        }
        if(isTouching(Arrow2.class)){
            Greenfoot.setWorld(new Video());
        }
        if(isTouching(Key.class)){
            Greenfoot.playSound("key.wav");
            Greenfoot.setWorld(new Jungle());
        }
    }
    public void fixImageDirection(){
        if(isFacingRight){
            setImage(imageRight);
        }else{
            setImage(imageLeft);
        }
    }
    
    /**
     * 
     */
    public void checkKeyPress()
    {
       if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
            isFacingRight = false;
            if (isTouching(BlackWall.class)) {
                move(speed);
            }
            if (isTouching(Bwall.class)) {
                move(speed);
            }
            if (isTouching(Chair1.class)){
                move(speed);
            }
            if (isTouching(Chair2.class)){
                move(speed);
            }
            if (isTouching(Desk.class)){
                move(speed);
            }
              if (isTouching(Desk1.class)){
                move(speed);
            }
            if (isTouching(F1.class)) {
                move(speed);
            }
            if (isTouching(F2.class)) {
                move(speed);
            }
            if (isTouching(F3.class)) {
                move(speed);
            }
            if (isTouching(F4.class)){
                move(speed);
            }
            if (isTouching(F5.class)){
                move(speed);
            }
            if (isTouching(F6.class)){
                move(speed);
            }
            if (isTouching(F7.class)){
                move(speed);
            }
            if (isTouching(F8.class)){
                move(speed);
            }
              if (isTouching(Wall.class)){
                move(speed);
            }
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());
            isFacingRight = true;
            if (isTouching(BlackWall.class)) {
                move(-speed);
            }
            if (isTouching(Bwall.class)) {
                move(-speed);
            }
            if (isTouching(Chair1.class)){
                move(-speed);
            }
            if (isTouching(Chair2.class)){
                move(-speed);
            }
            if (isTouching(Desk.class)){
                move(-speed);
            }
              if (isTouching(Desk1.class)){
                move(-speed);
            }
            if (isTouching(F1.class)) {
                move(-speed);
            }
            if (isTouching(F2.class)) {
                move(-speed);
            }
            if (isTouching(F3.class)) {
                move(-speed);
            }
            if (isTouching(F4.class)){
                move(-speed);
            }
            if (isTouching(F5.class)){
                move(-speed);
            }
            if (isTouching(F6.class)){
                move(-speed);
            }
            if (isTouching(F7.class)){
                move(-speed);
            }
            if (isTouching(F8.class)){
                move(-speed);
            }
              if (isTouching(Wall.class)){
                move(-speed);
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
            if (isTouching(Chair1.class)){
                moveDown();
            }
             if (isTouching(Chair2.class)){
                moveDown();
            }
            if (isTouching(Desk.class)){
                moveDown();
            }
             if (isTouching(Desk1.class)){
                moveDown();
            }
            if (isTouching(F1.class)) {
                moveDown();
            }
            if (isTouching(F2.class)) {
                moveDown();
            }
            if (isTouching(F3.class)) {
                moveDown();
            }
            if (isTouching(F4.class)){
                moveDown();
            }
            if (isTouching(F5.class)){
                moveDown();
            }
            if (isTouching(F6.class)){
                moveDown();
            }
            if (isTouching(F7.class)){
                moveDown();
            }
            if (isTouching(F8.class)){
                moveDown();
            }
               if (isTouching(Wall.class)){
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
            if (isTouching(Chair1.class)){
                moveUp();
            }
             if (isTouching(Chair2.class)){
                moveUp();
            }
            if (isTouching(Desk.class)){
                moveUp();
            }
              if (isTouching(Desk1.class)){
                moveUp();
            }
            if (isTouching(F1.class)) {
                moveUp();
            }
            if (isTouching(F2.class)) {
                moveUp();
            }
            if (isTouching(F3.class)) {
                moveUp();
            }
            if (isTouching(F4.class)){
                moveUp();
            }
            if (isTouching(F5.class)){
                moveUp();
            }
            if (isTouching(F6.class)){
                moveUp();
            }
            if (isTouching(F7.class)){
                moveUp();
            }
            if (isTouching(F8.class)){
                moveUp();
            }
               if (isTouching(Wall.class)){
                moveUp();
            }
        }
        if (Greenfoot.isKeyDown("space")) {
            fireBananaBullet();
            Greenfoot.playSound("gunShot.wav");
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
