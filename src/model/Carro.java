package model;

public class Carro {

    private String motor;
    private String cor;
    private String quantidadeDePortas;
    private String arCondicionado;
    private String airbag;


    public String getAirbag() {
        return airbag;
    }

    public String getArCondicionado() {
        return arCondicionado;
    }

    public String getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public String getCor() {
        return cor;
    }

    public String getMotor() {
        return motor;
    }

    public void setAirbag(String airbag) {
        this.airbag = airbag;
    }

    public void setArCondicionado(String arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public void setQuantidadeDePortas(String quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor='" + motor + '\'' +
                ", cor='" + cor + '\'' +
                ", quantidadeDePortas='" + quantidadeDePortas + '\'' +
                ", arCondicionado='" + arCondicionado + '\'' +
                ", airbag='" + airbag + '\'' +
                '}';
    }
}
