
class Balas extends Armas{
    private int PaqueteBalas;


    Balas(String nombre, int daño, double precio, String estado, int stock, int PaqueteBalas, double peso) {
        super(nombre, daño, precio, estado, stock, peso);
        this.PaqueteBalas = PaqueteBalas;
    }

    public int getPaqueteBalas() {
        return PaqueteBalas;
    }

    public void setPaqueteBalas(int paqueteBalas) {
        PaqueteBalas = paqueteBalas;
    }


    @Override
    public String toString() {
        return "Balas{" +
                "PaqueteBalas=" + PaqueteBalas +
                '}';
    }
}
