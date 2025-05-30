package questao18.automovel.model;

public class CarroAutomatico extends Carro {

    private Boolean freioPressionado;

    public CarroAutomatico(int numRodas, int velMax, Boolean ligado) {
        super(numRodas, velMax, ligado, Boolean.FALSE);
    }

    public CarroAutomatico(int numRodas, int velMax, Boolean ligado, Boolean freioPressionado) {
        super(numRodas, velMax, ligado, Boolean.FALSE);
        this.freioPressionado = freioPressionado;
    }

    public Boolean getFreioPressionado() {
        return freioPressionado;
    }

    public void setFreioPressionado(Boolean freioPressionado) {
        this.freioPressionado = freioPressionado;
    }

    @Override
    public void ligar() {
        if (this.freioPressionado)
            super.ligar();
    }
}
