import greenfoot.*;
import java.util.List;
/**
 * Write a description of class BlueShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueShip extends Ship
{
    public void addedToWorld(World world){
        this.setHealth(3);
    }
    /**
     * Act - do whatever the BlueShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 
    public void act() 
    {
        if(Greenfoot.isKeyDown("D")){setLocation(getX() + 5, getY());}
        if(Greenfoot.isKeyDown("W")){setLocation(getX(), getY() - 5);}
        if(Greenfoot.isKeyDown("A")){setLocation(getX() - 5, getY());}
        if(Greenfoot.isKeyDown("S")){setLocation(getX(), getY() + 5);}
        
        List<RedBullet>targets = getIntersectingObjects(RedBullet.class);
        
        if (targets.isEmpty() != true) {
            for (RedBullet b : targets) {
                setHealth(getHealth() - 1);
                System.out.println("Detected");
            }            
        }
        if(this.getHealth() == 0){
            getWorld().removeObject(this);
        }
        healthSprite("blue");
        System.out.println(getHealth());
    }    
}
