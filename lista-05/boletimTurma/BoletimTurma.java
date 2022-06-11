import java.util.Scanner;

public class BoletimTurma {
    
    public static void main(String[] args) {
        
        int total=0;
        int contadorNotas=0;
        int notasA=0;
        int notasB=0;
        int notasC=0;
        int notasD=0;
        int notasF=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Nota: ");

        while(scan.hasNext()){
            System.out.print("Nota: ");
            int nota = scan.nextInt();

            total = total + nota;
            contadorNotas++;

            switch(nota){
                case 10:
                    notasA++;
                    break;
                case 9:
                    notasA++;
                    break;
                case 8:
                    notasB++;
                    break;
                case 7:
                    notasC++;
                    break;
                case 6:
                    notasD++;
                    break;
                default:
                    notasF++;
                    break;
            }
        }

        System.out.println("=== Relatório de Notas === ");

        if (contadorNotas != 0){

            double media = total / contadorNotas;
            System.out.printf("Média da turma: %.1f%n", media);

            System.out.printf("A: %s%n", notasA);
            System.out.printf("B: %s%n", notasB);
            System.out.printf("C: %s%n", notasC);
            System.out.printf("D: %s%n", notasD);
            System.out.printf("F: %s%n", notasF);
        } else {
            System.out.println("Nenhuma nota foi inserida!");
        }  

        scan.close();
    }
}
