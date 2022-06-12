package diarioClasse;

import java.util.Arrays;

public class App {
    
    public static void main(String[] args) {
        
        // Cadastrar 5 alunos:
        Aluno maria = new Aluno("Maria", 9.0);
        Aluno joao = new Aluno("João", 8.5);
        Aluno thales = new Aluno("Thales", 6.2);
        Aluno dayana = new Aluno("Dayana", 10);
        Aluno joana = new Aluno("Joana", 3.9);

        Aluno[] alunos = {maria, joao, thales, dayana, joana};
        double[] notas = new double[5];
        String[] nomes = new String[5];

       
        for(int i=0; i<alunos.length;i++){
             notas[i] = alunos[i].getNota();
             nomes[i] = alunos[i].getNome();
        }

   
       System.out.println(Arrays.toString(notas));

       DiarioDeClasse classeA = new DiarioDeClasse("Ecologia Vegetal", notas, nomes);

       System.out.println(classeA);
       classeA.processarNotas();

    }

}
