package projeto_corona;

import java.util.Random;

/**
 *
 * @author milena
 */
public class PessoaSaudavel extends Pessoa{

    public PessoaSaudavel(Integer x, Integer y) {
        setX(x);
        setY(y);
        setCor(3);
    }
    
    @Override
    public void mover(){
        Random x = new Random();
        Integer movimentacao = x.nextInt(4);        
        Integer numX = getX();
        Integer numY = getY();
        switch(movimentacao){
            case 0:
                if(numX==28){
                    numX = 1;
                }else{
                    numX = numX + 1;
                }
                setX(numX);
                break;
            case 1:
                if(numX==0 || numX==1){
                    numX = 28;
                }else{
                    numX = numX - 1;
                }                
                setX(numX);
                break;
            case 2:
                if(numY==58){
                    numY = 1;
                }else{
                    numY = numY + 1;
                }                
                setY(numY);
                break;
            case 3:
                if(numY==0 || numY==1){
                    numY = 58;
                }else{
                    numY = numY - 1;
                }                
                setY(numY);
                break;
            default:
                break;
        }
    }
}
