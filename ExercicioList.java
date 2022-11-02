import java.util.*;
/*Escreva um programa que pega 6 meses de temperatura,
soma e tira as médias das mesmas, e depois aponta qual dos
meses tiveram temperaturas acima da média geral, e ordenar elas.
 */

public class ExercicioList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        List <Double> temps = new ArrayList<>();
        while (count < 6) {
            System.out.println("Insira a temperatura do mês "+(count+1)+": ");
            temps.add(sc.nextDouble());
            count++;
        }
        System.out.println("Lista de temperaturas: "+temps);

        Iterator <Double> sumTemps = temps.iterator();
        Double total = 0d;
        while (sumTemps.hasNext()) {
            Double next = sumTemps.next();
            total += next;
        }
        System.out.println("A soma das temperaturas da lista é: "+total);
        Double average = total/temps.size();
        System.out.println("A média das temperaturas da lista é: "+average);

        Iterator <Double> tempAboveAverageIterator = temps.iterator();
        List <Double> tempAboveAverage = new ArrayList<>();
        while (tempAboveAverageIterator.hasNext()) {
            Double next = tempAboveAverageIterator.next();
            if (next > average) {
                tempAboveAverage.add(next);
            }
        }
        System.out.println("As temperaturas acima da média ("+average+") são: "+tempAboveAverage);
    }
}
