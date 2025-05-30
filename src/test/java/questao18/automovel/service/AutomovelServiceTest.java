package questao18.automovel.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import questao18.automovel.model.CarroAutomatico;
import questao18.automovel.model.MotoPartidaPedal;

@ExtendWith(MockitoExtension.class)
public class AutomovelServiceTest {

    @InjectMocks
    AutomovelService automovelService;

    @DisplayName("1-deve ligar carro automatico quando freio eh pressionado")
    @Test
    void deveLigarCarroAutomaticoQuandoFreioPressionadoEhTrue(){
        CarroAutomatico carroAutomatico =
                new CarroAutomatico(4,100,Boolean.FALSE,Boolean.TRUE);
        Boolean ligarCarroAutomatico = automovelService.ligarCarroAutomatico(carroAutomatico);
        Assertions.assertEquals(Boolean.TRUE, ligarCarroAutomatico);
    }

    @DisplayName("2-deve não ligar carro automatico quando freio nao eh pressionado")
    @Test
    void deveNaoLigarCarroAutomaticoQuandoFreioPressionadoEhFalse(){
        CarroAutomatico carroAutomatico =
                new CarroAutomatico(4,100,Boolean.FALSE,Boolean.FALSE);
        Boolean ligarCarroAutomatico = automovelService.ligarCarroAutomatico(carroAutomatico);
        Assertions.assertEquals(Boolean.FALSE, ligarCarroAutomatico);
    }

    @DisplayName("3-deve  ligar moto de partida de pedal quando acelerador eh puxado")
    @Test
    void deveLigarMotoPartidaPedalQuandoAceleradorPuxadoEhTrue(){
        MotoPartidaPedal motoPartidaPedal = new MotoPartidaPedal(2,200,Boolean.FALSE,Boolean.FALSE,Boolean.FALSE);
        motoPartidaPedal.setAceleradorPuxado(Boolean.TRUE);
        Boolean ligarMotoPartidaPedal = automovelService.ligarMotoPartidaPedal(motoPartidaPedal);
        Assertions.assertEquals(Boolean.TRUE, ligarMotoPartidaPedal);
    }

    @DisplayName("4-deve não ligar moto de partida de pedal quando acelerador não eh puxado")
    @Test
    void deveNaoLigarMotoPartidaPedalQuandoAceleradorPuxadoEhFalse(){
        MotoPartidaPedal motoPartidaPedal = new MotoPartidaPedal(2,200,Boolean.FALSE,Boolean.FALSE,Boolean.FALSE);
        motoPartidaPedal.setAceleradorPuxado(Boolean.FALSE);
        Boolean ligarMotoPartidaPedal = automovelService.ligarMotoPartidaPedal(motoPartidaPedal);
        Assertions.assertEquals(Boolean.FALSE, ligarMotoPartidaPedal);
    }
}
