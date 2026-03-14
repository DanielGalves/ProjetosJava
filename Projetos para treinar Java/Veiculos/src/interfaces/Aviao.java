package interfaces;

import enums.Combustivel;
import enums.Cor;

import java.math.BigDecimal;

public interface Aviao {

    String modelo = "";
    Combustivel combustivel = null;
    Cor cor = null;

    void decolar();



}
