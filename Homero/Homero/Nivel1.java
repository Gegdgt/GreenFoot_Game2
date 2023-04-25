import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)
import java.util.*; //Libreria nueva
public class Nivel1 extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public vida objvida; 
    Puntaje puntos;
    Puntaje vidas;
    Puntaje ataque2;
    VidaBart Vb; 
    public Nivel1() 
    {
        super(906, 501, 1);
        setPaintOrder(Fin.class, Puntaje.class, Roca.class, Homero.class);        
        Homero ho = new Homero();
        addObject(ho, 50, 250);
        Bart ba = new Bart();
        addObject(ba, 865, Greenfoot.getRandomNumber(getHeight()));
        Vb = new VidaBart(100, 0, 0, 30);
        addObject(Vb, 800,80);
        objvida = new vida();
        puntos = new Puntaje(0, "Puntos: ");
        vidas = new Puntaje(5, "Vidas: ");
        ataque2= new Puntaje(0, "Poder: ");
        addObject(puntos, 150, 80);
        addObject(vidas, 300, 80);
        addObject(ataque2, 450, 80);
        //addObject(Vb, 700, 85);
        maggie(1);
    }
    public void maggie(int num){
        for(int i = 0;i < num; i++)
        {
            Maggie ma = new Maggie();
            int DirX = Greenfoot.getRandomNumber(getWidth()-100);
            int DirY = Greenfoot.getRandomNumber(getHeight());
            int mag = Greenfoot.getRandomNumber(20);
            if(mag == 7){
                addObject(ma,DirX,DirY);
            }
        }
    }
    
}
