package sample;

public class Main05 {
    public static void main(String[] args) {

        int []vet1 = {10,20,30,40,50};
        int[]vet2 = new int[5];

        for(int i=0, j=4; i<vet1.length; i++, j--){
            vet2[i] = vet1[i];
        }

        imprimirVetor(vet1);
        imprimirVetor(vet2);

    }
    public static void imprimirVetor(int []a){
        for (int i = 0; i <a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
