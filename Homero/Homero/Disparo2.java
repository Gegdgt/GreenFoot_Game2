import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.util.Iterator;

/**
 * Write a description of class Disparo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo2 extends Actor
{
    /**
     * Act - do whatever the Disparo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(getX()>=getWorld().getWidth()-5||(getX()<=5)){
            getWorld().removeObject(this);
            if (getWorld() == null) return;
        }
        else{
            if(getY()>=getWorld().getHeight()-5||(getY()<=5)){
                getWorld().removeObject(this);
                if (getWorld() == null) return;
            }
        }
        move(5);
        Actor Roca=getOneObjectAtOffset(0,0,Roca.class);//Hacerlo con bart
        Actor Bart=getOneObjectAtOffset(0,0,Bart.class);
        if(Roca != null){
            Nivel1 n1 = (Nivel1)getWorld();
            n1.maggie(1);
            getWorld().removeObject(Roca);
            n1.puntos.sumar();
            getWorld().removeObject(this);
            if (getWorld() == null) return;
        }
        else{
            if(Bart != null){
                Nivel1 n1 = (Nivel1)getWorld();
                n1.Vb.restar();
                n1.maggie(1);
                n1.Vb.restar();
                if(n1.Vb.Valor() == 0){
                    getWorld().removeObject(Bart);
                    if (getWorld() == null) return;
                    n1.vidas.sumar();
                    for(int i=0;i<=10;i++){
                        n1.puntos.sumar();
                    }
                    Greenfoot.setWorld(new Nivel2());
                }
            }
            if((getX() >= getWorld().getWidth()-10)||(getX() <= 10)){
                getWorld().removeObject(this);
                if (getWorld() == null) return;
            }
            else{
                if((getY() >= getWorld().getWidth()-10)||(getY() <= 10)){
                    getWorld().removeObject(this);
                    if (getWorld() == null) return;
                }
            }
        }
    }
}
