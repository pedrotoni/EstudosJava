import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciciosAleatorios {
    public static void main(String[] args) {
        Scanner inputAnos = new Scanner(System.in);
        System.out.println("Anos: ");
        int anos = inputAnos.nextInt();
        System.out.println("Meses: ");
        int meses = inputAnos.nextInt();
        System.out.println("Dias: ");
        int dias = inputAnos.nextInt();
        int soma = (anos*365)+(meses*30)+(dias);
        System.out.println(anos+" anos, "+meses+" meses e "+dias+" dias em dias: "+soma);

        Scanner inputSaldo = new Scanner(System.in);
        System.out.println("Digite o saldo: ");
        Double saldo = inputSaldo.nextDouble();
        Double saldoReaj = saldo - (saldo*0.01);
        System.out.println("Saldo: " +saldo+
                "\nSaldo com 1% de reajuste: "+saldoReaj);

        List<Integer> lista1 = new ArrayList<>();
        lista1.add(4);
        lista1.add(5);
        lista1.add(6);

        Iterator <Integer> lista1Iterator = lista1.iterator();
        int somaLista = 0;
        while (lista1Iterator.hasNext()) {
            int prox = lista1Iterator.next();
            somaLista += prox;
        }
        int media1 = somaLista/lista1.size();
        System.out.println("A soma dos valores 4,5,6 é "+somaLista+". Já a média é "+media1);

        List <Integer> lista2 = new ArrayList<>();
        lista2.add(8);
        lista2.add(9);
        lista2.add(7);

        Iterator <Integer> lista2Iterator = lista2.iterator();
        int somaLista2 = 0;
        while (lista2Iterator.hasNext()) {
            int prox = lista2Iterator.next();
            somaLista2 += prox;
        }
        int media2 = somaLista2/lista2.size();
        int somaElementos = lista1.size()+lista2.size();
        System.out.println("A soma dos valores 8,9,7 é "+somaLista2+" e a média é "+media2);

        System.out.println("A soma das duas médias é: "+(media1+media2));
        System.out.println("A média das médias é: "+(media1+media2)/somaElementos);

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número");
        int numEscolhido = input.nextInt();
        System.out.println(
                "O número escolhido foi: "+numEscolhido+
                        "\nO número anterior é: "+(numEscolhido-1)+
                        "\ne o número seguinte é: "+(numEscolhido+1)
        );
    }

}
