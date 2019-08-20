package poo.control;
/* @author arnol */
public class Empleado {
    private String nombre;
    private double basico ;
    private int horas;
        
    public Empleado() {
    }
    
    public Empleado(String nombre, double basico, int horas) {
        this.nombre = nombre;
        this.basico = basico;
        this.horas = horas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public double getSalario ()  {
        return basico * horas;
    }
    
    public String getLineaEmpleado (){
        return nombre + '\t' + basico + '\t' + getSalario();
    }
   
}
