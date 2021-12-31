package modelo;

public class Main {

    public static void main(String[] args) {
    //Testeando.
    TrabajadorFijo trabajadorFijo = new TrabajadorFijo("920929", "Elio","Galindo", 545.00, 7);
    TrabajadorContratado trabajadorContratado = new TrabajadorContratado("901202", "Andrés","Fonseca", 1000.00, 300);
    RecursosHumanos.getRecursosHumanos().getTrabajadores().add(trabajadorFijo);
    RecursosHumanos.getRecursosHumanos().getTrabajadores().add(trabajadorContratado);
	int total = RecursosHumanos.getRecursosHumanos().mayorAntiguedad(5);
    double salarioTotal = RecursosHumanos.getRecursosHumanos().salarioTotal();
    System.out.println("El total de trabajadores con mayor antigüedad que un valor dado es: " + total);
    System.out.println("El salario total de todos los trabajadores es: " + salarioTotal);
    }
}
