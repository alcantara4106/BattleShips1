import greenfoot.*;
import java.util.List;
/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor implements BulletActions
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    boolean instanceExists;
    //int delay = 10;
    public void addedToWorld(World world){
        instanceExists = true;
    }
    public void act() 
    {
        instanceExists = true;
        move(5);
        checkCollision();

        //Removes object if instanceExists is false. Need to do it this way because if you try
        //to access the object's X position after it's deleted, for example, you get an error
        if(instanceExists == false){
            getWorld().removeObject(this);
        }
    }    
    
    public void move(int speed){
        //Checks if bullet went outside the window and deletes it if it is
        if(this.getX() >= getWorld().getWidth() - 20){
            instanceExists = false;
        }
        else{
            setLocation(getX() + speed, getY());
        }
    }
    
    public void checkCollision(){
        List<VictimBoat>targets = getIntersectingObjects(VictimBoat.class);
        
        if (targets.isEmpty() != true) {
            for (VictimBoat b : targets) {
                b.setHealth(b.getHealth() - 1);
            }            
            instanceExists = false;
        }
    }
}
