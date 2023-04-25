import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maggie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maggie extends Actor
{
    /**
     * Act - do whatever the Maggie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Nivel1 n1 = (Nivel1)getWorld();
        Actor ar = getOneIntersectingObject(Homero.class);
        if(ar != null){
            for(int i = 1; i<= 1;i++){
                n1.ataque2.sumar();
            }
            getWorld().removeObject(this);
        }
    }
}
