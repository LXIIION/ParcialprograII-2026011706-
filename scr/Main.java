public class Main {
    public static void main(String[] args) {
        EstrategiaComision estandar = new ComisionEstandar();
        EstrategiaComision personalizada = new ComisionPersonalizada();

        Empleado emp1 = new EmpleadoComision("Paulo Londra", 5000.0, estandar);
        System.out.println("Ingreso " + emp1.nombre + ": $" + emp1.calcularIngresoTotal());

        Empleado emp2 = new EmpleadoBaseMasComision("Bryan Reyes", 8000.0, personalizada, 600.0);
        System.out.println("Ingreso " + emp2.nombre + ": $" + emp2.calcularIngresoTotal());

        emp2.cambiarEstrategia(estandar);
        System.out.println("Nuevo Ingreso de Bryan con estandar: $" + emp2.calcularIngresoTotal());
    }
}