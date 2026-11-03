public class RepositorioMySQL implements RepositorioCobros {
    public void guardar(String placa, int valor) {
        System.out.println("[MySQL simulado] Guardado: " + placa + " - $" + valor);
    }
}