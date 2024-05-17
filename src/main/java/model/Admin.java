package model;

public class Admin implements  Empleado {
    private StateEmpleado estado;

    @Override
    public void setEstado(StateEmpleado estado) {
        this.estado = estado;
    }

    @Override
    public StateEmpleado getEstado() {
        return estado;
    }

    @Override
    public void realizarTarea() {

        if (estado == null) {
            estado.realizarAccion();
        } else {
            System.out.println("Estado no establecido");
        }
    }
}

