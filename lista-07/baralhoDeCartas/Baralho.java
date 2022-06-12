package baralhoDeCartas;

import java.security.SecureRandom;

public class Baralho {

    private Carta[] baralho;
    private int cartaAtual;
    private static final int NUMERO_DE_CARTAS = 52;

    private static final SecureRandom numeroAleatorio = new SecureRandom();

    public Baralho(){
        
        String[] faces = {"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};
        String[] naipes = {"Ouro", "Copas", "Paus", "Espadas"};

        baralho = new Carta[NUMERO_DE_CARTAS];
        cartaAtual = 0;

        // preenche baralho com cartas:
        for (int i=0; i < baralho.length; i++){
            baralho[i] = new Carta(faces[ i % 13], naipes[i/13]);
        }
    }

    // embaralha as cartas:

    public void embaralha(){

        cartaAtual = 0;

        for (int first = 0; first < baralho.length; first ++){

            int second = numeroAleatorio.nextInt(NUMERO_DE_CARTAS);

            Carta temporaria = baralho[first];
            baralho[first] = baralho[second];
            baralho[second] = temporaria;
        }
    }

    // distribui uma carta:

    public Carta distribuirCarta(){
        if (cartaAtual < baralho.length){
            return baralho[cartaAtual++];
        } else {
            return null;
        }
    }
}
