import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PowerUpBox extends Actor
{
    private int hitCount = 0;

    /**
     * Act - do whatever the PowerUpBox wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(BananaBullet.class)){
            hitCount++;
            removeTouching(BananaBullet.class);
        }
        if (hitCount>=2){
            if (Greenfoot.getRandomNumber(100) < 65){
                getWorld().addObject(new Banana(), getX(), getY());
            }
            else{
                getWorld().addObject(new Vial(), getX(), getY());
            }
            getWorld().removeObject(this);
        }
        
    }
}
