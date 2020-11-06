package projeto_corona;

/**
 *
 * @author milena
 */
public class Hospital {
    private final Integer cor;
    private Integer x;
    private Integer y;

    public Hospital(Integer x, Integer y) {
        this.cor = 2;
        this.x = x;
        this.y = y;
    }

    public Integer getCor() {
        return cor;
    }

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
}
