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
        if (isAtEdge()||isTouching(BlackWall.class) || (isTouching(Chair1.class))|| (isTouching(Chair2.class))||(isTouching(Bwall.class))||
        (isTouching(Desk.class))|| (isTouching(Desk1.class))|| (isTouching(F1.class))||(isTouching(F2.class))||(isTouching(F3.class))|| (isTouching(F4.class))||
        (isTouching(F5.class))||(isTouching(F6.class))||(isTouching(F7.class))||(isTouching(F8.class))||(isTouching(Wall.class))) {
            getWorld().removeObject(this);
        }
    }
}
