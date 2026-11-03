// Paso 3: Carro sí ofrece la capacidad de acumular puntos.
public class Carro extends Vehiculo implements Fidelizable {
    public Carro(String placa, int minutos) { super(placa, minutos); }
    public int calcularCobro() { return (int)Math.ceil(minutos / 60.0) * 3000; }
    public int calcularPuntos() { return minutos / 60; }
}