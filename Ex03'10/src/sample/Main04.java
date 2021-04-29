package sample;

public class Main04 {

    public static void main(String[] args) {

        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {1, 2, 3, 4, 5};
        int[] resultado = new int[5];


        for (int i = 0; i <v1.length; i++){
            resultado[i] = v1[i] + v2[i];
        }

        imprimirVetor(v1);
        imprimirVetor(v2);
        imprimirVetor(resultado);


    }

    public static void imprimirVetor(int []a){
        for (int i = 0; i <a.length; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}
