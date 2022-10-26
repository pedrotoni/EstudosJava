import javax.swing.text.DefaultEditorKit;
import java.util.*;

public class MapJava {
    public static void main (String[] args) {
        Map<String, Double> alunosAltura = new HashMap<>(){{
            put("Pedro",1.72);
            put("Júlia",1.57);
            put("Armando",1.67);
            put("Luisa",1.76);
            put("Ricardo",1.65);
        }};
        System.out.println(alunosAltura);

        System.out.println("Alterando altura de Armando para 1.82");
        alunosAltura.put("Armando",1.82);
        System.out.println(alunosAltura);

        System.out.println("Conferir se Marina está na lista");
        System.out.println("Marina está na lista? "+alunosAltura.containsKey("Marina"));

        System.out.println("Conferir se Ricardo está na lista");
        System.out.println("Ricardo está na lista? "+alunosAltura.containsKey("Ricardo"));

        System.out.println("Exibir altura de Ricardo e Armando");
        System.out.println("Ricardo: "+alunosAltura.get("Ricardo")+" Armando: "+alunosAltura.get("Armando"));

        System.out.println("Exiba todas as chaves: ");
        Set<String> setChaves = alunosAltura.keySet();
        for(String chave:setChaves) {
            System.out.println(chave);
        }

        System.out.println("Exiba todos os valores: ");
        Collection<Double> valores = alunosAltura.values();
        for(Double valor:valores) {
            System.out.println(valor);
        }

        Double menorAltura = Collections.min(valores);
        String menorAluno = "";
        Set <Map.Entry<String, Double>> entradas = alunosAltura.entrySet();

        for(Map.Entry<String, Double> entrada:entradas) {
            if (entrada.getValue().equals(menorAltura)) {
                menorAluno = entrada.getKey();
            }
        }

        System.out.println("O menor do grupo é: "+menorAluno+", com "+menorAltura+" de altura.");

        Iterator <Double> iterator = valores.iterator();
        Double somaAlturas = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            somaAlturas += next;
        }
        System.out.println("A soma das alturas é: "+somaAlturas+" m.");
        System.out.println("A média das alturas é: "+somaAlturas/valores.size()+"m. ");

        System.out.println("Remova do grupo pessoas com menos de 1.70");
        Iterator <Double> valueIterator = valores.iterator();
        while(valueIterator.hasNext()) {
            Double next = valueIterator.next();
            if (next < 1.70) {
                valueIterator.remove();
            }
        }
        System.out.println("Os alunos que possuem mais de 1.70 são: ");
        for(Map.Entry<String, Double> entrada:entradas) {
            System.out.println(entrada.getKey()+": "+entrada.getValue()+"m");
        }

        System.out.println("Exibir chaves e valores na ordem em que foram informados: ");
        Map <String, Double> insertOrderData = new LinkedHashMap<>(){{
            put("Alexandre",1.56);
            put("Fabiana",1.73);
            put("Carlota",1.54);
            put("Adriano",1.65);
            put("Jovanira",1.76);
        }};
       Set <Map.Entry<String, Double>> entradas2 = insertOrderData.entrySet();
       for(Map.Entry<String, Double> entrada:entradas2) {
           System.out.println(entrada.getKey()+": "+entrada.getValue());
       }

        System.out.println("Exibir chaves e valores ordenados por nome(Chave): ");
       Map <String, Double> alphabetOrderData = new TreeMap<>(){{
           put("Alfredo",1.65);
           put("Amanda",1.54);
           put("Janete",1.56);
           put("Felipe",1.92);
           put("Camila",1.78);
       }};
       Set <Map.Entry<String,Double>> entradas3 = alphabetOrderData.entrySet();
       for(Map.Entry<String,Double> entrada:entradas3) {
           System.out.println((entrada.getKey()+": "+entrada.getValue()+"m"));
       }



    }
}
