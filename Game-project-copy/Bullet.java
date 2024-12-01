import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bullet extends Actor
{
    public Bullet(){

    }

    public void act()
    {
        move(-1);
        if (isAtEdge() || isTouching(Box.class)||isTouching(BlackWall.class) || (isTouching(Chair1.class))|| (isTouching(Chair2.class))||(isTouching(Bwall.class))||
        (isTouching(Desk.class))|| (isTouching(Desk1.class))|| (isTouching(F1.class))||(isTouching(F2.class))||(isTouching(F3.class))|| (isTouching(F4.class))||
        (isTouching(F5.class))||(isTouching(F6.class))||(isTouching(F7.class))||(isTouching(F8.class))||(isTouching(Wall.class))){
            getWorld().removeObject(this);
        }
    }
}
