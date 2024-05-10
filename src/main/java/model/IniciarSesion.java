package model;

public class IniciarSesion {

    String usuario;
    String clave;

    public IniciarSesion( String usuario, String clave ) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public IniciarSesion() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
