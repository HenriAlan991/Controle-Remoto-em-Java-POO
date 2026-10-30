package aula06b;

public interface Controles {
    void ligar();
    void desligar();
    void pausar();
    void despausar();
    void aumentarVolume(int numeroVezes);
    void baixarVolume(int numeroVezes);
    void mutarVolume();
    void mensagemNaoLigada();
}
