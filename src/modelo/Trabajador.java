package modelo;

public abstract class Trabajador {

    private String numeroID;
    private String nombre;
    private String apellidos;
    private double salarioBasico;

    public Trabajador(String numeroID, String nombre, String apellidos, double salarioBasico) {
        this.numeroID = numeroID;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioBasico = salarioBasico;
    }

    public String getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(String numeroID) {
        this.numeroID = numeroID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public abstract double salario();
}
