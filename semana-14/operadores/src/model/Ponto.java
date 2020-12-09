package model;

/**
 *
 * @author milena
 */
public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public Ponto soma(Ponto outro){
        return new Ponto(this.x+outro.x, this.y+outro.y);
    }

    @Override
    public String toString() {
        return "\n--Ponto--" + "\n(" + x + ", " + y + ")";
    }
    
    
}
