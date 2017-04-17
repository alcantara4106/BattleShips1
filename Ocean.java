import greenfoot.*;

/**
 * Write a description of class Ocean here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ocean extends World
{

    /**
     * Constructor for objects of class Ocean.
     * 
     */
    public Ocean()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Hboom hboom = new Hboom();
        addObject(hboom, 666, 433);
        Hboom hboom2 = new Hboom();
        addObject(hboom2, 508, 490);
        Vboom vboom = new Vboom();
        addObject(vboom, 460, 566);
        Vboom vboom2 = new Vboom();
        addObject(vboom2, 169, 29);
        Hboom hboom3 = new Hboom();
        addObject(hboom3, 41, 152);
    }
}
