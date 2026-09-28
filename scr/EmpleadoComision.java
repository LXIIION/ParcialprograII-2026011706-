public class EmpleadoComision extends Empleado {
    public EmpleadoComision(String nombre, double ventasFechas, EstrategiaComision estrategia) {
        super(nombre, ventasFechas, estrategia);
    }

    @Override
    public double calcularIngresoTotal() {
        return estrategia.calcularComision(ventasFechas);
    }
}