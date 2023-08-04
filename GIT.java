/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

/**
 *
 * @author ramos
 */
public class GIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 8;

        if (numero1 < numero2) {
            System.out.println("número1 no es mayor que número2");
        }

        if (numero2 > 0) {
            System.out.println("número2 es positivo");
        }

        if (numero2 < 0 || numero2 != 0) {
            System.out.println("número2 no es negativo o distinto de cero");
        }

        if (numero1 + 1 >= numero2) {
            System.out.println("Incrementar en 1 unidad el valor de numero1 no lo hace mayor o igual que número2");
        }
    }
    
}
