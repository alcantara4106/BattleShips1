import greenfoot.*;
import java.util.List;
/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Ship extends Actor implements ShipActions
{
    private int health = 3;    
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public int getHealth(){
        return health;
    }
    public void setHealth(int newHealth){
        health = newHealth;
    }
    public void healthSprite(String name){
        setImage(name + this.getHealth() + ".png");
    }
    
}
