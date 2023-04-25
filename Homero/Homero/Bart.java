import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bart extends Actor
{
    boolean disparo = false;
    boolean donas = false;
    int cont = 0;
    int cont2 = 0;
    int altura = 10;
    boolean sigue = false;
    /**
     * Act - do whatever the Bart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /**int mover = Greenfoot.getRandomNumber(4);
        if(mover == 1 || mover == 3){
            setLocation(getX(), getY()+10);
        }
        else{
            if(mover == 2 || mover == 4)
            {
                setLocation(getX(), getY()-10);
            }
        }*/
        if(getY() >= 50 && !sigue){
            altura = -10;
        }
        else{
            sigue = true;
        }
        if(getY() <= getWorld().getHeight()-50 && sigue){
            altura = 10;
        }
        else{
            sigue = false;
        }
        setLocation(getX(), getY()+ altura);
        
        cont++;
        if (cont == 51){
            cont = 1;
        }
        if(disparo && cont == 50){
            Roca ro = new Roca();
            getWorld().addObject(ro, getX(), getY());
            disparo = false;
        }
        if(!disparo && cont != 50){
            disparo = true;
        }
        cont2++;
        if (cont2 == 40){
            cont2 = 1;
        }
        if(disparo && cont2 == 37){
            Dona da = new Dona();
            getWorld().addObject(da, getX(), getY());
            donas = false;
        }
        if(!disparo && cont2 != 37){
            donas = true;
        }
        destruir();
    }
    public void destruir(){
        Homero ho = (Homero)getOneIntersectingObject(Homero.class);
        if(ho != null){
            Nivel1 n1 = (Nivel1)getWorld();
            n1.removeObject(ho);
            n1.addObject(new Homero(), 50, 250);
            n1.vidas.restar();
        }
    }
}
