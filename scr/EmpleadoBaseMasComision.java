public class EmpleadoBaseMasComision extends Empleado {
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, double ventasFechas, EstrategiaComision estrategia, double salarioBase) {
        super(nombre, ventasFechas, estrategia);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularIngresoTotal() {
        return salarioBase + estrategia.calcularComision(ventasFechas);
    }
}