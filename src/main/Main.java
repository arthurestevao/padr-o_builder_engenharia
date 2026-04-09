package main;

import builder.CarroBasicoBuilder;
import builder.CarroBuilder;
import builder.CarroCompletoBuilder;
import builder.CarroEsportivoBuilder;
import director.DirectorCarro;
import model.Carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CarroBasicoBuilder builder1 = new CarroBasicoBuilder();
        DirectorCarro diretor = new DirectorCarro();

        System.out.println("/// CONSTRUIR CARRO BÁSICO ///");
        Carro carroBasico = diretor.ConstruirCarroBasico(builder1);
        System.out.println(carroBasico);

        CarroEsportivoBuilder builder2 = new CarroEsportivoBuilder();
        System.out.println("/// CONSTRUIR CARRO ESPORTIVO ///");
        Carro carroEsportivo = diretor.ConstruirCarroEsportivo(builder2);
        System.out.println(carroEsportivo);

        CarroCompletoBuilder builder3 = new CarroCompletoBuilder();
        System.out.println("/// CONSTRUIR CARRO ESPORTIVO ///");
        Carro carroCompleto = diretor.ConstruirCarroCompleto(builder3);
        System.out.println(carroCompleto);

    }

}