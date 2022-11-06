import java.util.Scanner;

public class CodingTankAula03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entradaUsuario = sc.nextInt();
        int casoPar = 2;
        int entrada;
        if (entradaUsuario % 2 != 0) {
            casoPar = 1;
            entrada = (entradaUsuario-1)/2;
        } else {
            entrada = entradaUsuario/2;
        }

        //fecha primeira linha
        if (casoPar == 1) {
            for (int i = 1; i <= entradaUsuario; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        //triangulo superior
        for(int linha = 1; linha <= entrada; linha++) {
            for (int coluna = 1; coluna <= entrada-linha+1; coluna++) {
                System.out.print("*");
            }

            for (int espaco = 1; espaco <= 2*linha-casoPar; espaco++) {
                System.out.print(" ");
            }

            for (int coluna = 1; coluna <= entrada-linha+1; coluna++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        //triangulo inferior
        for (int linha = entrada-1; linha >= 1; linha--) {
            for (int coluna = linha; coluna <= entrada;coluna++) {
                System.out.print("*");
            }
            for(int espaco = 1; espaco <= 2*linha-casoPar; espaco++) {
                System.out.print(" ");
            }
            for (int coluna = linha; coluna <= entrada;coluna++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //fecha ultima linha
        if (casoPar == 1) {
            for (int i = 1; i <= entradaUsuario; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}