public abstract class Empleado {
    protected String nombre;
    protected double ventasFechas;
    protected EstrategiaComision estrategia;

    public Empleado(String nombre, double ventasFechas, EstrategiaComision estrategia) {
        this.nombre = nombre;
        this.ventasFechas = ventasFechas;
        this.estrategia = estrategia;
    }

    public void cambiarEstrategia(EstrategiaComision nuevaEstrategia) {
        this.estrategia = nuevaEstrategia;
    }

    public abstract double calcularIngresoTotal();
}