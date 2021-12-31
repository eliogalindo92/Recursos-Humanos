package modelo;

public class TrabajadorContratado extends Trabajador{
    private int horasTrabajadas;
    public TrabajadorContratado(String numeroID, String nombre, String apellidos, double salarioBasico, int horasTrabajadas) {
        super(numeroID, nombre, apellidos, salarioBasico);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {

        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {

        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double salario() {

        return getSalarioBasico() + 1.03 * horasTrabajadas * 0.2;
    }
}
