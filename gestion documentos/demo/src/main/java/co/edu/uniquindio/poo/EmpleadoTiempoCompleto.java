package co.edu.uniquindio.poo;

public class EmpleadoTiempoCompleto extends Empleado{

    private double SalarioMensual;

public EmpleadoTiempoCompleto(double SalarioMensual){
    super(nombre, identificacion)
this.SalarioMensual=SalarioMensual;
}

public double getSalarioMensual() {
    return SalarioMensual;
}

public void setSalarioMensual(double salarioMensual) {
    SalarioMensual = salarioMensual;
}

@Override
public String toString() {
    return "EmpleadoTiempoCompleto [nombre=" + nombre + ", SalarioMensual=" + SalarioMensual + ", identificacion="
            + identificacion + "]";
}

public double calcularSalario(double salarioMensual){
    return salarioMensual;
}
}