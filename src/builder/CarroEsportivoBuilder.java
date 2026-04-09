package builder;

import model.Carro;

public class CarroEsportivoBuilder implements CarroBuilder {

    private Carro carro;

    public CarroEsportivoBuilder() {
        reset();
    }

    @Override
    public void reset() {
        carro =  new Carro();
    }

    @Override
    public void atribuirMotor() {
        carro.setMotor("Motor Esportivo");
    }

    @Override
    public void atribuirCor() {
        carro.setCor("Vermelho");
    }

    @Override
    public void atribuirQuantidadeDePortas() {
        carro.setQuantidadeDePortas("Quatro");
    }

    @Override
    public void atribuirArCondicionado() {
        carro.setArCondicionado("Importado");
    }

    @Override
    public void atribuirAirbag() {
        carro.setAirbag("Modelo Seguro");
    }

    @Override
    public Carro getCarro() {
        Carro resultado = this.carro;
        reset();
        return resultado;
    }

    @Override
    public String toString() {
        return "CarroEsportivoBuilder{" +
                "carro=" + carro +
                '}';
    }




}
