// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Video extends World
{
    public GreenfootSound audio;
    protected GifImage video =  new GifImage("video.gif");

    /**
     * Constructor for objects of class Video.
     */
    public Video()
    {
        super(600, 400, 1);
        audio =  new GreenfootSound("Final.wav");
        audio.play();
    }

    /**
     * make gif play
     */
    public void playVideo()
    {
        setBackground(video.getCurrentImage());
    }

    /**
     * 
     */
    public void act()
    {
        playVideo();
        if ( ! audio.isPlaying()) {
            Greenfoot.setWorld( new Level3());
        }
    }

    /**
     * 
     */
    public void playAudio()
    {
    }
}
