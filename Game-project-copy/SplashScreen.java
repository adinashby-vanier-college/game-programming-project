import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SplashScreen extends World
{
    private int timer = 0;
    private final int transitionTime = 120;
    /**
     * Constructor for objects of class SplashScreen.
     */
    public SplashScreen()
    {
        super(600, 400, 1);
    }
    public void act(){
        timer++;
        if (timer >= transitionTime){
            Greenfoot.setWorld(new Instruction());
        }
    }
}
