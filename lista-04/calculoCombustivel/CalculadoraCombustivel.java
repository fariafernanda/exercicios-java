import java.util.Scanner;

/**
 *  O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem
total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens
 */
public class CalculadoraCombustivel {
    
    static int contadorViagens = 0;
    static double totalLitrosConsumidos = 0;
    static double totalKmPercorridos = 0;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double quilometragem;
        double litros;
        String viagem;        
        double consumoCombustivel;
        

        System.out.println("CALCULADORA DE COMBUSTÍVEL \n Digite 1 para cadastrar uma nova viagem \n Digite 0 para sair da calculadora");
        int option = scan.nextInt();

        while(option == 1) {
            System.out.println("Destino da viagem: ");
            viagem = scan.nextLine();
            scan.nextLine();

            System.out.print("Quilometragem percorrida: ");
            quilometragem = scan.nextInt();
            totalKmPercorridos = totalKmPercorridos + quilometragem;

            System.out.print("Litros de combustível consumidos: ");
            litros = scan.nextInt();

            consumoCombustivel = quilometragem / litros;
            System.out.printf("O consumo de combustível da viagem até %s foi de %.2f km/l %n", viagem, consumoCombustivel);

            totalLitrosConsumidos = totalLitrosConsumidos + litros;
            contadorViagens++;

            System.out.println("\n Deseja cadastrar outra viagem? \n 1. SIM    2. NÃO");
            int opcaoContinuar = scan.nextInt();

            if(opcaoContinuar == 2){
                
                exibirRelatorioViagens();
                break;
            } 
        }

        scan.close();
    }

    public static void exibirRelatorioViagens(){
        double consumoMedio = totalKmPercorridos/totalLitrosConsumidos;

        
        if(contadorViagens == 1){
            System.out.println("\nVocê fez 1 viagem!");
        } else {
            System.out.printf("\nVocê fez %d viagens! %n", contadorViagens);
        }
        
        System.out.printf("Ao todo, você percorreu %.2f km e gastou um total de %.1f litros de combustível %n",
         totalKmPercorridos, totalLitrosConsumidos);

        System.out.printf("O consumo médio de combustível foi de %.1f km/l", consumoMedio);
    }
}
