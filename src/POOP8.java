/**
 * @author HGarcia Joel
 */

import instrumentos.Flauta;

/**
 * Clase ejecutora POOP8
 */
public class POOP8 {
    /**
     * main
     */
    public static void main(String[] args) {
        Flauta f1 = new Flauta("Flauta jokar");

        System.out.println(f1.toString());

        f1.tocarOdeToTheJoy();

        System.out.println(Meses.NOMBRE_MESES[Meses.CUATRO]);
    }
}
