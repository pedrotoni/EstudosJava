import java.util.*;

public class ExemplosSet {
    public static void main (String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(4d,2.3d,2.3d,7d,0.2d,0d,6d));
        System.out.println(notas);

        Iterator<Double> iterator = notas.iterator();
        Double total = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            total += next;
        }
        System.out.println("A soma dos elementos da lista é : "+total);

        Iterator <Double> filterIterator = notas.iterator();
        while(filterIterator.hasNext()) {
            Double next = filterIterator.next();
            if (next < 6) {
                filterIterator.remove();
            }
        }
        System.out.println("Os itens maiores de 6 da lista são: "+notas);

        Set <Double> notas2 = new LinkedHashSet<>();
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (count < 5) {
            System.out.println("Insira um numero -> ");
            notas2.add(sc.nextDouble());
            count++;
        }
        System.out.println("Elementos em ordem de inserção "+notas2);

        Set <Double> notasOrdenadas = new TreeSet<>(notas2);
        System.out.println("Elementos em ordem crescente: "+notasOrdenadas);
    }
}
