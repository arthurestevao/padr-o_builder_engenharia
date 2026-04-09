package builder;

import model.Carro;

public class CarroConcrectBuilder implements CarroBuilder {

    private Carro carro;

    public CarroConcrectBuilder() {
        this.reset();
    }

    @Override
    public void reset(){
        this.carro = new Carro();
    }

    @Override
    public void atribuirMotor(String motor) {
        this.carro.setMotor(motor);
    }

    @Override
    public void atribuirCor() {

    }

    @Override
    public void atribuirQuantidadeDePortas() {

    }

    @Override
    public void atribuirArCondicionado() {

    }

    @Override
    public void atribuirAirbag() {

    }

    @Override
    public void atribuirCor(String cor) {
        carro.setCor(cor);
    }

    @Override
    public void atribuirQuantidadeDePortas(String portas) {
        carro.setQuantidadeDePortas(portas);
    }

    @Override
    public void atribuirArCondicionado(String arCond) {
        carro.setArCondicionado(arCond);
    }

    @Override
    public void atribuirAirbag(String airbag) {
        carro.setAirbag(airbag);
    }

    @Override
    public Carro getCarro() {
        Carro resultado = carro;
        reset();
        return resultado;
    }

}
