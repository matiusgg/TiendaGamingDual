public class ArmasDeFuego extends Armas{
    private String modoDisparo;
    private int alcance;
    private double cadencia;
    private int tamañoCargador;
    private double calibre;
    private int peso;

    ArmasDeFuego(String nombre, int daño, double precio, String estado, int stock, String modoDisparo, int alcance, double cadencia, int tamañoCargador, double calibre, double peso) {
        super(nombre, daño, precio, estado, stock, peso);
        this.alcance = alcance;
        this.modoDisparo = modoDisparo;
        this.cadencia = cadencia;
        this.tamañoCargador = tamañoCargador;
        this.calibre = calibre;

    }


    public String getModoDisparo() {
        return modoDisparo;
    }

    public void setModoDisparo(String modoDisparo) {
        this.modoDisparo = modoDisparo;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public double getCadencia() {
        return cadencia;
    }

    public void setCadencia(int cadencia) {
        this.cadencia = cadencia;
    }

    public int getTamañoCargador() {
        return tamañoCargador;
    }

    public void setTamañoCargador(int tamañoCargador) {
        this.tamañoCargador = tamañoCargador;
    }

    public double getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "ArmasDeFuego{" +
                "modoDisparo='" + modoDisparo + '\'' +
                ", alcance=" + alcance +
                ", cadencia=" + cadencia +
                ", tamañoCargador=" + tamañoCargador +
                ", calibre=" + calibre +
                ", peso=" + peso +
                '}';
    }
}
