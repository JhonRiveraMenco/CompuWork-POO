// Clase base Empleado
abstract class Empleado {
    private String id;
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(String id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    public abstract void calcularDesempeno();
}
