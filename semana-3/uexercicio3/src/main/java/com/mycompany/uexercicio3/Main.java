package com.mycompany.uexercicio3;

public class Main {

    public static void main(String[] args) {
        Professor p = new Professor("Fulano", "Matemática");
        Aluno al = new Aluno("Milena", "12345", "Computação");
        Aluno al2 = new Aluno("Arr", "45342", "Computação");
        Disciplina disc = new Disciplina("CC3642", "POO");
        
        disc.setProfessor(p);
        disc.setAluno(al);
        disc.setAluno2(al2);
        
        System.out.println(disc);
    }
}
