public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado emp1 = new EmpleadoPermanente("101", "Ana Pérez", "Gerente", 5000, 1000);
        Empleado emp2 = new EmpleadoTemporal("102", "Carlos Gómez", "Analista", 3000, 12);

        // Crear departamento y agregar empleados
        Departamento depto = new Departamento("Recursos Humanos");
        depto.agregarEmpleado(emp1);
        depto.agregarEmpleado(emp2);

        // Generar reporte de desempeño
        ReporteDesempeno.generarReporte(emp1);
        ReporteDesempeno.generarReporte(emp2);
    }
}
