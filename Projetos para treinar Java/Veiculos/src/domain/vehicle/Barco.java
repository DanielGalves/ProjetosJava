package domain.vehicle;

import enums.TipoBarco;

public class Barco implements interfaces.Barco {

    TipoBarco tipoBarco;
    Boolean navegando = true;

    @Override
    public void navegar(){

        if (navegando){
            System.out.println("Escolha o tipo de barco:");
            return;
        }
        System.out.println("Atracado");

    }

    @Override
    public void atracar(){

        if(!navegando){
            System.out.println();
            return;
        }

        System.out.println("Navegando");

    }

}
