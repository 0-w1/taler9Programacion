public class Carro extends Vehiculo implements Fidelizable, ConMinutos, ConSeguro, ConLavado {
    public Carro(String placa, int minutos) { super(placa, minutos); }
    public int calcularCobro() { return (int)Math.ceil(minutos / 60.0) * 3000; }
    public int calcularPuntos() { return minutos / 60; }
    public void calcularSeguro() { System.out.println("Seguro calculado para carro."); }
    public void solicitarLavados() { System.out.println("Lavado solicitado para carro."); }
}