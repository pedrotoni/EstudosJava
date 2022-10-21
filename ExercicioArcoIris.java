import java.util.*;

public class ExercicioArcoIris {
    public static void main (String[] args) {
        Set<String> rainbowColors = new HashSet<>();
        rainbowColors.add("Vermelho");
        rainbowColors.add("Azul");
        rainbowColors.add("Amarelo");
        rainbowColors.add("Laranja");
        rainbowColors.add("Azul Escuro");
        rainbowColors.add("Verde");
        rainbowColors.add("Violeta");
        System.out.println("Lista de cores do arco iris: ");
        for(String color:rainbowColors) {
            System.out.println(color);
        }
        System.out.println("O arco iris possui "+rainbowColors.size()+" cores.");
        System.out.println("Lista de Cores do Arco Iris em Ordem Alfabetica: ");
        Set<String> rainbowColorsAlphabetOrder = new TreeSet<>(rainbowColors);
        for(String color:rainbowColorsAlphabetOrder) {
            System.out.println(color);
        };

        System.out.println("Lista de Cores do Arco Iris em Ordem de Inserção");
        Set <String> rainbowColorsInsertOrder = new LinkedHashSet<>(
                Arrays.asList("Azul","Azul Escuro","Vermelho","Laranja","Violeta","Verde","Amarelo")
        );
        for(String color:rainbowColorsInsertOrder) {
            System.out.println(color);
        };

        System.out.println("Lista de Cores do Arco Iris em Ordem Inversa de Inserção");
        List <String> rainbowColorsListReverse = new ArrayList<>(rainbowColorsInsertOrder);
        Collections.reverse(rainbowColorsListReverse    );
        System.out.println(rainbowColorsListReverse);

        System.out.println("Lista de Cores do Arco Iris que começam com V: ");
        for(String color:rainbowColorsListReverse) {
            if (color.startsWith("V")) {
                System.out.println(color);
            }
        }

        System.out.println("Removendo cores que não começam com V...");
        rainbowColorsAlphabetOrder.removeIf(next -> next.startsWith("V"));
        System.out.println(rainbowColorsAlphabetOrder);

        System.out.println("Limpando registros...");
        rainbowColors.clear();
        rainbowColorsAlphabetOrder.clear();
        rainbowColorsInsertOrder.clear();
        rainbowColorsListReverse.clear();

        System.out.println("Registros estão limpos? "+rainbowColorsAlphabetOrder.isEmpty());

    }
}