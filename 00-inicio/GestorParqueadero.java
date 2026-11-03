import java.util.*;
public class GestorParqueadero {
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private RepositorioMySQL repositorio = new RepositorioMySQL();
    public void registrar(Vehiculo v) { vehiculos.add(v); }
    public void cerrarMes() {
        int total = 0;
        for (Vehiculo v : vehiculos) {
            int cobro = v.calcularCobro();
            total += cobro;
            repositorio.guardar(v.getPlaca(), cobro);
        }
        exportarCSV(total);
        enviarSMS("Cierre mensual terminado. Total: $" + total);
    }
    private void exportarCSV(int total) {
        System.out.println("[CSV] Total del mes: $" + total);
    }
    private void enviarSMS(String mensaje) {
        System.out.println("[SMS] " + mensaje);
    }
}