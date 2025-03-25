public class ReporteDesempeno {
    public static void generarReporte(Empleado empleado) {
        try {
            System.out.println("Generando reporte para: " + empleado.getNombre());
            empleado.calcularDesempeno();
        } catch (Exception e) {
            System.out.println("Error al generar el reporte: " + e.getMessage());
        }
    }
}
