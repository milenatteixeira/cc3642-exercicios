package com.mycompany.exercicio4;

/**
 *
 * @author milena
 */
public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")\nxSpeed = " + xSpeed + "\nySpeed = " + ySpeed;
    }
    
    @Override
    public void moveUp(){
        y = y - ySpeed;
    }
    
    @Override
    public void moveDown(){
        y = y + ySpeed;
    }
    
    @Override
    public void moveLeft(){
        x = x - xSpeed;
    }
    
    @Override
    public void moveRight(){
        x = x + xSpeed;
    }
}
