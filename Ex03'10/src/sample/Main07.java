package sample;

public class Main07 {
    public static void main(String[] args) {
        char []g = {'a','a','a','a','a','b','b','b','b','b'};
        char []r = {'a','a','a','a','a','c','c','c','c','b'};

        int acertos = 0;
        for(int i=0; i<g.length; i++){
            if(g[i] != r[i])//errou
                System.out.println("Errou a questão: " + (i+1));
            else //acertou
                acertos++;
        }
        if(acertos >= 6)
            System.out.println("Aprovado com "+acertos+" acertos");
        else
            System.out.println("Reprovado com "+acertos+" acertos");
    }
}
