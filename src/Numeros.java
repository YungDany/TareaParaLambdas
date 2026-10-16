import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Numeros {

    public static void multiplicarLista(ArrayList<Integer> numeros, int factor){
        if(numeros==null){
            return;
        }
        numeros.replaceAll(n->n*factor);
    }

    public static HashSet<Integer> cuadradosParesUnicos(ArrayList<Integer> numeros){
        if(numeros==null){
            return new HashSet<>(); //Retorna una set vacío
        }

        return numeros.stream()
                .filter(n->n!=null && n%2 ==0) //filtra los nulos y los pares
                .map(n->n*n)
                .collect(Collectors.toCollection(HashSet::new));
        }
}

