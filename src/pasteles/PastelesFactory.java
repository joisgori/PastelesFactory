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
public class PastelesFactory {
    
    public static Pasteles getPasteles(PastelesType criteria){
        switch (criteria){
            case PEQUENIO:
                return new Fresas();
            case MEDIANO:
                return new Caramelo();
            case GRANDE:
                return new Chocolate();                   
        }
        return null;
    }
    
}
