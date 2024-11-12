// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lab extends World
{

    /**
     * Constructor for objects of class Lab.
     */
    public Lab()
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
        Monkey monkey =  new  Monkey();
        addObject(monkey, 165, 336);
        BB bB =  new  BB();
        addObject(bB, 489, 284);
        monkey.setLocation(163, 342);
        monkey.setLocation(173, 343);
        bB.setLocation(401, 337);
        Security security =  new  Security();
        addObject(security, 401, 337);
        Play play =  new  Play();
        addObject(play, 315, 225);
        play.setLocation(283, 228);
        bB.setLocation(388, 344);
        bB.setLocation(368, 315);
        bB.setLocation(517, 253);
        security.setLocation(409, 338);
        monkey.setLocation(148, 352);
        bB.setLocation(393, 335);
        bB.setLocation(518, 317);
        bB.setLocation(521, 286);
        monkey.setLocation(160, 341);
        play.setLocation(330, 230);
        bB.setLocation(480, 312);
        play.setLocation(302, 244);
        monkey.setLocation(158, 335);
        bB.setLocation(398, 333);
        bB.setLocation(504, 318);
        play.setLocation(288, 208);
        play.setLocation(283, 221);
        bB.setLocation(516, 293);
        play.setLocation(293, 209);
        monkey.setLocation(137, 335);
    }
}
