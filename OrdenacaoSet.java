import java.util.*;

public class OrdenacaoSet {

    public static void main (String[] args) {
        //Set Programas exibido em ordem aleatória: HashSet<>()
        Set<Programa> setProgramas = new HashSet<>();
        setProgramas.add(new Programa("A Grande Família","Comédia",25));
        setProgramas.add(new Programa("Linha Direta","Policial",30));
        setProgramas.add(new Programa("Jornal Nacional","Noticiário",22));
        System.out.println("Lista de Programas em ordem aleatória (HashSet): ");
        for(Programa programa:setProgramas) {
            System.out.println("Programa: "+programa.getNome()+" / Gênero: "+programa.getGenero()+" / Duração : "+programa.getDuracao());
        }


        //Set Programas exibido em ordem de inserção: LinkedHashSet<>();
        Set <Programa> setProgramas2 = new LinkedHashSet<>();
        setProgramas2.add(new Programa("Disk MTV","Música",20));
        setProgramas2.add(new Programa("Cocoricó","Infantil", 10));
        setProgramas2.add(new Programa("Globo Esporte","Esportivo",15));
        System.out.println("Lista de Programas em ordem de Inserção (LinkedHashSet): ");
        for (Programa programa:setProgramas2){
            System.out.println(programa.getNome()+" - "+programa.getGenero()+" - "+programa.getDuracao());
        }

        //Set Programas exibido em ordem natural (Exemplo 1 - Ordem Alfabetica dos Titulos);
        Set <Programa> setProgramas3 = new TreeSet<>(setProgramas);
        System.out.println("Lista de Programas em Ordem Natural - Ordem Escolhida: Ordem Alfabetica do Titulo");
        for (Programa programa:setProgramas3) {
            System.out.println(programa.getNome()+" - "+programa.getGenero()+" - "+programa.getDuracao());
        }

        //Set Programas exibido em ordem natural (Exemplo 2 - Ordem Crescente de Duração);
        //Dessa vez passamos a nova classe CompareDuracao() no TreeSet
        Set <Programa> setProgramas4 = new TreeSet<>(new CompareDuracao());
        System.out.println("Lista de Programas em Ordem Natural - Ordem Escolhida: Ordem Crescente de Duração");
        //.addAll adiciona todos os dados da Collections setProgramas2 para setProgramas4.
        setProgramas4.addAll(setProgramas2);
        for(Programa programa:setProgramas4) {
            System.out.println(programa.getNome()+" - "+programa.getGenero()+" - "+programa.getDuracao());
        };


    }
}

class Programa implements Comparable<Programa> {
    private String nome;
    private String genero;
    private Integer duracao;

    public Programa(String nome, String genero, Integer duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getDuracao() {
        return duracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programa programa = (Programa) o;
        return Objects.equals(nome, programa.nome) && Objects.equals(genero, programa.genero) && Objects.equals(duracao, programa.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, duracao);
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public int compareTo(Programa programa) {
        return this.getNome().compareToIgnoreCase(programa.getNome());
    }


}

class CompareDuracao implements Comparator <Programa> {

    @Override
    public int compare(Programa p1, Programa p2) {
        return Integer.compare(p1.getDuracao(), p2.getDuracao());
    }
}