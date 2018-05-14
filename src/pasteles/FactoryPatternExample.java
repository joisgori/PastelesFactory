/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasteles;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class FactoryPatternExample {
    public static void main(String[] args) {
        //Crea un pastel pequeño de Fresas
        Pasteles pastel = PastelesFactory.getPasteles(PastelesType.PEQUENIO);
        pastel.sabores();
        //Crea un pastel mediano de Caramelo
        pastel = PastelesFactory.getPasteles(PastelesType.MEDIANO);
        pastel.sabores();
        //Crea un pastel grande de Chocolate
        pastel = PastelesFactory.getPasteles(PastelesType.GRANDE);
        pastel.sabores();
    }
}
