import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Monkey here. @author (your name) @version (a version number or a date)
 */
public class Monkey extends Actor
{
    private int speed = 3;
    private int gunReloadTime = 25;
    private int reloadDelayCount = 0;
    private BananaBullet BB =  new  BananaBullet(this);
    int Monkey2;
    private int timer = 0;
    private int transitionTime = 5;
    private int health = 5;
    public boolean isFacingRight = true;
    private boolean isRemoved = false;
    private GreenfootImage imageRight = new GreenfootImage(getImage());
    private GreenfootImage imageLeft = new GreenfootImage(imageRight);
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    public Monkey(){
        imageLeft.mirrorHorizontally();
        setImage(imageRight);
    }
    /**
     * Act - do whatever the Monkey wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        BPowerUp();
        if(!isRemoved){
        //Hearts life = new Hearts();
        checkKeyPress();
        reloadDelayCount = reloadDelayCount + 1;
        VPowerUp();
        fixImageDirection();
        BulletCollision();
    }
        
        if(isTouching(Arrow.class)){
            Greenfoot.playSound("LevelUp.wav");
            Greenfoot.setWorld(new Level2());
        }
        if(isTouching(Arrow2.class)){
            Greenfoot.playSound("LevelUp.wav");
            Greenfoot.setWorld(new Video());
        }
        if(isTouching(Key.class)){
            Greenfoot.playSound("key.wav");
            Greenfoot.setWorld(new Jungle());
        }
        /*switch (health){
                case 1:
                    life.setImage("hearts1.png");
                    break;
                case 2:
                    life.setImage("hearts2.png");
                    break;
                case 3:
                    life.setImage("hearts3.png");
                    break;
                case 4:
                    life.setImage("hearts4.png");
                    break;
                default:
                    life.setImage("hearts5.png");
            }*/
    }
    private void BulletCollision(){
        Bullet bullet = (Bullet) getOneIntersectingObject(Bullet.class);
        if (bullet != null){
            health--; 
            getWorld().removeObject(bullet);
            Greenfoot.playSound("Oof.wav");
            if (health <= 0){
                Greenfoot.setWorld(new GameOverWorld());
            }
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
            Greenfoot.playSound("gunShot.wav");
            fireBananaBullet();
        }
    }

    /**
     * 
     */
    private void moveUp()
    {
        setLocation(getX(), getY() - speed);
    }

    /**
     * 
     */
    private void moveDown()
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
    public void BPowerUp(){
        if (isTouching(Banana.class)){
            World world = getWorld();
            removeTouching(Banana.class);
            Monkey2 monkey2 =new Monkey2();
            world.addObject(monkey2, getX(), getY());
            if(world !=null && !isRemoved){
                isRemoved = true;
                world.removeObject(this);
            }
        }
    }
        /*Actor banana = getOneIntersectingObject(Banana.class);
            if (banana !=null){
            World world = getWorld();
            world.removeObject(banana);
            setImage("primate194_100.png");
            timer++;
            if(timer >= transitionTime){
                setImage("primate194_small.png"); 
            }
        }*/
        
    
    
    public void VPowerUp(){
        Actor vial = getOneIntersectingObject(Vial.class);
        if (vial !=null){   
            World world = getWorld();
            world.removeObject(vial);
            setGunReloadTime(1);
        }
    }
    
    public void fixImageDirection(){
        
        
        if(isFacingRight){
            setImage(imageRight);
        }else{
            setImage(imageLeft);
        }
    }
    public int getHealth(){
        return health;
    }
 


    /*public void addObject(){
        Actor banana = getOneIntersectingObject(Banana.class);
        if (banana != null){
            World world = getWorld();
            int xLocation = banana.getX();
            int yLocation = banana.getY();
            Actor monkey = new Monkey2();
            world.removeObject(banana);
            world.addObject(new Monkey2(), xLocation, yLocation);
        }
    }*/

}

