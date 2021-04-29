package sample;

public class Main06 {
    public static void main(String[] args) {
        int[]idade = {28,34,53,32,34,23,56,76,23,26};
        int menorIdade = 120;

        for(int i=0; i<idade.length; i++){
            if(idade[i] < menorIdade)
                menorIdade = idade[i];
        }
        System.out.println("Menor Idade: "+menorIdade);
        int qntd = 0;

        for (int i=0; i<idade.length; i++) {
            if(idade[i] == menorIdade){
                qntd++;
            }
        }
        System.out.println("Quantidade de pessoas com a menor" +
                " idade: "+ qntd);
    }
}
