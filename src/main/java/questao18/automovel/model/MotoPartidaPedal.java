package questao18.automovel.model;

public class MotoPartidaPedal extends Moto{

    private Boolean aceleradorPuxado;

    public MotoPartidaPedal(int numRodas, int velMax, Boolean ligado, Boolean botaoDePartida, Boolean bateria) {
        super(numRodas, velMax, ligado, botaoDePartida, bateria);
    }

    public Boolean getAceleradorPuxado() {
        return aceleradorPuxado;
    }

    public void setAceleradorPuxado(Boolean aceleradorPuxado) {
        this.aceleradorPuxado = aceleradorPuxado;
    }

    @Override
    public void ligar() {
        if (this.aceleradorPuxado)
            super.ligar();
    }
}
