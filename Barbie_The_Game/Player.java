import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.World;

public class Player extends Actor
{
    private int velocidade=5;
    private int vidas, contImag;
    public int tamanho=10;
    private String key=Greenfoot.getKey();
   
    public Player()
    {
        vidas=3;
    }
    
    public Player (int vidas)
    {
        this.vidas=vidas;
    }
    
    public void mover(String botao1, String botao2, String botao3, String botao4,GreenfootImage[] esquerda, GreenfootImage[] direita,GreenfootImage[] repouso )
    {
        int x=getX();
        int y=getY();
        
        //mover para a esquerda
        if(Greenfoot.isKeyDown (botao1))
        {
            move(-velocidade);
            //setLocation(x-velocidade, y);
            animacao(esquerda);
            
        }
        // mover para cima
        else if(Greenfoot.isKeyDown (botao2))
        {
            //move(velocidade);
            setLocation(x, y-velocidade);
            animacao(esquerda);
            
        }
        //mover para baixo
        else if(Greenfoot.isKeyDown (botao3))
        {
            //move(velocidade);
            setLocation(x, y+velocidade);
            animacao(direita);
            
        }
        //mover para a direita
        else if(Greenfoot.isKeyDown (botao4))
        {
            move(velocidade);
            //setLocation(x+velocidade, y);
            animacao(direita);
            
        }
        //if(key==null){
        else 
        {
            setImage(repouso[0]);
        }
    }
    //sequencia de animações andar/morte
    public void animacao(GreenfootImage[] seqImagens){
        contImag++;
        Greenfoot.delay(2);
        if(contImag>9){
            contImag=0;
        }
        setImage(seqImagens[contImag]);
    }
    //mudar o tamanho da sequencia de imagens de animações
    public void escala(GreenfootImage[] seqImaTam){
        for(int i=0;i< seqImaTam.length ;i++){
            seqImaTam[i].scale(seqImaTam[i].getWidth()/tamanho,seqImaTam[i].getHeight()/tamanho);
            setImage(seqImaTam[i]);
        }
    }
}
