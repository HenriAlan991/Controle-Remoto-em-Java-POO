package aula06b;
public class Main {
    public static void main(String[] args) {
        ControleRemoto cr = new ControleRemoto();

        cr.ligar();
        cr.aumentarVolume(20);
        cr.despausar();
        cr.desligar();
        cr.ligar();
        cr.baixarVolume(40);

    }
}
