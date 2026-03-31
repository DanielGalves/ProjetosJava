import domain.vehicle.Aviao;
import domain.vehicle.Barco;
import domain.vehicle.Veiculo;
import enums.TipoCombustivel;
import enums.Cor;
import enums.TipoVeiculo;

public class Main {
    public static void main(String[] args){


        System.out.println("Ola eu sou um veiculo!");
        System.out.println("Mas ainda não sei oque eu sou!");

        Veiculo veiculo = new Veiculo();


        //Aviao aviao = new Aviao("Jato", Cor.BRANCO, TipoCombustivel.QUEROZENE);

        //System.out.println("Agora eu sou um: " + aviao.toString());

        //aviao.decolar();
        //aviao.pousar();

        Barco barco = new Barco();
        barco.navegar();
        barco.atracar();

    }
}
