package builder;

import model.Carro;

public interface CarroBuilder {

    void reset();

    void atribuirMotor(String s);
    void atribuirCor();
    void atribuirQuantidadeDePortas();
    void atribuirArCondicionado();
    void atribuirAirbag();

    void atribuirCor(String cor);

    void atribuirQuantidadeDePortas(String porta);

    void atribuirArCondicionado(String arCond);

    void atribuirAirbag(String airbag);

    Carro getCarro();

}
