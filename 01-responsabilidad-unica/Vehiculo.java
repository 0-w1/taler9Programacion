public class Vehiculo {
    protected String placa;
    protected String tipo;
    protected int minutos;
    public Vehiculo(String placa, String tipo, int minutos) {
        this.placa = placa; this.tipo = tipo; this.minutos = minutos;
    }
    public String getPlaca() { return placa; }
    public int calcularCobro() {
        switch (tipo.toLowerCase()) {
            case "carro": return (int)Math.ceil(minutos / 60.0) * 3000;
            case "moto": return (int)Math.ceil(minutos / 60.0) * 2000;
            case "bicicleta": return 1000;
            default: return 0;
        }
    }
    public int calcularPuntos() {
        if (tipo.equalsIgnoreCase("bicicleta"))
            throw new UnsupportedOperationException("La bicicleta no acumula puntos");
        return minutos / 60;
    }
}