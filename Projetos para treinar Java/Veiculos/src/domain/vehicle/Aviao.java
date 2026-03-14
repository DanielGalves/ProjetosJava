package domain.vehicle;

import enums.Combustivel;
import enums.Cor;

import java.math.BigDecimal;

public class Aviao implements interfaces.Aviao {

    String modelo;
    Cor cor;
    Combustivel combustivel;
    BigDecimal acelerar;

    public Aviao(String modelo,Cor cor, Combustivel combustivel){
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
    }

    public String toString(){
        return modelo
                + ", Cor: "+ cor
                + ", Uso Combustivel: "+ combustivel;
    }

    @Override
    public void decolar() {
        System.out.println("Para que avião decolar precisa atingir a velociadade minima de 200km/h");
    }
}
