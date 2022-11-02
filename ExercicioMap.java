import java.util.*;

public class ExercicioMap {
    public static void main (String[] args) {
        Map<String, Integer> estadosPopNordeste = new LinkedHashMap<>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};
        System.out.println("1. Exiba Estados e Populações: ");
        for (Map.Entry<String, Integer> estadoPop : estadosPopNordeste.entrySet()) {
            System.out.println(estadoPop.getKey()+" -> "+estadoPop.getValue());
        };
        System.out.println("-------------------------------------------");

        System.out.println("2. Substitua população do RN por 3534165");
        estadosPopNordeste.put("RN",3534165);
        System.out.println("Nova População RN: "+estadosPopNordeste.get("RN"));
        for (Map.Entry<String, Integer> estadoPop : estadosPopNordeste.entrySet()) {
            System.out.println(estadoPop.getKey()+" -> "+estadoPop.getValue());
        };
        System.out.println("-------------------------------------------");

        System.out.println("3. PB está no dicionario? "+estadosPopNordeste.containsKey("PB"));
        estadosPopNordeste.put("PB", 4039277);
        for (Map.Entry<String, Integer> estadoPop : estadosPopNordeste.entrySet()) {
            System.out.println(estadoPop.getKey()+" -> "+estadoPop.getValue());
        };
        System.out.println("-------------------------------------------");

        System.out.println("4. Exiba a população de PE: "+estadosPopNordeste.get("PE"));
        System.out.println("-------------------------------------------");
        System.out.println("5. Exiba estados e suas respectivas populações em ordem alfabética: ");
        Map<String, Integer> estadosNordeste = new TreeMap<>(estadosPopNordeste);
        for (Map.Entry<String, Integer> estadoPop : estadosNordeste.entrySet()) {
            System.out.println(estadoPop.getKey()+" -> "+estadoPop.getValue());
        };

        Collection<Integer> popul = estadosPopNordeste.values();
        int populMax = Collections.max(popul);
        int populMin = Collections.min(popul);
        String maiorPop = "";
        String menorPop = "";

        for (Map.Entry<String, Integer> estadoPop : estadosNordeste.entrySet()) {
            if (estadoPop.getValue().equals(populMax)) {
                maiorPop = estadoPop.getKey();
            } else if (estadoPop.getValue().equals(populMin)) {
                menorPop = estadoPop.getKey();
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("6.Estado com menor população: "+menorPop+
                "/ População: "+populMin+
                "\n7.Estado com maior população: "+maiorPop+
                "/ População: "+populMax);

        Iterator <Integer> popIterator = popul.iterator();
        int somaPop = 0;
        while (popIterator.hasNext()) {
            int next = popIterator.next();
            somaPop += next;
        }
        System.out.println("8.Soma da população destes estados: "+somaPop);
        System.out.println("-------------------------------------------");
        System.out.println("9.Média da população destes estados: "+
                somaPop/popul.size());
        System.out.println("10.Exibir somente estados com população maior que 5 milhões");
        Iterator <Integer> popIterator2 = popul.iterator();
        while (popIterator2.hasNext()) {
            int next = popIterator2.next();
            if (next < 5000000) {
                popIterator2.remove();
            }
        }

        for(Map.Entry<String, Integer> entrada:estadosPopNordeste.entrySet()) {
            System.out.println(entrada.getKey()+" -> "+entrada.getValue());
        }




    }
}
