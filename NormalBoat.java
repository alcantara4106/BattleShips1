import greenfoot.*;
/**
 * Write a description of class NormalBoat here.
 * 
 * @author Ethan Alcantara 
 * @version v1.0 4/17/17
 */
public class NormalBoat extends Ship
{
    public void act(){
        if(Greenfoot.isKeyDown("right")){setLocation(getX() + 5, getY());}
        if(Greenfoot.isKeyDown("left")){setLocation(getX() - 5, getY());}
        if(Greenfoot.isKeyDown("space")){
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet,getX()+100,getY());
        }
    }
}
