// Paso 3: Bicicleta no implementa Fidelizable porque no acumula puntos.
public class Bicicleta extends Vehiculo {
    public Bicicleta(String placa, int minutos) { super(placa, minutos); }
    public int calcularCobro() { return 1000; }
}