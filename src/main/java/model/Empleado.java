package model;

public class Empleado{

    private String nombre;
    private String apellido;
    private RolEmpleado rolEmpleado;
    private StateEmpleado estado;

    public  Empleado (){}

    public Empleado(String nombre, String apellido, RolEmpleado rolEmpleado, StateEmpleado estado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rolEmpleado = rolEmpleado;
        this.estado= new Disponible();
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return nombre;
    }
    public RolEmpleado getRolEmpleado() {
        return rolEmpleado;
    }

    public StateEmpleado getEstado() {
        return estado;
    }

    public void realizarAccion(){
        estado.realizarAccion();
    }

}
