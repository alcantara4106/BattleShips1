import greenfoot.*;
import java.util.List;
/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int direction, speed;
    boolean instanceExists;
    int delay = 10;
    public void act() 
    {
        instanceExists = true;
        List<VictimBoat>targets = getIntersectingObjects(VictimBoat.class);
        
        if (targets.isEmpty() != true) {
            for (VictimBoat b : targets) {
                b.setHealth(b.getHealth() - 1);
                //System.out.println(b);
            }            
            System.out.println("detected a victim boat");
            instanceExists = false;
        } 
        
        //Checks if bullet went outside the window and deletes it if it is
        if(this.getX() >= getWorld().getWidth() - 20){
            instanceExists = false;
            System.out.println("dis bullet deid");
        }
        else{
            setLocation(getX() + 5, getY());
        }
        if(instanceExists == false){
            getWorld().removeObject(this);
            /*
            if(delay <= 0){
                getWorld().removeObject(this);
                delay = 10;
            }
            else{
                delay --;
            }*/
        }
        System.out.println(delay);
        
        setRotation(direction);
    }
    
    public Bullet(int dir)
    {
        direction = dir;
        speed = 15;
    }
    
}
