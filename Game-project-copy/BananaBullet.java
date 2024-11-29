import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class BananaBullet extends Actor
{
    private Monkey m;
    public BananaBullet(){
        m = new Monkey();
    }
    public BananaBullet(Monkey m){
        this.m = m;
    }
    /**
     * Act - do whatever the BananaBullet wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(m.isFacingRight){
            move(20);
        }
        if(!m.isFacingRight){
            move(-20);
        }
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
