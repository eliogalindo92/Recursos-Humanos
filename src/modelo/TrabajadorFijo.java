package modelo;

public class TrabajadorFijo extends Trabajador{
    private int antiguedad;

    public TrabajadorFijo(String numeroID, String nombre, String apellidos, double salarioBasico, int antiguedad) {
        super(numeroID, nombre, apellidos, salarioBasico);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public double salario() {
        return getSalarioBasico() + 1.03 * antiguedad * 0.1;
    }
}
