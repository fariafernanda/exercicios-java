package maximoMinimo;

import java.util.Scanner;

public class CalculaMaximoMinimo {

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        num1 = scan.nextInt();
        System.out.print("Digite o 2º número: ");
        num2 = scan.nextInt();
        System.out.print("Digite o 3º número: ");
        num3 = scan.nextInt();

        scan.close();

        int maximo = calculaMaximo(num1, num2, num3);
        int minimo = calculaMinimo(num1, num2, num3);

        System.out.printf("O maior valor digitado foi: %d%n", maximo);
        System.out.printf("O menor valor digitado foi: %d%n", minimo);
        
    }

    public static int calculaMaximo(int n1, int n2, int n3){
        int valorMaximo = n1;
    
        if (n2 > valorMaximo){
            valorMaximo = n2;
        }
    
        if (n3 > valorMaximo){
            valorMaximo = n3;
        }
        
        return valorMaximo;
    }

    public static int calculaMinimo(int n1, int n2, int n3) {
        int valorMinimo = n1;
        
        if(n2<valorMinimo){
            valorMinimo = n2;
        }

        if(n3 < valorMinimo){
            valorMinimo = n3;
        }

        return valorMinimo;
    }

}

