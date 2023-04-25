import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Puntaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntaje extends Actor
{
    /**
     * Act - do whatever the Puntaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    int cont;
    String mensaje;
    
    public void act()
    {
        
    } 
    public Puntaje(int a, String mens){
        cont = a; 
        mensaje = mens;
        imagen = new GreenfootImage(250,150);
        imagen.setColor(new Color(0, 0, 0, 255));
        imagen.setFont(new Font("Arial", true, false, 24));
        dibuja();
    }
    public void dibuja()
    {
        imagen.clear();
        imagen.drawString(mensaje+cont,20,20);
        setImage(imagen);
    }
    public void sumar(){
        cont++;
        dibuja();
    }
    public void restar(){
        cont--;
        dibuja();
    }
    public int Valor(){
        return cont;
    }
}
