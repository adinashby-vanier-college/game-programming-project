import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Restart extends Actor
{

    /**
     * Act - do whatever the Restart wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld( new  Lab());
            stopMusic();
        }
    }

    /**
     * //stop music when click on it
     */
    private void stopMusic()
    {
        Jungle world = (Jungle) getWorld();
        world.gameMusic.stop();
    }
}
