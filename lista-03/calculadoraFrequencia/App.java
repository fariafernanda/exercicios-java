package calculadoraFrequencia;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        String nome;
        String sobrenome;
        int dia;
        int mes;
        int ano;

        // Solicitando informações
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
        nome = scan.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = scan.nextLine();
        System.out.println("Informe a data de nascimento:");
        System.out.print("Dia: ");
        dia = scan.nextInt();
        System.out.print("Mês: ");
        mes = scan.nextInt();
        System.out.print("Ano: ");
        ano = scan.nextInt();

        // instanciando novo objeto:
        HeartRates pacienteZero = new HeartRates(nome, sobrenome, dia, mes, ano);
        
        // Exibindo informações básicas: 
        System.out.printf("Nome completo: %s %s \n", pacienteZero.getNome(), pacienteZero.getSobrenome());
        System.out.println("Data de nascimento: " + pacienteZero.exibirDataNascimento());
        System.out.printf("Idade: %d \n", pacienteZero.calcularIdade());

        // Relatório de Frequência Cardíaca:
        System.out.println("Frequência cardiáca máxima: " + pacienteZero.calcularFrequenciaMaxima());
        System.out.println("Intervalo de frequência cardíaca alvo: " + pacienteZero.calcularFrequenciaAlvo());
       
       
        scan.close();
    }
}
