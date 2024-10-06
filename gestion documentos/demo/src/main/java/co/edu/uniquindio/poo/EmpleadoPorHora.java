package co.edu.uniquindio.poo;

public class EmpleadoPorHora extends Empleado{
    private double SalarioHora;
    private double horasTrabajadas;
    
    public EmpleadoPorHora(double SalarioHora,String nombre,String identificacion){
        super(nombre,identificacion);
        this.SalarioHora=SalarioHora;
        this.horasTrabajadas=0;
    }
    
    public double getSalarioHora() {
        return SalarioHora;
    }
    
    public void setSalarioHora(double salarioHora) {
        SalarioHora = salarioHora;
    }
    
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public String toString() {
        return "EmpleadoPorHora [SalarioHora=" + SalarioHora+"horasTrabajadas="+horasTrabajadas+super.toString()+ "]";
    }
    
    public double calcularSalario(){
        return SalarioHora*horasTrabajadas;
    }
    
}
