package triangulos;

import java.util.Scanner;

public class Triangulos {
    
    public static void main(String[] args) {
        int lado1;
        int lado2;
        int lado3;
        int area;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1º lado do triângulo: ");
        lado1 = scan.nextInt();
        System.out.print("Digite o 2º lado do triângulo: ");
        lado2 = scan.nextInt();
        System.out.print("Digite o 3º lado do triângulo: ");
        lado3 = scan.nextInt();

        if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
            System.out.println("O triângulo é escaleno");
            area = calcularArea(lado1, lado2, lado3);
            System.out.printf("Área = %d cm²", area);
        } else if (lado1 != lado2 || lado2 != lado3){
            System.out.println("O triângulo é isósceles");
            area = calcularArea(lado1, lado2, lado3);
            System.out.printf("Área = %d cm²", area);
        } else {
            System.out.println("O triângulo é equilátero");
            area = calcularArea(lado1);
            System.out.printf("Área = %d cm²", area);
        }

        scan.close();
        
    }

    public static int calcularArea(int lado) {
        int area = lado * lado * lado;
        return area;
    }

   
    public static int calcularArea(int lado1, int lado2, int lado3) {
        int area = lado1 * lado2 * lado3;
        return area;
    }
}
