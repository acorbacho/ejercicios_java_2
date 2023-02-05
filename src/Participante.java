public class Participante {
    private int victorias;
    private int derrotas;
    private int partidas;
    private String nombre;

    public Participante() {}

    public Participante(int victorias, int derrotas, int partidas, String nombre) {
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.partidas = partidas;
        this.nombre = nombre;
    }
    public String getInformacion() {
        return "Nombre: " + nombre + ", Victorias: " + victorias + ", Derrotas: " + derrotas;
    }

    // Setters
    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters
    public int getVictorias() {
        return victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getPartidas() {
        return partidas;
    }

    public String getNombre() {
        return nombre;
    }
}