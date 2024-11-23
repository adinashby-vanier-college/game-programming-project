// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     */
    public GameOverWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GameOver gameOver =  new GameOver();
        addObject(gameOver, 303, 165);
        SadMonkey sadMonkey =  new SadMonkey();
        addObject(sadMonkey, 296, 308);
        Greenfoot.playSound("gameOver.wav");
    }
}
