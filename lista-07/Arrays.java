public class Arrays {

    public static void main(String[] args) {
        
        // Array com 10 números pares:
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        

        System.out.printf("Índice %8s%n", "Valor");
        for(int i=0; i< array.length; i++){
            array[i] = 2 + 2 * i;
            System.out.printf("%3d %10d%n", i, array[i]);
        }

       // Soma de números de um Array
        int[] arraySoma = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        for (int i = 0; i < arraySoma.length; i++){
            total = total + arraySoma[i];
        }

        System.out.println("Soma dos valores do array: " + total);
    }
}