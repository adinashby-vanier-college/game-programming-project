// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Jungle here.
 * @author (your name) @version (a version number or a date)
 */
public class Jungle extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class Jungle.
     */
    public Jungle()
    {
        super(600, 400, 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        HappyMonkey happyMonkey =  new  HappyMonkey();
        addObject(happyMonkey, 320, 316);
        happyMonkey.setLocation(436, 299);
        happyMonkey.setLocation(315, 320);
        Word word =  new  Word();
        addObject(word, 312, 186);
        word.setLocation(306, 131);
        word.setLocation(288, 151);
        word.setLocation(362, 201);
        happyMonkey.setLocation(315, 307);
        word.setLocation(327, 213);
    }
}
