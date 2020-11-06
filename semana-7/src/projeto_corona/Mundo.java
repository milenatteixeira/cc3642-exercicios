package projeto_corona;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author milena
 */
public class Mundo {
    private ArrayList<Hospital> hospitais = new ArrayList<>();
    private ArrayList<PessoaSaudavel> pessoasSaudaveis = new ArrayList<>();
    private ArrayList<PessoaDoente> pessoasDoentes = new ArrayList<>();
    private Virus virus = new Virus();
    double contador = 0;
    Integer contador2 = 0;
    Integer tempo = 0;
    
    public void conta(){
        contador += 0.3;
        contador2 = (int)contador;
    }
    
    public Integer mapa[][]={
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };

    public Mundo(Integer quantidade) {
        setHospitais();
        setPessoasSaudaveis(quantidade);
        setPessoasDoentes();
    }

    public void setHospitais() {
        hospitais.add(new Hospital(2, 9));
        hospitais.add(new Hospital(10, 30));
        hospitais.add(new Hospital(20, 40));
        hospitais.forEach(hospital -> {
            for(int i = hospital.getX(); i < hospital.getX()+5; i++){
                for(int j = hospital.getY(); j < hospital.getY()+7; j++){
                    mapa[i][j] = hospital.getCor();
                }
            }
        });
    }
    
    public void setPessoasDoentes() {
        Random randomX = new Random();
        Random randomY = new Random();
        
        Integer x = randomX.nextInt(30);
        Integer y = randomY.nextInt(60);
            
        if(x==0){
            x = 28;
        }else if(x==29){
            x = 1;
        }
        
        if(y==0){
            y = 58;
        }else if(y==59){
            y = 1;
        }
        pessoasDoentes.add(new PessoaDoente(x,y,virus));
        pessoasDoentes.forEach(pessoaDoente -> {
            Integer outroX = pessoaDoente.getX();
            Integer outroY = pessoaDoente.getY();
            mapa[outroX][outroY] = pessoaDoente.getCor();
        });
    }
    
    public void setPessoasSaudaveis(Integer quantidade) {
        Random randomX = new Random();
        Random randomY = new Random();
        for(int i = 0; i < quantidade; i++){
            Integer x = randomX.nextInt(30);
            Integer y = randomY.nextInt(60);
            
            if(x==0){
                x = 28;
            }else if(x==29){
                x = 1;
            }
            
            if(y==0){
                y = 58;
            }else if(y==59){
                y = 1;
            }
            pessoasSaudaveis.add(new PessoaSaudavel(x,y));            
        }
        pessoasSaudaveis.forEach(pessoaSaudavel -> {
            Integer x = pessoaSaudavel.getX();
            Integer y = pessoaSaudavel.getY();
            mapa[x][y] = pessoaSaudavel.getCor();
        });
    }
    
    public void movimentacaoDoentes(){        
        pessoasDoentes.forEach(pessoaDoente -> {
            Integer x = pessoaDoente.getX();
            Integer y = pessoaDoente.getY();
            if(isInHospital(x, y)){
                mapa[x][y] = 2;
            }else{
                mapa[x][y] = 0;
            }            
            
            pessoaDoente.mover();
            
            if(pessoaDoente.getX()==0){
                pessoaDoente.setX(28);
            }else if(pessoaDoente.getX()==29){
                pessoaDoente.setX(1);
            }
            
            if(pessoaDoente.getY()==0){
                pessoaDoente.setY(28);
            }else if(pessoaDoente.getY()==29){
                pessoaDoente.setY(1);
            }
            
            x = pessoaDoente.getX();
            y = pessoaDoente.getY();
            mapa[x][y] = pessoaDoente.getCor();
        });
    }
    
