import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class BadEnding extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public BadEnding() 
    {
        super(906, 501, 1);
    }
    public void act(){//permite que el jugador pueda seleccionar las opciones del menu
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            Greenfoot.setWorld(new Nivel1());
        }
    }
}
