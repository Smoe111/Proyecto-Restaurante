package model;

public class Descanso implements  StateEmpleado{
    @Override
    public String realizarAccion() {
        return  "No se puede realizar el pedido";
    }
}
