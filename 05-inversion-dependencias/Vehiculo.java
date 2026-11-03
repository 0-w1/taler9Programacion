public abstract class Vehiculo {
    protected String placa;
    protected int minutos;
    public Vehiculo(String placa, int minutos) { this.placa = placa; this.minutos = minutos; }
    public String getPlaca() { return placa; }
    public abstract int calcularCobro();
    public int calcularPuntos() { return minutos / 60; }
}