// Paso 2: la clase base es abstracta y deja el cobro a cada subtipo.
public abstract class Vehiculo {
    protected String placa;
    protected int minutos;
    public Vehiculo(String placa, int minutos) { this.placa = placa; this.minutos = minutos; }
    public String getPlaca() { return placa; }
    // Paso 2: cada tipo define su propia forma de cobro.
    public abstract int calcularCobro();
    public int calcularPuntos() { return minutos / 60; }
}