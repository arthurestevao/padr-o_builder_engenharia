package builder;

import model.Carro;

public class CarroBasicoBuilder implements CarroBuilder {

    private Carro carro;

    public CarroBasicoBuilder() {
        reset();
    }

    @Override
    public void reset() {
        carro =  new Carro();
    }

    @Override
    public void atribuirMotor() {
        carro.setMotor("Motor Básic");
    }

    @Override
    public void atribuirCor() {
        carro.setCor("Sortida");
    }

    @Override
    public void atribuirQuantidadeDePortas() {
        carro.setQuantidadeDePortas("Duas");
    }

    @Override
    public void atribuirArCondicionado() {
        carro.setArCondicionado("Sem Ar-condicionado");
    }

    @Override
    public void atribuirAirbag() {
        carro.setAirbag("Modelo Básico");
    }

    @Override
    public Carro getCarro() {
        Carro resultado = this.carro;
        reset();
        return resultado;
    }

    @Override
    public String toString() {
        return "CarroBasicoBuilder{" +
                "carro=" + carro +
                '}';
    }
}