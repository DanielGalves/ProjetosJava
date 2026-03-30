package domain.vehicle;

import enums.Combustivel;
import enums.Cor;

import java.math.BigDecimal;

public class Aviao implements interfaces.Aviao {

    String modelo;
    Cor cor;
    Combustivel combustivel;
    boolean voando = false;


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
        if (voando){
            System.out.println("Avião está voando");
            return;
        }
        System.out.println("Para que avião decolar precisa atingir a velociadade minima de 200km/h");


    }

    @Override
    public void pousar(){

        if (!voando){
            System.out.println("Avião em solo");
            return;
        }
        System.out.println("Iniciando procedimentos de pouso!");

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public boolean isVoando() {
        return voando;
    }

    public void setVoando(boolean voando) {
        this.voando = voando;
    }
}
