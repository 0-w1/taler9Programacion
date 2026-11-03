public class Main {
    public static void main(String[] args) {
        GestorParqueadero gestor = new GestorParqueadero();
        gestor.registrar(new Carro("ABC123", 125));
        gestor.registrar(new Moto("XYZ789", 70));
        gestor.registrar(new Bicicleta("BICI01", 90));
        gestor.registrar(new VehiculoPorDia("DIA001", 1500));
        gestor.cerrarMes();
    }
}