package baralhoDeCartas;

public class AppBaralho {
    
    public static void main(String[] args) {
        
        Baralho novoBaralho = new Baralho();
        novoBaralho.embaralha();

        for(int i = 0; i < 52; i++){
            System.out.printf("%-19s", novoBaralho.distribuirCarta());
            
            if(i % 3 == 0){
                System.out.println();
            }
        }
    }
}
