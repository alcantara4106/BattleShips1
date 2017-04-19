import greenfoot.*;

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
        if(this.getX() >= getWorld().getWidth() - 20){
            getWorld().removeObject(this);
            //System.out.println("dis bullet deid");
        }
        else{
            setLocation(getX() + 10, getY());
        }
    }    
}
