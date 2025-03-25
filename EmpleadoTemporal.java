public class EmpleadoTemporal extends Empleado {
    private int duracionContrato;

    public EmpleadoTemporal(String id, String nombre, String puesto, double salario, int duracionContrato) {
        super(id, nombre, puesto, salario);
        this.duracionContrato = duracionContrato;
    }

    public int getDuracionContrato() { return duracionContrato; }

    @Override
    public void calcularDesempeno() {
        System.out.println("Calculando desempeño de empleado temporal: " + getNombre());
    }
}

