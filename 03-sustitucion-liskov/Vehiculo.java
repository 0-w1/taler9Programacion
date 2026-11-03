public abstract class Vehiculo {
    protected String placa;
    protected int minutos;
    public Vehiculo(String placa, int minutos) { this.placa = placa; this.minutos = minutos; }
    public String getPlaca() { return placa; }
    public abstract int calcularCobro();
    // Paso 3: calcular puntos ya no pertenece a todos los vehículos.
}