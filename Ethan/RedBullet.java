import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class RedBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedBullet extends Bullet
{
    int delay = 10;
    /**
     * Act - do whatever the RedBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(instanceExists){
            super.act();
        }
        else{
            delay --;
            if(delay <= 0){
                getWorld().removeObject(this);
            }
        }
        System.out.println("Delay:" + delay);
    }    
    public void checkCollision(){
        List<BlueShip>targets = getIntersectingObjects(BlueShip.class);
        
        if (targets.isEmpty() != true) {
            for (BlueShip b : targets) {
                b.setHealth(b.getHealth() - 1);
                System.out.println("lower");
                System.out.println(b);
                System.out.println(b.getHealth());
            }            
            instanceExists = false;
        }
    }
}
