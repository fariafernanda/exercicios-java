import java.util.Scanner;

public class MediaTurma {

    public static void main(String[] args) {
        double total = 0;
        int contador = 1;
        Scanner scan = new Scanner(System.in);

        while(contador<=10){
            System.out.println("Digite a nota: ");
            int nota = scan.nextInt();

            total = total + nota;
            contador++;
        }

        double media = total / 10;

        System.out.println("Total das notas: " + total);
        System.out.println("Méida da turma: " + media);

        scan.close();
    }
}