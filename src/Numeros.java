import java.util.ArrayList;

public class Numeros {

    public static void multiplicarLista(ArrayList<Integer> numeros, int factor){
        if(numeros==null){
            return;
        }
        numeros.replaceAll(n->n*factor);
    }
}
