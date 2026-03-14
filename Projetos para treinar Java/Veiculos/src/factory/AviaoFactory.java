package factory;

import domain.vehicle.Aviao;
import enums.Combustivel;
import enums.Cor;

public class AviaoFactory {

    Aviao aviao = new Aviao("Jato", Cor.BRANCO, Combustivel.QUEROZENE);
}
