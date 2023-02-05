public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(0,0,0,"AARÓN");

        int valorEscogidoUsuario = usuario.escogeValor("Cara");

        System.out.println("Valor escogido por el usuario: " + valorEscogidoUsuario);

        System.out.println(usuario.getInformacion());

        Maquina maquina = new Maquina();

        int valorEscogidoMaquina = maquina.escogerValor();

        System.out.println("Valor escogido por la máquina: " + valorEscogidoMaquina);
    }
}