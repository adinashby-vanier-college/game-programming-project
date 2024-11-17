// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Jungle here. @author (your name) @version (a version number or a date)
 */
public class Jungle extends World
{
    private GreenfootSound gameMusic;

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class Jungle.
     */
    public Jungle()
    {
        super(600, 400, 1);
        gameMusic =  new  GreenfootSound("winning.wav");
        gameMusic.play();
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
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
        WinCup winCup =  new  WinCup();
        addObject(winCup, 311, 121);
        word.setLocation(369, 209);
        winCup.setLocation(312, 138);
        happyMonkey.setLocation(320, 327);
        word.setLocation(371, 229);
        winCup.setLocation(329, 168);
        winCup.setLocation(324, 135);
        word.setLocation(346, 245);
        happyMonkey.setLocation(312, 330);
        word.setLocation(307, 226);
        winCup.setLocation(297, 146);
        winCup.setLocation(310, 160);
        word.setLocation(332, 223);
        winCup.setLocation(328, 112);
        winCup.setLocation(291, 122);
        word.setLocation(285, 214);
        happyMonkey.setLocation(314, 326);
        word.setLocation(342, 210);
        word.setLocation(332, 234);
        word.setLocation(369, 218);
        winCup.setLocation(297, 174);
        word.setLocation(335, 258);
        winCup.setLocation(298, 150);
        word.setLocation(297, 235);
    }

    /**
     * 
     */
    public void started()
    {
        gameMusic.playLoop();
    }

    /**
     * 
     */
    public void stopped()
    {
        gameMusic.stop();
    }
}
