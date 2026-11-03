// Paso 2: VehiculoPorDia implementa su propia tarifa sin modificar el gestor.
public class VehiculoPorDia extends Vehiculo {
    public VehiculoPorDia(String placa, int minutos) { super(placa, minutos); }
    public int calcularCobro() { return (int)Math.ceil(minutos / 1440.0) * 15000; }
}