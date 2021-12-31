package modelo;

import java.util.ArrayList;

public class RecursosHumanos {
    private ArrayList<Trabajador> trabajadores;
    public static RecursosHumanos recursosHumanos;

    public static RecursosHumanos getRecursosHumanos() {
        if(recursosHumanos == null){
            recursosHumanos = new RecursosHumanos();
        }
        return recursosHumanos;
    }

    public RecursosHumanos() {
         trabajadores = new ArrayList<>();
    }

    public ArrayList<Trabajador> getTrabajadores() {

        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {

        this.trabajadores = trabajadores;
    }

    public double salarioTotal(){
        double salarioTotal = 0;
        double salarioFijo = 0;
        double salarioContrato = 0;
        for(Trabajador trabajador : trabajadores){

            if (trabajador instanceof TrabajadorFijo){
                salarioFijo += trabajador.salario();
            }
            else{
                if(trabajador instanceof TrabajadorContratado){
                    salarioContrato += trabajador.salario();
                }
            }
            salarioTotal = salarioFijo + salarioContrato;
        }
        return salarioTotal;
    }

    public int mayorAntiguedad(int antiguedad){
        int total = 0;
        for(Trabajador trabajador : trabajadores){
            if(trabajador instanceof TrabajadorFijo){
                if(((TrabajadorFijo) trabajador).getAntiguedad() > antiguedad){
                    total += 1;
                }
            }
        }
        return total;
    }
}
