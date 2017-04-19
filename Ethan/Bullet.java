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
    public void act() 
    {
        List<VictimBoat>targets = getObjectsInRange(50,VictimBoat.class);
        /* The above line checks if any objects are in a 50 pixel radius. The boats are about
           100 x 100 so 50 should be work (only detects the center of the sprite, not the
           edges)*/
        if (targets!=null) {
            for (VictimBoat b : targets) {
                getWorld().removeObject(b);
            }            
        } 
        if(this.getX() >= getWorld().getWidth() - 20){
            getWorld().removeObject(this);
            //System.out.println("dis bullet deid");
        }
        else{
            setLocation(getX() + 5, getY());
        }
    }    
}
