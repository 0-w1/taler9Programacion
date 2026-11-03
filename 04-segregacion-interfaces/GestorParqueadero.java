import java.util.*;
public class GestorParqueadero {
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private RepositorioMySQL repositorio = new RepositorioMySQL();
    private ExportadorCSV exportador = new ExportadorCSV();
    private NotificadorSMS notificador = new NotificadorSMS();
    public void registrar(Vehiculo v) { vehiculos.add(v); }
    public void cerrarMes() {
        int total = 0;
        for (Vehiculo v : vehiculos) {
            int cobro = v.calcularCobro();
            total += cobro;
            repositorio.guardar(v.getPlaca(), cobro);
        }
        exportador.exportar(total);
        notificador.enviar("Cierre mensual terminado. Total: $" + total);
    }
}