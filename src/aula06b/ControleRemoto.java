package aula06b;
public class ControleRemoto implements Controles{

    boolean statusLigado;
    int volume;
    Boolean statusPausado;


    // METODO CONSTRUTOR


    public ControleRemoto(){
        this.statusLigado = false;
        this.volume = 25;
        this.statusPausado = null;
    }

    // METODOS GETTERS E SETTERS
    public boolean getStatusLigado() {
        return statusLigado;
    }

    public void setStatusLigado(boolean statusLigado) {
        this.statusLigado = statusLigado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getStatusPausado() {
        return statusPausado;
    }

    public void setStatusPausado(Boolean statusPausado) {
        this.statusPausado = statusPausado;
    }


    //METODOS ABSTRATOS


    @Override
    public void ligar() {
        if(getStatusLigado()){
            System.out.println("Sua TV já está ligada!");

        }
        else{
            System.out.println("Sua TV foi ligada!");
            setStatusLigado(true);
            setStatusPausado(true);
        }

    }

    @Override
    public void desligar() {
        if(getStatusLigado()){
            System.out.println("Sua TV foi desligada.");
            setStatusLigado(false);
            setStatusPausado(null);
        }
        else{
            System.out.println("Sua TV Já está desligada!");
        }

    }


    @Override
    public void pausar() {
        if(getStatusLigado()){
            if(!(getStatusPausado())){
                System.out.println("Pausado com sucesso!");
                setStatusPausado(true);
            }
            else{
                System.out.println("Sua tv já está pausada!");
            }

        }
        else {
           mensagemNaoLigada();
        }
    }

    @Override
    public void despausar() {
        if(getStatusLigado()){
            if(getStatusPausado()){
                System.out.println("Sua TV foi despausada!");
                setStatusPausado(false);

            }
            else{
                System.out.println("Sua TV Já está despausada!");

            }}
        else{
            mensagemNaoLigada();
        }

    }

    @Override
    public void aumentarVolume(int numeroVezes) {
        if(getStatusLigado()){
            if(getVolume() < 100){
                if(volume + numeroVezes <= 100 && volume - numeroVezes >= 0){
                    setVolume(volume + numeroVezes);
                    System.out.println("Volume ajustado para: " + getVolume());
                }

                else{
                    System.out.println("Insira um valor válido de vezes!");
                }
            }
            else{
                System.out.println("Sua TV já está no volume máximo!");
            }

        }
        else{
            mensagemNaoLigada();
        }

    }

    @Override
    public void baixarVolume(int numeroVezes) {
        if(getStatusLigado()){
            if(volume > 0){
                if(volume + numeroVezes <= 100 && volume - numeroVezes >= 0){
                    setVolume(volume - numeroVezes);
                    System.out.println("Volume ajustado para: " + getVolume());

                }
                else{
                    System.out.println("Insira um valor válido de vezes!");
                }

            }
            else {
                System.out.println("Sua TV Já está com o volume mínimo.");
            }

        }
        else{
            mensagemNaoLigada();

        }

    }

    @Override
    public void mutarVolume() {
        if(getStatusLigado()){
            if(getVolume() != 0){
                setVolume(0);
                System.out.println("O Volume da sua TV foi mutado!");

            }
            else{
                System.out.println("O Volume de sua TV Já está mutada!");
            }

        }
        else{
            mensagemNaoLigada();
        }

    }

    @Override
    public void mensagemNaoLigada() {
        System.out.println("Sua TV não está ligada!");

    }
}
