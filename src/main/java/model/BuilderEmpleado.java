package model;

public class BuilderEmpleado implements  Builder{

    private String nombre;
    private String apellido;
    private RolEmpleado rolEmpleado;
    private StateEmpleado estado;

    public BuilderEmpleado setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public BuilderEmpleado setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }
    public BuilderEmpleado setN(RolEmpleado rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
        return this;
    }
    public BuilderEmpleado setEstado(StateEmpleado estado) {
        this.estado = estado;
        return this;
    }


    @Override
    public  Empleado build(){
        return  new Empleado(nombre, apellido, rolEmpleado, estado);
    }
}
