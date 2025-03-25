public class EmpleadoPermanente extends Empleado {
    private double beneficios;

    public EmpleadoPermanente(String id, String nombre, String puesto, double salario, double beneficios) {
        super(id, nombre, puesto, salario);
        this.beneficios = beneficios;
    }

    public double getBeneficios() { return beneficios; }

    @Override
    public void calcularDesempeno() {
        System.out.println("Calculando desempeño de empleado permanente: " + getNombre());
    }
}
