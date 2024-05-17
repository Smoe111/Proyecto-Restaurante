package model;

public interface Empleado {
    void setEstado(StateEmpleado estado);
    StateEmpleado getEstado();
    void realizarTarea ();
}
