package Controller;

public class SingletonRestaurante {

    public static SingletonRestaurante instance;
    private SingletonRestaurante() {}

    public static SingletonRestaurante getInstance() {
        if (instance == null) {
            instance = new SingletonRestaurante();
        }
        return instance;
    }

}
