package questao18.automovel.service;

import org.springframework.stereotype.Service;
import questao18.automovel.model.Automovel;
import questao18.automovel.model.CarroAutomatico;
import questao18.automovel.model.Moto;
import questao18.automovel.model.MotoPartidaPedal;

@Service
public class AutomovelService {

    public Boolean ligarMotoPartidaPedal(MotoPartidaPedal motoPartidaPedal){


        MotoPartidaPedal moto = new MotoPartidaPedal(
                motoPartidaPedal.getNumRodas(), motoPartidaPedal.getVelMax(),
                motoPartidaPedal.estaLigado(),
                motoPartidaPedal.getBotaoDePartida(),motoPartidaPedal.getBotaoDePartida());
        moto.setAceleradorPuxado(motoPartidaPedal.getAceleradorPuxado());
        moto.ligar();
        return moto.estaLigado();

    }
    public Boolean ligarCarroAutomatico(CarroAutomatico novoCarroAutomatico){
        CarroAutomatico carroAutomatico = new CarroAutomatico(novoCarroAutomatico.getNumRodas(),
                novoCarroAutomatico.getVelMax(), novoCarroAutomatico.estaLigado(),
                novoCarroAutomatico.getFreioPressionado());
         carroAutomatico.ligar();

         return carroAutomatico.estaLigado();

    }
}
