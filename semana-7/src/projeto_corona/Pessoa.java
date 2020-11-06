package projeto_corona;

/**
 *
 * @author milena
 */
public abstract class Pessoa {
    private Integer x;
    private Integer y;
    private Integer cor;
    
    public abstract void mover();

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getCor() {
        return cor;
    }

    public void setCor(Integer cor) {
        this.cor = cor;
    }
}
