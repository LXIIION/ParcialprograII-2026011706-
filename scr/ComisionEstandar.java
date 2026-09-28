public class ComisionEstandar implements EstrategiaComision {
    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * 0.05;
    }
}