package edu.estatuas.bicipalma.;

import domain.estacion.Estacion;

public class BiciPalma {

    public static void main(String[] args) {

        Estacion estacion = new Estacion(1, "Manacor", 6);

        /*
         * caso TEST visualizar estado de la estacion:
         * muestra id, direccion, anclaje
         */

        System.out.println("\n **** caso TEST visualizar estado de la estacion **** \n");

        estacion.consultarEstacion();
    }