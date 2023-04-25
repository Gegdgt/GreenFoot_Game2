import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*; //Libreria nueva
/**
 * Write a description of class Dona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dona extends Actor
{
    /**
     * Act - do whatever the Dona wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-20);
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
            n1.puntos.sumar();
            getWorld().removeObject(this);
            if (getWorld() == null) return;
        }
    }
}