    public void movimentacaoSaudaveis(){        
        pessoasSaudaveis.forEach(pessoaSaudavel -> {
            Integer x = pessoaSaudavel.getX();            
            Integer y = pessoaSaudavel.getY();
            
            if(isInHospital(x, y)){
                mapa[x][y] = 2;
            }else{
                mapa[x][y] = 0;
            }
            
            pessoaSaudavel.mover();
            
            if(pessoaSaudavel.getX()==0){
                pessoaSaudavel.setX(28);
            }else if(pessoaSaudavel.getX()==29){
                pessoaSaudavel.setX(1);
            }
            
            if(pessoaSaudavel.getY()==0){
                pessoaSaudavel.setY(28);
            }else if(pessoaSaudavel.getY()==29){
                pessoaSaudavel.setY(1);
            }
            
            x = pessoaSaudavel.getX();            
            y = pessoaSaudavel.getY();
            mapa[x][y] = pessoaSaudavel.getCor();
        });
    }

    public void desenhaMundo(){
        Integer qtdSaudaveis = pessoasSaudaveis.size();
        Integer qtdDoentes = pessoasDoentes.size();
        System.out.printf("\n\nTempo de execução: %d\n",contador2);
        System.out.printf("Total de pessoas: %d\n", qtdSaudaveis+qtdDoentes);
        System.out.printf("Pessoas saudáveis: %d\n", qtdSaudaveis);
        System.out.printf("Pessoas doentes: %d\n\n", qtdDoentes);
                       
        for(int i = 0; i < 30; i++){
            for(int j = 0; j < 60; j++){
                Integer valor = mapa[i][j];
                
                switch(valor){
                    case 0:
                        System.out.print("\033[40m \033[0m");
                        break;
                    case 1:
                        System.out.print("\033[47m \033[0m");
                        break;
                    case 2:
                        System.out.print("\033[45m \033[0m");
                        break;
                    case 3:
                        System.out.print("\033[42m \033[0m");
                        break;
                    case 4:
                        System.out.print("\033[43m \033[0m");
                        break;
                }
            }System.out.println();
        }
        
        mata();        
        cura();
        infecta();
        movimentacaoDoentes();
        movimentacaoSaudaveis();
    }
    
    public boolean isInHospital(Integer xx, Integer y){
        Integer controlador = 0;
        for(int x = 0; x < hospitais.size(); x++){
            for(int i = hospitais.get(x).getX(); i < hospitais.get(x).getX()+5; i++){
                for(int j = hospitais.get(x).getY(); j < hospitais.get(x).getY()+7; j++){
                    if(i==xx && j==y){                        
                        controlador = 1;
                    }
                }
            }
        }
        return controlador==1;
    }
    
    public void infecta(){
        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa.length * 2; j++){
                if(mapa[i][j]==4){
                    Integer direita = i+1;
                    Integer esquerda = i-1;
                    Integer cima = j+1;
                    Integer baixo = j-1;
                    
                    infectar(direita, j);
                    infectar(esquerda, j);
                    infectar(i, cima);
                    infectar(i, baixo);
                }
            }
            
        }
    }
    
    public void infectar(Integer x, Integer y){
        if(mapa[x][y]==3){
            for(int i = 0; i < pessoasSaudaveis.size(); i++){
                if(pessoasSaudaveis.get(i).getX()==x && 
                        pessoasSaudaveis.get(i).getY()==y){
                    pessoasDoentes.add(new PessoaDoente(x, y, virus));
                    pessoasSaudaveis.remove(pessoasSaudaveis.get(i));
                }
            }
        }
    }
    
    public void cura(){
        for (int i = 0; i < pessoasDoentes.size(); i++) {
            Integer x = pessoasDoentes.get(i).getX();
            Integer y = pessoasDoentes.get(i).getY();
            
            if(isInHospital(x, y)){
                pessoasSaudaveis.add(new PessoaSaudavel(x, y));
                pessoasDoentes.remove(pessoasDoentes.get(i));
            }
        }
    }
    
    public void mata(){                
        for(int i = 0; i < pessoasDoentes.size(); i++){            
            pessoasDoentes.get(i).setTempo(pessoasDoentes.get(i).getTempo()+tempo);
            if(pessoasDoentes.get(i).getTempo()==30){
                pessoasDoentes.remove(i);
            }
        }
        tempo += (int)0.3;
    }    
    
    public ArrayList<PessoaDoente> getPessoasDoentes(){return pessoasDoentes;}
    public ArrayList<PessoaSaudavel> getPessoasSaudaveis(){return pessoasSaudaveis;}
    public ArrayList<Hospital> getHospitais(){return hospitais;}        
}
