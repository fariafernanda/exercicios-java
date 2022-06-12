package diarioClasse;

import java.util.Arrays;

public class DiarioDeClasse {
    
    private String nomeCurso;
    private double[] notas;
    private String[] nomes;
  


    

    public void processarNotas(){
       
        exibirNotas();
        System.out.printf("Média da turma: %.2f%n", calculaMedia());
        System.out.printf("Maior nota: %.2f%n", calculaMaiorNota());
        System.out.printf("Menor nota: %.2f%n", calculaMenorNota());
    }
   

    public DiarioDeClasse(String nomeCurso, double[] notas, String[] nomes) {
        this.nomeCurso = nomeCurso;
        this.notas = notas;
        this.nomes = nomes;
        
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    // Exibe a nota de cada aluno
    public void exibirNotas(){
        System.out.println("Notas: ");

        for (int i=0; i < notas.length; i++){
            System.out.printf("Aluno %d: %s - %.2f%n", i+1, nomes[i], notas[i]);
        }
    }

    public double calculaMedia(){
        double total = 0;
        

        for (double nota : notas) {
            total = total + nota;
        }

        double media = total / notas.length;
        return media;
    }

    public double calculaMaiorNota(){
        double maiorNota = notas[0];

        for (double nota : notas) {
            if (nota > maiorNota){
                maiorNota = nota;
            }
           
        }

        return maiorNota;
    }

    public double calculaMenorNota(){
        double menorNota = notas[0];

        for (double nota : notas) {
            if (nota < menorNota){
                menorNota = nota;
            }
           
        }

        return menorNota;
    }


    @Override
    public String toString() {
        return "Diario de Classe \nCurso: " + nomeCurso + "\nNotas: " + Arrays.toString(notas);
    }

  

    
    
    
}
