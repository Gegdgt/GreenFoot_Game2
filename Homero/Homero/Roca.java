import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*; //Libreria nueva
/**
 * Write a description of class Roca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roca extends Actor
{
    /**
     * Act - do whatever the Roca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-25);
        if(getX() >= getWorld().getWidth()-10 || getX()<= 10){
            getWorld().removeObject(this);
            if (getWorld() == null) return;
        }
        else{
            if(getY() >= getWorld().getHeight()-10 || getY() <= 10){
                getWorld().removeObject(this);
                if (getWorld() == null) return;
            }
        }
        Actor Homero = getOneObjectAtOffset(0,0,Homero.class);
        if (Homero != null){
            Nivel1 n1 = (Nivel1)getWorld();
            getWorld().removeObject(Homero);
            n1.objvida.Disminuir();
            getWorld().addObject(new Homero(), 50, 250);
            n1.vidas.restar();
            getWorld().removeObject(this);
            if (getWorld() == null) return;
        }
    }
}
