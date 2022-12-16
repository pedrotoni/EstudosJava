public class Referencias {
    public static void main (String[] args) {

        //dog1 é uma referencia que aponta para um objeto do tipo Cachorro
        Cachorro dog1 = new Cachorro();

        //Designando valores para os atributos do objeto do tipo Cachorro criado acima
        dog1.nome = "Fred";
        dog1.idade = 2;

        //Como não definimos o valor do atributo raca, comando abaixo printa valor default de String
        System.out.println(dog1.raca);

        /*Para deixar bem claro o conceito de referências, podemos criar variavel dog2
        e atribuir dog1 a esta variavel.
         */
        Cachorro dog2 = dog1;
        System.out.println(dog1);
        System.out.println(dog2);
        //Analisando a saída, vemos que as duas variaveis referenciam o mesmo objeto Cachorro

        /*se realizarmos uma alteração em um atributo do objeto através de dog2,
         ao printarmos o mesmo atributo usando dog1, obteremos a mesma saída,
         pois tanto dog1 quanto dog2, apesar de serem 2 variáveis distintas, apontam para o mesmo objeto
         do tipo Cachorro.
         */
        dog2.nome = "Caco";
        System.out.println(dog1.nome);

        //conferindo se dog1 e dog2 possuem de fato o mesmo valor de referencia
        if (dog1==dog2) {
            System.out.println("dog1 e dog2 tem valores iguais");
        }

        //Agora, para exemplificar outro contexto, crio dog3 e instancio um novo objeto
        Cachorro dog3 = new Cachorro();
        //esse objeto criado e referenciado por dog3 tem outra referencia
        System.out.println(dog3);
        //repetimos o if para conferir
        if (dog1==dog3) {
            System.out.println("dog1 e dog3 referenciam o mesmo objeto.");
        } else {
            System.out.println("dog1 e dog3 referenciam objetos diferentes.");
            System.out.println("Referencia dog1: "+dog1);
            System.out.println("Referencia dog3: "+dog3);
        }
    }
}

class Cachorro {
    String nome;
    int idade;
    String raca;
}
