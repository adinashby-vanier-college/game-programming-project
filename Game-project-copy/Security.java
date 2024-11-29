import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Security here. @author (your name) @version (a version number or a date)
 */
public class Security extends Actor
{
    private int hitCount = 0;
    private int direction = 3;
    private boolean isRemoved = false;

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Security wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        removeSecurity();
        if(!isRemoved){
            shootBulletRandomly();
            moveRandomly();
            changeDirectionRandomly();
        }

    }

    public void removeSecurity(){
        if (isTouching(BananaBullet.class)) 
        {   hitCount++;
            removeTouching(BananaBullet.class);
            if(this.getWorld() != null && !isRemoved && hitCount==2){
                isRemoved = true;
                this.getWorld().removeObject(this);
            }
        } 

    }

    private void shootBulletRandomly(){
        if( Greenfoot.getRandomNumber(400)< 3){
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet, getX(), getY());
            bullet.setRotation(getRotation());

        }
    }

    private void moveRandomly(){
        
        setLocation(getX(),getY()+ direction);
        
        if (isTouching(BlackWall.class) || (isTouching(Chair1.class))|| (isTouching(Chair2.class))||(isTouching(Bwall.class))||
        (isTouching(Desk.class))|| (isTouching(Desk1.class))|| (isTouching(F1.class))||(isTouching(F2.class))||(isTouching(F3.class))|| (isTouching(F4.class))||
        (isTouching(F5.class))||(isTouching(F6.class))||(isTouching(F7.class))||(isTouching(F8.class))||(isTouching(Wall.class))){
            direction = -direction;
        } 
    }

    private void changeDirectionRandomly(){
        if (Greenfoot.getRandomNumber(50) < 1){
            direction= -direction;
        }
    }
}

/**
 * 
 */

