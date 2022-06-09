/** Uma faculdade oferece um curso que prepara os candidatos a obter licença estadual para corretores de imóveis.
No ano passado, dez alunos que concluíram esse curso prestaram o exame. 
A universidade quer saber como foi o desempenho dos seus alunos nesse exame. 
Você foi contratado para escrever um programa que resuma os resultados. 
Para tanto, você recebeu uma lista desses 10 alunos. Ao lado de cada nome é escrito 1 se o aluno passou
no exame ou 2 se o aluno foi reprovado. 
Seu programa deve analisar os resultados do exame assim:
 1. Dê entrada a cada resultado do teste (isto é, um 1 ou um 2). Exiba a mensagem “Inserir resultado” na tela
toda vez que o programa solicitar o resultado de outro teste.
 2. Conte o número de cada tipo de resultado.
 3. Exiba um resumo dos resultados do teste indicando o número de alunos aprovados e reprovados.
 4. Se mais de oito estudantes forem aprovados no exame, imprima “Bonus to instructor!”.
 */

import java.util.Scanner;

public class AnaliseTurma {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        int aprovados = 0;
        int reprovados = 0;

        while(contador<10){
            System.out.println("Inserir resultado do aluno " + (contador + 1) + ": ");
            int option = scan.nextInt();
            

            if(option == 1 || option == 2){
                if(option == 1){
                    aprovados = aprovados + 1;
                    contador++;
                } else {
                    reprovados = reprovados + 1;
                    contador++;
                }
            } else {
                System.out.println("Opção inválida!");
            }
               
           
           
        }

        System.out.printf("Resumo do teste: %n Aprovados: %d alunos %n Reprovados: %d alunos", aprovados, reprovados);

        if(aprovados>8){
            System.out.println("Parabéns! Bônus para o instrutor!");
        }

        scan.close();
    }
    
}
