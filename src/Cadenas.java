import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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

    public static HashMap<String,Integer> mapearLongitudCadena(ArrayList<String> lista){
        if(lista==null){
            return new HashMap<>();
        }
        return lista.stream()
                .filter(s->s!=null)
                .collect(Collectors.toMap(s->s,String::length,(existente,nuevo)->existente, HashMap::new));
    }

    public static void imprimirCatalogoConDescuento(Map<String,Double> productos){
        if(productos==null || productos.isEmpty()){
            System.out.println("El catálogo está vacío o es nula ");
            return;
        }
        System.out.println("Catálogo con 10% de descuento ");
        productos.forEach((producto,precio)->{
            if(producto!=null &&precio!=null){
                double precioConDescuento=precio*.90;
                System.out.printf("Producto: %-15s | Precio Orig: $%6.2f | Con desc: $%6.2f%n",
                        producto, precio, precioConDescuento);
            }
        });

    }
}
