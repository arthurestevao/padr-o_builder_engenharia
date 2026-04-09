package main;

import builder.CarroBuilder;
import builder.CarroConcrectBuilder;
import director.DirectorCarro;
import model.Carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CarroBuilder builder = new CarroConcrectBuilder();
        DirectorCarro director = new DirectorCarro(builder);

        System.out.println("\n/// CONSTRUIR CARRO BÁSICO ///");
        director.construirCarroBasico();
        Carro carroBasico = builder.getCarro();
        System.out.println(carroBasico);

        System.out.println("\n/// CONSTRUIR CARRO ESPORTIVO ///");
        director.construirCarroEsportivo();
        Carro carroEsportivo = builder.getCarro();
        System.out.println(carroEsportivo);

        System.out.println("\n/// CONSTRUIR CARRO COMPLETO ///");
        director.construirCarroCompleto();
        Carro carroCompleto = builder.getCarro();
        System.out.println(carroCompleto);



    }

}