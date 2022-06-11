/**Uma pessoa investe US$ 1.000 em uma conta-poupança que rende juros de 5% ao ano. Supondo que todo
o juro seja aplicado, calcule e imprima a quantia de dinheiro na conta no fim de cada ano por 10 anos.
Utilize a seguinte fórmula para determinar as quantidades:
 a = p (1 + r)n
onde
 p é a quantia original investida 
 r é a taxa de juros anual 
 n é o número de anos
 a é a quantia em depósito no fim do n-ésimo ano
 * 
 */

public class JurosCompostos {

    public static void main(String[] args) {
        
        double capitalInicial = 1000.0;
        double jurosAno = 0.05;
        double montante;

        System.out.printf("%s%20s %n", "Anos", "Montante");

        for(int i = 1; i <= 10; i++){

            montante = capitalInicial * Math.pow(1.0 + jurosAno, i);
            System.out.printf("%4d%,20.2f%n", i, montante);
        }

    }
}