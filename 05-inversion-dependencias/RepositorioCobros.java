// Paso 5: abstracción que permite cambiar el mecanismo de almacenamiento.
public interface RepositorioCobros {
    void guardar(String placa, int valor);
}