package director;

import builder.CarroBasicoBuilder;
import builder.CarroCompletoBuilder;
import builder.CarroEsportivoBuilder;
import model.Carro;

public class DirectorCarro {

    public Carro ConstruirCarroBasico(CarroBasicoBuilder builder){

        builder.reset();
        builder.atribuirMotor();
        builder.atribuirCor();
        builder.atribuirQuantidadeDePortas();
        builder.atribuirArCondicionado();
        builder.atribuirAirbag();
        return builder.getCarro();
    }

    public Carro ConstruirCarroEsportivo(@org.jetbrains.annotations.UnknownNullability CarroEsportivoBuilder builder){

        builder.reset();
        builder.atribuirMotor();
        builder.atribuirCor();
        builder.atribuirQuantidadeDePortas();
        builder.atribuirArCondicionado();
        builder.atribuirAirbag();
        return builder.getCarro();
    }

    public Carro ConstruirCarroCompleto(@org.jetbrains.annotations.UnknownNullability CarroCompletoBuilder builder){

        builder.reset();
        builder.atribuirMotor();
        builder.atribuirCor();
        builder.atribuirQuantidadeDePortas();
        builder.atribuirArCondicionado();
        builder.atribuirAirbag();
        return builder.getCarro();
    }

}
