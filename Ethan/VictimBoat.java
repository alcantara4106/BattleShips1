import greenfoot.*;
import java.util.List;
/**
 * Write a description of class VictimBoat here.
 * 
 * @author Ethan Alcantara 
 * @version v1.0 4/17/17
 */
public class VictimBoat extends Ship
{
    public int health = 3;

    public void act(){
        /*
        List<Bullet>targets = getObjectsInRange(50,Bullet.class);
         //The above line checks if any objects are in a 50 pixel radius. The boats are about
         //100 x 100 so 50 should be work (only detects the center of the sprite, not the
         //edges)
        for(Bullet bullet:targets){
            this.setHealth(this.getHealth() - 1); //Removes 1 health point
        }
        if(this.getHealth() <= 0){
            getWorld().removeObject(this);
        }*/
        
        //setImage("victimboat" + this.getHealth() + ".png");
        if(this.getHealth() == 3){
            setImage("victimboat.png");
        }
        if(this.getHealth() == 2){
            setImage("victimboat2.png");
        }
        if(this.getHealth() == 1){
            setImage("victimboat3.png");
        }
        if(this.getHealth() == 0){
            getWorld().removeObject(this);
        }
        
    }   
}
