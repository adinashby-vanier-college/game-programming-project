import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Monkey2 here.
 * @author (your name) @version (a version number or a date)
 */
public class Monkey2 extends Monkey
{
    private int speed = 3;
    private int gunReloadTime = 20;
    private int reloadDelayCount = 0;
    private BananaBullet BB =  new  BananaBullet();
    public Monkey2(){}
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
            if (isTouching(Chair1.class)){
                move(3);
            }
            if (isTouching(Chair2.class)){
                move(3);
            }
            if (isTouching(Desk.class)){
                move(3);
            }
              if (isTouching(Desk1.class)){
                move(3);
            }
            if (isTouching(F1.class)) {
                move(3);
            }
            if (isTouching(F2.class)) {
                move(3);
            }
            if (isTouching(F3.class)) {
                move(3);
            }
            if (isTouching(F4.class)){
                move(3);
            }
            if (isTouching(F5.class)){
                move(3);
            }
            if (isTouching(F6.class)){
                move(3);
            }
            if (isTouching(F7.class)){
                move(3);
            }
            if (isTouching(F8.class)){
                move(3);
            }
              if (isTouching(Wall.class)){
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
            if (isTouching(Chair1.class)){
                move(-3);
            }
             if (isTouching(Chair2.class)){
                move(-3);
            }
            if (isTouching(Desk.class)){
                move(-3);
            }
              if (isTouching(Desk1.class)){
                move(-3);
            }
            if (isTouching(F1.class)) {
                move(-3);
            }
            if (isTouching(F2.class)) {
                move(-3);
            }
            if (isTouching(F3.class)) {
                move(-3);
            }
            if (isTouching(F4.class)){
                move(-3);
            }
            if (isTouching(F5.class)){
                move(-3);
            }
            if (isTouching(F6.class)){
                move(-3);
            }
            if (isTouching(F7.class)){
                move(-3);
            }
            if (isTouching(F8.class)){
                move(-3);
            }
               if (isTouching(Wall.class)){
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
