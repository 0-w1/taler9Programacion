// Paso 2: Bicicleta implementa su propia tarifa sin modificar el gestor.
public class Bicicleta extends Vehiculo {
    public Bicicleta(String placa, int minutos) { super(placa, minutos); }
    public int calcularCobro() { return 1000; }
}