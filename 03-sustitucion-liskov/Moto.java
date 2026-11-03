// Paso 3: Moto sí ofrece la capacidad de acumular puntos.
public class Moto extends Vehiculo implements Fidelizable {
    public Moto(String placa, int minutos) { super(placa, minutos); }
    public int calcularCobro() { return (int)Math.ceil(minutos / 60.0) * 2000; }
    public int calcularPuntos() { return minutos / 60; }
}