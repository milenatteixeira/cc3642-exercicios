package projeto_corona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("BEM VINDO!\n\nDigite a quantidade de pessoas"
                + " saudáveis que queira simular: ");
        Integer x = input.nextInt();
        
        Mundo mundo = new Mundo(x);
        
        while(true){
            mundo.desenhaMundo();
            mundo.conta();
            
            try{
                Thread.sleep(300);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
