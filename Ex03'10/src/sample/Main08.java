package sample;

public class Main08 {
    public static void main(String[] args) {
        int []vA = {45,8,20,13,15,9,10,8,51,14};
        int []vB = new int[5];
        int j=0;
        for(int i=0; i<vA.length; i++){
            if(i %2== 0){ //se a posição for par
                vB[j] = vA[i];
                j++;
            }
        }
        imprimirVetor(vA);
        imprimirVetor(vB);
        int []vC = new int[5];
        for(int i=0; i<vB.length; i++){
            vC[i] = vA[i]+vB[i];
        }
        imprimirVetor(vC);
    }


    public static void imprimirVetor(int []a){
        for (int i = 0; i <a.length; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}

