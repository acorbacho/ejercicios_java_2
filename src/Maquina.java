import java.util.Random;

public class Maquina extends Participante {

    public Maquina() {}
    public int escogerValor() {
        Random rand = new Random();
        return rand.nextInt(2);
    }
}
