package builder;

import model.Carro;

public interface CarroBuilder {

    void reset();

    void atribuirMotor();
    void atribuirCor();
    void atribuirQuantidadeDePortas();
    void atribuirArCondicionado();
    void atribuirAirbag();

    Carro getCarro();

}
