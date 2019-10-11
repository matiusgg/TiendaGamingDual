public class Granadas extends Armas{
    private double radio;
    private String efecto;



    Granadas(String nombre, int daño, double precio, String estado, int stock, double peso, double radio, String efecto) {
        super(nombre, daño, precio, estado, stock, peso);
        this.radio = radio;
        this.efecto = efecto;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }
}
