import java.util.*;
// Paso 5: implementación en memoria para probar sin una base de datos.
public class RepositorioEnMemoria implements RepositorioCobros {
    private List<String> registros = new ArrayList<>();
    public void guardar(String placa, int valor) {
        registros.add(placa + " - $" + valor);
        System.out.println("[Memoria] Guardado: " + placa + " - $" + valor);
    }
}