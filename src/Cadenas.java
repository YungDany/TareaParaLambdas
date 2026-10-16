import java.util.ArrayList;
import java.util.stream.Collectors;

public class Cadenas {

    public static void filtroSelectivo(ArrayList<String> lista, String letra, int n) {
        if (lista == null) {
            return;
        }
        //Esto hace que se convierta a minuscula una sola vez si no es null ni vacia
        String fijado = (letra != null) ? letra.toLowerCase() : "";
        lista.removeIf(a -> a == null || (!fijado.isEmpty() && a.toLowerCase().startsWith(fijado)) || a.length() < n);

    }

    public static ArrayList<String> convertirMayusculas(ArrayList<String> lista){
        if(lista==null){
            return new ArrayList<>(); //regresa una lista vacia
        }
        return lista.stream()
                .map(s -> (s!=null) ? s.toUpperCase() :null)
                .collect(Collectors.toCollection(ArrayList::new));

    }
}
