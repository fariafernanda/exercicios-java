package healthProfile;
import java.util.Scanner;

public class HealthProfilTest {
    
    public static void main(String[] args) {
        String nome;
        String sobrenome;
        int dia;
        int mes;
        int ano;
        Double peso;
        Double altura;

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
        System.out.print("Peso: ");
        peso = scan.nextDouble();
        System.out.print("Altura: ");
        altura = scan.nextDouble();

        HealthProfile pacienteZero = new HealthProfile(nome, sobrenome, dia, mes, ano, altura, peso);

        
        HealthProfile.gerarRelatorioSaude(pacienteZero);

        scan.close();
    }   
    
}
