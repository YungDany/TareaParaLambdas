import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.Arrays;
import java.util.HashMap;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    System.out.println("Prueba del método 1");
    ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println("Antes : " + lista);
    Numeros.multiplicarLista(lista, 3); //multiplica por 3
    System.out.println("Después : " + lista);
    ArrayList<Integer> listaNula = null;
    Numeros.multiplicarLista(listaNula, 2);

    System.out.println("Prueba del método 2 ");
    ArrayList<String> palabras = new ArrayList<>(Arrays.asList("Automoviles", "Soleado", "Valorant", "Casa", null));
    System.out.println("Antes: " + palabras);
    Cadenas.filtroSelectivo(palabras, "A", 4);
    System.out.println("Después: " + palabras);

    System.out.println("Prueba del método 3");
    ArrayList<String> minusculas = new ArrayList<>(Arrays.asList("pasa", "valorant", null, "agente"));
    System.out.println("Lista original: " + minusculas);
    ArrayList<String> mayusculas = Cadenas.convertirMayusculas(minusculas);
    System.out.println("Lista nueva: " + mayusculas);
    System.out.println("Lista original (no debería haber cambiado) : " + minusculas);

    System.out.println("Prueba del método 4");
    ArrayList<Integer> numerones = new ArrayList<>(Arrays.asList(2, 3, 4, 5, null));
    System.out.println("Antes : " + numerones);
    HashSet<Integer> resultado = Numeros.cuadradosParesUnicos(numerones);
    System.out.println("Después :" + resultado);

    System.out.println("Prueba del método 5");
    ArrayList<String> palabrasDos = new ArrayList<>(Arrays.asList("Mexicali", "Valorant", "Riot"));
    System.out.println("Lista original: " + palabrasDos);
    HashMap<String, Integer> mapeadoLongitudes = Cadenas.mapearLongitudCadena(palabrasDos);
    System.out.println("Resultado del mapeo : " + mapeadoLongitudes);

    System.out.println("Prueba del método 6");
    HashMap<String, Double> catalogo = new HashMap<>();
    catalogo.put("Teclado", 100.0);
    catalogo.put("Mouse", 50.0);
    catalogo.put("Monitor 240Hz", 300.0);
    Cadenas.imprimirCatalogoConDescuento(catalogo);

    System.out.println("Prueba del método 7");
    ArrayList<String> listaPalabras = new ArrayList<>(Arrays.asList("Omen", "Leviatán", "sol", "estrella", "luna", "sol", null));
    System.out.println("Lista de entrada: " + listaPalabras);
    HashMap<String, Integer> frecuencias = Cadenas.contadorFrecuenciaPalabras(listaPalabras);
    System.out.println("Mapa de frecuencias: " + frecuencias);

    System.out.println("Prueba del método 8");
    HashMap<String, Integer> mapaFrecuencias = new HashMap<>();
    mapaFrecuencias.put("sol", 3);
    mapaFrecuencias.put("luna", 2);
    mapaFrecuencias.put("estrella", 1);
    mapaFrecuencias.put("Omen", 1);
    System.out.println("Mapa original: " + mapaFrecuencias);
// Filtramos las palabras que tengan frecuencia mayor o igual a 2
    int umbral = 2;
    ArrayList<String> palabrasFrecuentes = Cadenas.filtrarPalabrasPorFrecuencia(mapaFrecuencias, umbral);
    System.out.println("Palabras con frecuencia >= " + umbral + ": " + palabrasFrecuentes);

    System.out.println("Prueba del método 9");
    String fraseLarga = "Leviatán ha sido el mejor equipo del mundo desde que ganaron Masters London.";
    int nLetras = 4;
    HashSet<String> resultadoFrase = Cadenas.procesarFrasePalabras(fraseLarga, nLetras);
    System.out.println("Frase original: " + fraseLarga);
    System.out.println("Palabras unicas de al menos " + nLetras + " letras (en minusculas): " + resultadoFrase);


    System.out.println("Prueba del método 10");
    HashMap<String, Integer> mapaTopes = new HashMap<>();
    mapaTopes.put("Loud", 10);
    mapaTopes.put("Vitality", 5);
    mapaTopes.put("100 Thieves", 2);
    mapaTopes.put("Paper Rex", 1);
    int topeMaximo = 3;
    System.out.println("Mapa antes de limitar (max " + topeMaximo + "): " + mapaTopes);
    Cadenas.limitarFrecMax(mapaTopes, topeMaximo);
    System.out.println("Mapa después de limitar: " + mapaTopes);


}
