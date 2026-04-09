package builder;

import model.Carro;

public class CarroCompletoBuilder implements CarroBuilder{

    private Carro carro;

    public CarroCompletoBuilder() {
        reset();
    }

    @Override
    public void reset() {
        carro =  new Carro();
    }

    @Override
    public void atribuirMotor() {
        carro.setMotor("Motor Completo");
    }

    @Override
    public void atribuirCor() {
        carro.setCor("Preto");
    }

    @Override
    public void atribuirQuantidadeDePortas() {
        carro.setQuantidadeDePortas("Seis");
    }

    @Override
    public void atribuirArCondicionado() {
        carro.setArCondicionado("Ultra gelado");
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
