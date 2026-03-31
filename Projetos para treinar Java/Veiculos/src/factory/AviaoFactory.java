package factory;

import domain.vehicle.Aviao;
import enums.TipoCombustivel;
import enums.Cor;

public class AviaoFactory {

    Aviao aviao = new Aviao("Jato", Cor.BRANCO, TipoCombustivel.QUEROZENE);
}
