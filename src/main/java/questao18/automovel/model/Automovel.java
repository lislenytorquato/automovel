package questao18.automovel.model;

public class Automovel {
    private int numRodas;
    private int velMax;
    private Boolean ligado;

    public Automovel(int numRodas, int velMax, Boolean ligado) {
        this.numRodas = numRodas;
        this.velMax = velMax;
        this.ligado = ligado;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public Boolean estaLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

     public void ligar(){
        this.setLigado(Boolean.TRUE);
     }

}
