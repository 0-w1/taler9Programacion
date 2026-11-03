public class Main {
    public static void main(String[] args) {
        // Paso 5: se elige la implementación en memoria desde el punto de entrada.
        RepositorioCobros repositorio = new RepositorioEnMemoria();
        ExportadorCSV exportador = new ExportadorCSV();
        NotificadorSMS notificador = new NotificadorSMS();
        GestorParqueadero gestor = new GestorParqueadero(repositorio, exportador, notificador);
        gestor.registrar(new Carro("ABC123", 125));
        gestor.registrar(new Moto("XYZ789", 70));
        gestor.registrar(new Bicicleta("BICI01", 90));
        gestor.registrar(new VehiculoPorDia("DIA001", 1500));
        gestor.cerrarMes();
        Casillero c = new Casillero(); c.guardarCasco();
    }
}