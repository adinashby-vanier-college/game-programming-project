import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Poison extends Actor
{
    private int throwCounter = 0;  // Counter to track poison throw timing

    public void act() 
    {
        throwPoison();
        moveLeft();  // Move poison to the left
        checkCollision();
        if (isAtEdge() || isTouching(BlackWall.class) || (isTouching(Chair1.class))|| (isTouching(Chair2.class))||(isTouching(Bwall.class))||
        (isTouching(Desk.class))|| (isTouching(Desk1.class))|| (isTouching(F1.class))||(isTouching(F2.class))||(isTouching(F3.class))|| (isTouching(F4.class))||
        (isTouching(F5.class))||(isTouching(F6.class))||(isTouching(F7.class))||(isTouching(F8.class))||(isTouching(Wall.class))){
            getWorld().removeObject(this);
        }
    }

    private void throwPoison()
    {
        throwCounter++;

        // Throw poison every 2 seconds (60 frames per second * 2 seconds = 120 frames)
        if (throwCounter % 120 == 0)
        {
            Poison newPoison = new Poison();
            getWorld().addObject(newPoison, getX(), getY());  // Spawn new poison at current location
        }
    }

    private void moveLeft()
    {
        setLocation(getX() - 2, getY());  // Move poison 2 pixels to the left per frame
    }

    private void checkCollision()
    {
        // Check if poison hits Monkey or Monkey2
        Actor monkey = getOneIntersectingObject(Monkey.class);  
        Actor monkey2 = getOneIntersectingObject(Monkey2.class);  

        // If the poison collides with either monkey, restart the game
        if (monkey != null || monkey2 != null)
        {
            Greenfoot.setWorld(new GameOverWorld());  // Restart the game by setting the world to Lab
        }
    }
}



