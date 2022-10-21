import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemplosList {
    public static void main(String[] args) {
        System.out.println("Criar Lista");
        List<String> amigos = new ArrayList<>();
        System.out.println("Adicionar 5 amigos na lista");
        amigos.add("Julio");
        amigos.add("Amanda");
        amigos.add("Vitor");
        amigos.add("Reinaldo");
        amigos.add("Carla");
        System.out.println("Exibir Lista");
        System.out.println(amigos);
        System.out.println("Qual a posição de Amanda e Reinaldo?");
        System.out.println("A posição de Amanda é "+amigos.indexOf("Amanda")+
                " e a posição de Reinaldo é "+amigos.indexOf("Reinaldo"));
        System.out.println("Substituir Reinaldo por Maira");
        amigos.set(amigos.indexOf("Reinaldo"),"Maira");
        System.out.println(amigos);
        System.out.println("Jair está na Lista de Amigos? "+amigos.contains("Jair"));
        System.out.println("Exiba a lista com o método forEach");
        for(String amigo : amigos) {
            System.out.println(amigo);
        }
        System.out.println("Qual é o amigo na terceira posição? "+amigos.get(2));
        System.out.println("Criar lista numerica");
        List <Double> inteiros = new ArrayList<>();
        inteiros.add(2d);
        inteiros.add(5d);
        inteiros.add(8d);
        inteiros.add(4d);
        inteiros.add(13d);
        inteiros.add(6d);
        inteiros.add(9d);
        System.out.println(inteiros);
        System.out.println("Maior numero da lista: "+ Collections.max(inteiros));
        System.out.println("Menor numero da lista: "+Collections.min(inteiros));
        Iterator<Double> iterador = inteiros.iterator();
        Double totalSoma = 0d;
        while(iterador.hasNext()) {
            Double next = iterador.next();
            totalSoma += next;
        }
        System.out.println("A soma dos "+inteiros.size()+" elementos da lista é: "+totalSoma);
        Double media = totalSoma/inteiros.size();
        System.out.println("A média dos numeros da lista é: "+media);
        System.out.println("Remover Maira e Julio");
        amigos.remove("Maira");
        amigos.remove("Julio");
        System.out.println(amigos);

        Iterator <Double> iterador2 = inteiros.iterator();
        while (iterador2.hasNext()) {
            Double next = iterador2.next();
            if (next < 10) {
                iterador2.remove();
            }
        }
        System.out.println("O unico numero da lista maior do que 10 é: "+inteiros.toString());

        System.out.println("Limpar lista");
        inteiros.clear();
        System.out.println(inteiros);
        System.out.println("Lista de numeros está vazia? "+inteiros.isEmpty());
    }
}
