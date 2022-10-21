import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class OrdenacaoList {
    public static void main (String[] args) {
        List <Gato> catList = new ArrayList<>() {{
            add(new Gato("Zumu",3,"Preto"));
            add(new Gato("Felipe",2,"Marrom"));
            add(new Gato("Ramon",7,"Branco"));
            add(new Gato("Romario",11,"verde"));
            add(new Gato("pinel",1,"Laranja"));
        }};
        System.out.println("em ordem de inserção: ");
        System.out.println(catList);
        Collections.shuffle(catList);
        System.out.println("em ordem aleatória: ");
        for (Gato cat : catList) {
            System.out.println(cat);
        }
        System.out.println("Em ordem por nome: ");
        Collections.sort(catList);
        for (Gato cat : catList){
            System.out.println(cat);
        }

        System.out.println("Em ordem de idade: ");
        Collections.sort(catList, new CompareAge());
        // ou catList.sort(new CompareAge());
        for (Gato cat:catList) {
            System.out.println(cat);
        }

        System.out.println("Ordenando por cor (ordem alfabética): ");
        Collections.sort(catList, new CompareColor());
        //ou catList.sort(new CompareColor());
        for (Gato cat:catList) {
            System.out.println(cat);
        }

    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato (String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "nome:'" + nome + '\'' +
                ", idade:" + idade +
                ", cor:'" + cor + '\'';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
    //Aqui usamos this pois estamos dentro da classe Gato
}

class CompareAge implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(),gato2.getIdade());
    }
}

class CompareColor implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
        //aqui não usamos this, e sim gato1 e gato2 pois estamos fora da classe Gato.

    }
}