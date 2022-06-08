
public class EstudanteTeste {
    public static void main(String[] args) {
        
        // instanciando um novo estudante:
        Estudante mariana = new Estudante("Mariana", 85);

        System.out.printf("O conceito de %s foi %s.%n", mariana.getNome(), mariana.gerarBoletim());

    }
}
