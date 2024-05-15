package model;

public class BuilderCliente implements  Builder{

    private String nombre;
    private String apellido;
    private  String correo;

    public BuilderCliente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public BuilderCliente setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public BuilderCliente setCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    @Override
    public Cliente build() {
        return new Cliente(nombre, apellido, correo);
    }
}
