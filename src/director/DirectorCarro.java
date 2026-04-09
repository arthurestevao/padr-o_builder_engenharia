package director;

import builder.CarroBuilder;
import model.Carro;

public class DirectorCarro {

    private CarroBuilder builder;

    public DirectorCarro(CarroBuilder builder) {
        this.builder = builder;
    }

    public void construirCarroBasico(){

        builder.reset();
        builder.atribuirMotor("1.0");
        builder.atribuirCor("Sortido");
        builder.atribuirQuantidadeDePortas("Duas");
        builder.atribuirArCondicionado("Sem ar-condicionado");
        builder.atribuirAirbag("Airbag básico");
    }

    public void construirCarroEsportivo(){

        builder.reset();
        builder.atribuirMotor("4.0");
        builder.atribuirCor("Vermelho");
        builder.atribuirQuantidadeDePortas("Quatro");
        builder.atribuirArCondicionado("Ar-condicionado Potente");
        builder.atribuirAirbag("Airbag Potente");
    }

    public void construirCarroCompleto(){

        builder.reset();
        builder.atribuirMotor("3.0");
        builder.atribuirCor("Preto");
        builder.atribuirQuantidadeDePortas("Seis");
        builder.atribuirArCondicionado("Ar-condicionado Potente");
        builder.atribuirAirbag("Airbag Potente");
    }

}
