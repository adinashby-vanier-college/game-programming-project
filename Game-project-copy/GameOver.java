import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOver extends Actor
{
    public GameOver(){
    }
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld( new  Lab());
        }
    }
}
