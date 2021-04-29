package sample;

public class Main03 {

    public static void main(String[] args) {

        imprimir1_100();

    }

    public static void imprimir1_100() {

        for( int i = 1; i<=100; i++) {

            System.out.print(i + " ");

        }
        imprimir101_200();
    }

    public static void imprimir101_200() {

        for( int i = 101; i<=200; i++) {

            System.out.print(i + " ");
        }
        imprimir201_300();
    }

    public static void imprimir201_300() {

        for( int i = 201; i<=300; i++) {

            System.out.print(i + " ");
        }
    }

}
