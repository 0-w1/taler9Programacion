public class Main {
    public static void main(String[] args) {
        GestorParqueadero gestor = new GestorParqueadero();
        gestor.registrar(new Vehiculo("ABC123", "carro", 125));
        gestor.registrar(new Vehiculo("XYZ789", "moto", 70));
        gestor.registrar(new Vehiculo("BICI01", "bicicleta", 90));
        gestor.cerrarMes();
    }
}