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
    
    boolean instanceExists;
    public void act() 
    {
        instanceExists = true;
        List<VictimBoat>targets = getIntersectingObjects(VictimBoat.class);
        
        if (targets!=null) {
            for (VictimBoat b : targets) {
                b.setHealth(b.getHealth() - 1);
                System.out.println(b);
            }            
            //instanceExists = false;
        } 
        
        //Checks if bullet went outside the window and deletes it if it is
        if(this.getX() >= getWorld().getWidth() - 20){
            instanceExists = false;
            //System.out.println("dis bullet deid");
        }
        else{
            setLocation(getX() + 5, getY());
        }
        if(instanceExists == false){
            getWorld().removeObject(this);
        }
    }    
}
