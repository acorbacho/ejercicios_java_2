public class Usuario extends Participante {

    public Usuario(int victorias, int derrotas, int partidas, String nombre) {
        super(victorias, derrotas, partidas, nombre);
    }

    public int escogeValor(String valor) {
        if (valor.equals("Cara")) {
            return 0;
        } else {
            return 1;
        }
    }
}