public class VehiculoPorDia extends Vehiculo implements Fidelizable {
    public VehiculoPorDia(String placa, int minutos) { super(placa, minutos); }
    public int calcularCobro() { return (int)Math.ceil(minutos / 1440.0) * 15000; }
    public int calcularPuntos() { return minutos / 60; }
}