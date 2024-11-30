import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BB extends Actor
{
    private int moveCounter = 0;  // Counter to track the up/down movement
    private int throwCounter = 0;  // Counter to track poison throw timing
    private boolean movingUp = false;  // Start by moving down
    private int hitCounter = 0;  // Counter to track the number of hits by BananaBullet
    private boolean isRemoved = false;
    public void act() 
    {
        checkForBananaBullet();  // Check for collisions with BananaBullet
        if(!isRemoved){
            
        moveUpAndDown();
        throwPoison();
    }
    
    }

    private void moveUpAndDown()
    {
        moveCounter++;
        
        // Change direction every 3.5 seconds (60 frames per second * 3.5 seconds = 210 frames)
        if (moveCounter % 210 == 0)
        {
            movingUp = !movingUp;  // Reverse direction every 3.5 seconds
        }
        
        if (movingUp)
        {
            setLocation(getX(), getY() - 1);  // Move up
        }
        else
        {
            setLocation(getX(), getY() + 1);  // Move down
        }
    }

    private void throwPoison()
    {
        throwCounter++;
        
        // Throw poison every 2 seconds (60 frames per second * 2 seconds = 120 frames)
        if (throwCounter % 120 == 0)
        {
            Poison poison = new Poison();
            getWorld().addObject(poison, getX(), getY());  // Throw poison at BB's current position
        }
    }

    // Check if BB is hit by a BananaBullet
    private void checkForBananaBullet()
    {
        BananaBullet bananaBullet = (BananaBullet) getOneIntersectingObject(BananaBullet.class);  // Check for collision with BananaBullet
        
        if (bananaBullet != null)
        {
            hitCounter++;  // Increment hit counter if collision is detected
            // Remove the BananaBullet from the world after it hits BB
            getWorld().removeObject(bananaBullet);
            
            if (this.getWorld() != null && !isRemoved && hitCounter >= 10)  // If BB has been hit 15 times, remove BB
            {
                isRemoved = true;
                getWorld().removeObject(this);  // BB dies (gets removed from the world)
                
            }
    
        }
    } 

    
}




