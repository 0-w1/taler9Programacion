import java.util.*;
public class GestorParqueadero {
    private List<Vehiculo> vehiculos = new ArrayList<>();
    // Paso 1: el gestor coordina servicios especializados.
    private RepositorioMySQL repositorio = new RepositorioMySQL();
    // Paso 1: la exportación queda a cargo de otra clase.
    private ExportadorCSV exportador = new ExportadorCSV();
    // Paso 1: el envío de SMS queda a cargo de otra clase.
    private NotificadorSMS notificador = new NotificadorSMS();
    public void registrar(Vehiculo v) { vehiculos.add(v); }
    public void cerrarMes() {
        int total = 0;
        for (Vehiculo v : vehiculos) {
            int cobro = v.calcularCobro();
            total += cobro;
            repositorio.guardar(v.getPlaca(), cobro);
        }
        // Paso 1: se delega la exportación del resultado.
        exportador.exportar(total);
        // Paso 1: se delega el envío de la notificación.
        notificador.enviar("Cierre mensual terminado. Total: $" + total);
    }
}