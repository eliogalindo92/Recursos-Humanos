package modelo;

public class Main {

    public static void main(String[] args) {
    TrabajadorFijo trabajadorFijo = new TrabajadorFijo("920929", "Elio","Galindo", 545.00, 7);
    RecursosHumanos.getRecursosHumanos().getTrabajadores().add(trabajadorFijo);
	int total = RecursosHumanos.getRecursosHumanos().mayorAntiguedad(5);
    double salarioTotal = RecursosHumanos.getRecursosHumanos().salarioTotal();
    System.out.println("El total de trabajadores con mayor antigüedad que un valor dado es: " + total);
    System.out.println("El salario total de todos los trabajadores es: " + salarioTotal);
    }
}
