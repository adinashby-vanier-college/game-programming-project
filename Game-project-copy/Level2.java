import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Level2 extends World
{
    private GreenfootSound music = new GreenfootSound("Danger.mp3");
    /**
     * Constructor for objects of class Level2.
     */
    public Level2()
    {
        super(1000, 600, 1);
        prepare();
        started();
    }
    public void act(){
        if (getObjects(Security.class).isEmpty()){
            Arrow2 arrow = new Arrow2();
            addObject(arrow,958,408);
        }
    }
    public void stopped(){
        music.stop();
    }
    public void started(){
        music.play();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BlackWall blackWall =  new BlackWall();
        addObject(blackWall, 980, 291);
        BlackWall blackWall2 =  new BlackWall();
        addObject(blackWall2, 978, 226);
        BlackWall blackWall3 =  new BlackWall();
        addObject(blackWall3, 979, 157);
        BlackWall blackWall4 =  new BlackWall();
        addObject(blackWall4, 932, 91);
        Bwall bwall =  new Bwall();
        addObject(bwall, 855, 57);
        Bwall bwall2 =  new Bwall();
        addObject(bwall2, 783, 56);
        BlackWall blackWall5 =  new BlackWall();
        addObject(blackWall5, 718, 94);
        blackWall5.setLocation(739, 108);
        blackWall5.setLocation(695, 50);
        Bwall bwall3 =  new Bwall();
        addObject(bwall3, 604, 1);
        bwall3.setLocation(643, 16);
        Bwall bwall4 =  new Bwall();
        addObject(bwall4, 607, 593);
        Bwall bwall5 =  new Bwall();
        addObject(bwall5, 516, 595);
        Bwall bwall6 =  new Bwall();
        addObject(bwall6, 438, 593);
        Bwall bwall7 =  new Bwall();
        addObject(bwall7, 364, 594);
        bwall7.setLocation(328, 594);
        Bwall bwall8 =  new Bwall();
        addObject(bwall8, 328, 594);
        BlackWall blackWall6 =  new BlackWall();
        addObject(blackWall6, 256, 565);
        BlackWall blackWall7 =  new BlackWall();
        addObject(blackWall7, 680, 560);
        BlackWall blackWall8 =  new BlackWall();
        addObject(blackWall8, 881, 510);
        Bwall bwall9 =  new Bwall();
        addObject(bwall9, 754, 543);
        Bwall bwall10 =  new Bwall();
        addObject(bwall10, 817, 541);
        Bwall bwall11 =  new Bwall();
        addObject(bwall11, 520, 10);
        BlackWall blackWall9 =  new BlackWall();
        addObject(blackWall9, 435, 39);
        blackWall9.setLocation(454, 38);
        BlackWall blackWall10 =  new BlackWall();
        addObject(blackWall10, 454, 38);
        blackWall10.setLocation(478, 58);
        BlackWall blackWall11 =  new BlackWall();
        addObject(blackWall11, 718, 94);
        blackWall11.setLocation(724, 96);
        BlackWall blackWall12 =  new BlackWall();
        addObject(blackWall12, 206, 40);
        blackWall12.setLocation(219, 45);
        Bwall bwall12 =  new Bwall();
        addObject(bwall12, 357, 3);
        bwall12.setLocation(363, 12);
        Bwall bwall13 =  new Bwall();
        addObject(bwall13, 277, 10);
        BlackWall blackWall13 =  new BlackWall();
        addObject(blackWall13, 158, 87);
        BlackWall blackWall14 =  new BlackWall();
        addObject(blackWall14, 123, 411);
        BlackWall blackWall15 =  new BlackWall();
        addObject(blackWall15, 35, 361);
        BlackWall blackWall16 =  new BlackWall();
        addObject(blackWall16, 56, 412);
        blackWall6.setLocation(273, 557);
        BlackWall blackWall17 =  new BlackWall();
        addObject(blackWall17, 209, 560);
        BlackWall blackWall18 =  new BlackWall();
        addObject(blackWall18, 161, 460);
        Bwall bwall14 =  new Bwall();
        addObject(bwall14, 152, 511);
        Bwall bwall15 =  new Bwall();
        addObject(bwall15, 960, 493);
        BlackWall blackWall19 =  new BlackWall();
        addObject(blackWall19, 61, 139);
        Bwall bwall16 =  new Bwall();
        addObject(bwall16, 22, 157);
        blackWall13.setLocation(130, 107);
        Bwall bwall17 =  new Bwall();
        addObject(bwall17, 130, 107);
        blackWall5.setLocation(663, 42);
        blackWall9.setLocation(418, 52);
        blackWall10.setLocation(471, 41);
        bwall3.setLocation(574, 0);
        bwall3.setLocation(622, 12);
        blackWall6.setLocation(285, 534);
        blackWall9.setLocation(445, 66);
        blackWall10.setLocation(493, 51);
        blackWall13.setLocation(182, 71);
        blackWall6.setLocation(275, 563);
        blackWall5.setLocation(673, 51);
        blackWall9.setLocation(413, 24);
        removeObject(blackWall9);
        blackWall10.setLocation(457, 44);
        blackWall10.setLocation(442, 54);
        Bwall bwall18 =  new Bwall();
        addObject(bwall18, 442, 54);
        blackWall5.setLocation(694, 39);
        blackWall11.setLocation(735, 83);
        blackWall13.setLocation(162, 97);
        blackWall13.setLocation(135, 74);
        blackWall10.setLocation(438, 93);
        blackWall10.setLocation(427, 31);
        bwall18.setLocation(458, 54);
        blackWall5.setLocation(679, 40);
        blackWall11.setLocation(714, 93);
        blackWall10.setLocation(421, 24);
        blackWall13.setLocation(159, 90);
        bwall18.setLocation(474, 61);
        bwall18.setLocation(482, 65);
        blackWall10.setLocation(451, 29);
        bwall18.setLocation(442, 58);
        blackWall10.setLocation(449, 29);
        F2 f2 =  new F2();
        addObject(f2, 253, 466);
        F4 f4 =  new F4();
        addObject(f4, 575, 70);
        F4 f42 =  new F4();
        addObject(f42, 525, 519);

        F3 f3 =  new F3();
        addObject(f3, 568, 339);
        F5 f5 =  new F5();
        addObject(f5, 315, 162);
        F6 f6 =  new F6();
        addObject(f6, 804, 489);
        Desk1 desk1 =  new Desk1();
        addObject(desk1, 817, 108);
        Chair1 chair1 =  new Chair1();
        addObject(chair1, 717, 158);
        desk1.setLocation(874, 179);
        Chair2 chair2 =  new Chair2();
        addObject(chair2, 874, 179);
        f5.setLocation(304, 155);
        f5.setLocation(316, 177);
        f3.setLocation(586, 298);
        desk1.setLocation(781, 98);
        desk1.setLocation(802, 134);
        f2.setLocation(240, 478);
        f2.setLocation(249, 464);
        f5.setLocation(291, 57);
        F7 f7 =  new F7();
        addObject(f7, 284, 247);
        Chair2 chair22 =  new Chair2();
        addObject(chair22, 319, 293);

        Security security = new Security();
        addObject(security,357,153);
        Security security2 = new Security();
        addObject(security2,388,453);
        Security security3 = new Security();
        addObject(security3,659,422);
        Security security4 = new Security();
        addObject(security4,861,373);
        Security security5 = new Security();
        addObject(security5,771,232);
        security3.setLocation(652,444);
        security5.setLocation(761,271);
        Monkey monkey = new Monkey();
        addObject(monkey,51,249);
        f7.setLocation(308,280);
        f7.setLocation(352,317);
        f7.setLocation(318,261);
        chair22.setLocation(351,311);
        f7.setLocation(267,248);
        chair22.setLocation(303,281);
        f3.setLocation(667,325);
        f3.setLocation(597,307);
        f3.setLocation(577,291);
        f3.setLocation(590,295);
        f3.setLocation(628,317);
        security5.setLocation(609,202);
        desk1.setLocation(826,107);
        chair2.setLocation(893,156);
        chair1.setLocation(772,138);
        desk1.setLocation(829,100);
        desk1.setLocation(886,146);
        desk1.setLocation(807,80);
        chair2.setLocation(893,139);
        desk1.setLocation(855,96);
        desk1.setLocation(781,134);
        desk1.setLocation(857,107);
        desk1.setLocation(882,135);
        desk1.setLocation(843,90);
        Box box = new Box();
        addObject(box,436,362);
        Box box2 = new Box();
        addObject(box2,894,227);
        Box box3 = new Box();
        addObject(box3,435,544);
        Box box4 = new Box();
        addObject(box4,485,113);
        box.setLocation(480,328);
        box2.setLocation(912,235);
    }
}
