package projeto_corona;

import java.util.Random;

/**
 *
 * @author milena
 */
public class PessoaDoente extends Pessoa{
    private Virus virus;
    private Integer tempo;
    
    public PessoaDoente(Integer x, Integer y, Virus virus) {
        setX(x);
        setY(y);
        setCor(4);
        setTempo(0);
        this.virus = virus;
        virus.setInfected(true);
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }
    
    @Override
    public void mover(){
        Random x = new Random();
        Integer movimentacao = x.nextInt(4);        
        Integer numX = getX();
        Integer numY = getX();
        
        switch(movimentacao){
            case 0:
                numX = numX + 1;
                setX(numX);
                break;
            case 1:
                numX = numX - 1;
                setX(numX);
                break;
            case 2:
                numY = numY + 1;
                setY(numY);
                break;
            case 3:
                numY = numY - 1;
                setY(numY);
                break;
            default:
                break;
        }
    }
}
