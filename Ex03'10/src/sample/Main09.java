package sample;

public class Main09 {
    public static void main(String[] args) {
        int []vA = {45,8,20,13,15};
        int []vB = {20,34,56,23,6};

        imprimirVetor(vA);
        imprimirVetor(vB);
        int []vC = new int[5];
        for(int i=0; i<vB.length; i++){
            if (vA[i] > vB[i]) {
                vC[i] = vA[i] - vB[i];
            }else if(vA[i] < vB[i]) {
                vC[i] = vB[i] - vA[i];
            }else {
                vC[i] = 0;
            }
            //vC[i] = vA[i]+vB[i];
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
