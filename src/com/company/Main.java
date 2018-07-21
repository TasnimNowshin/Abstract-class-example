package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Ratri ratri = new Ratri();
        Tazin tazin = new Tazin();
        Maftuha maftuha = new Maftuha();

        ratri.sleep();
        ratri.works();

        tazin.sleep();
        tazin.works();

        maftuha.sleep();
        maftuha.works();*/

        Human rattre = new Ratri(); //superclass ke reference dhore subclass er constructor crete kora jay. here Human is superclass and Ratri is subclass.

        Human onu = new Human() {
            @Override
            void works() {
                System.out.println("Clean");
            }
        };

        rattre.sleep();
        rattre.works();

        onu.sleep();
        onu.works();
    }
}
