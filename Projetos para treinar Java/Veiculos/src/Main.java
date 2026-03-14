import domain.vehicle.Aviao;
import enums.Combustivel;
import enums.Cor;

public class Main {
    public static void main(String[] args){
        System.out.println("Ola eu sou um veiculo!");
        System.out.println("Mas ainda não sei oque eu sou!");

        Aviao aviao = new Aviao("Jato", Cor.BRANCO, Combustivel.QUEROZENE);

        System.out.println("Agora eu sou um: " + aviao.toString());

        aviao.decolar();

    }
}
