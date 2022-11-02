import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("ORDEM ALEATÓRIA (HASHMAP)");
        Map <String, Musica> musicas = new HashMap<>() {{
            put("Sandra de Sá", new Musica("Olhos Coloridos","Soul Funk"));
            put("Bob Marley", new Musica("Could You Be Loved","Reggae"));
            put("Aerosmith", new Musica("Pink","Rock"));
            put("Metallica", new Musica("One","Metal"));
            put("The Devil Wears Prada", new Musica("Hey John Whats Your Name Again", "Metalcore"));
        }};

        Set<Map.Entry<String, Musica>> entradas = musicas.entrySet();
        for (Map.Entry<String, Musica> entrada:entradas){
            System.out.println("Artista: "+entrada.getKey()+"\nMúsica: "+entrada.getValue().getNome()+
                    "\nGênero: "+entrada.getValue().getGenero()+"\n___________________");
        }

        System.out.println("ORDEM DE INSERÇÃO (LINKEDHASHMAP)");
        Map <String, Musica> musicas2 = new LinkedHashMap<>() {{
            put("Sandra de Sá", new Musica("Olhos Coloridos","Soul Funk"));
            put("Bob Marley", new Musica("Could You Be Loved","Reggae"));
            put("Metallica", new Musica("One","Metal"));
            put("The Devil Wears Prada", new Musica("Hey John Whats Your Name Again", "Metalcore"));
            put("Aerosmith", new Musica("Pink","Rock"));
        }};

        Set <Map.Entry<String, Musica>> entradas2 = musicas2.entrySet();
        for (Map.Entry<String,Musica> entrada:entradas2) {
            System.out.println(
                    "Artista: "+entrada.getKey()+
                            "\nMúsica: "+entrada.getValue().getNome()+
                            "\nGênero: "+entrada.getValue().getGenero()+
                            "\n___________________________________"
            );
        }

        System.out.println("POR ORDEM ALFABÉTICA DOS ARTISTAS");
        Map <String, Musica> musicas3 = new TreeMap<>(musicas);
        for (Map.Entry<String, Musica> entrada:musicas3.entrySet()) {
            System.out.println(
                    "Artista: "+entrada.getKey()+
                            "\nMúsica: "+entrada.getValue().getNome()+
                            "\nGênero: "+entrada.getValue().getGenero()+
                            "\n-----------------------"
            );
        }

        System.out.println("POR ORDEM ALFABÉTICA DOS NOMES DAS MUSICAS");
        Set <Map.Entry<String, Musica>> musicas4 = new TreeSet<>(new ComparatorMusica());
        musicas4.addAll(musicas.entrySet());
        for (Map.Entry<String, Musica> entrada:musicas4) {
            System.out.println(
                    "Artista: "+entrada.getKey()+
                            "\nMúsica: "+entrada.getValue().getNome()+
                            "\nGênero: "+entrada.getValue().getGenero()+
                            "\n-----------------------"
            );
        }

        System.out.println("COMPARANDO POR ORDEM ALFABETICA DOS GENEROS");
        Set <Map.Entry<String, Musica>> musicas5 = new TreeSet<>(new ComparatorGenero());
        musicas5.addAll(musicas.entrySet());
        for (Map.Entry<String, Musica> entrada:musicas5) {
            System.out.println(
                    "Artista: "+entrada.getKey()+
                            "\nMúsica: "+entrada.getValue().getNome()+
                            "\nGênero: "+entrada.getValue().getGenero()+
                            "\n-----------------------"
            );
        }

    }
}

class Musica {
    private String nome;
    private String genero;

    public Musica(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musica musica = (Musica) o;
        return nome.equals(musica.nome) && genero.equals(musica.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero);
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}

class ComparatorMusica implements Comparator <Map.Entry<String, Musica>> {

    @Override
    public int compare(Map.Entry<String, Musica> m1, Map.Entry<String, Musica> m2) {
        return m1.getValue().getNome().compareToIgnoreCase(m2.getValue().getNome());
    }
}

class ComparatorGenero implements Comparator <Map.Entry<String, Musica>> {

    @Override
    public int compare(Map.Entry<String, Musica> g1, Map.Entry<String, Musica> g2) {
        return g1.getValue().getGenero().compareToIgnoreCase(g2.getValue().getGenero());
    }
}