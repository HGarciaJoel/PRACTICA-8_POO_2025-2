package instrumentos;

/**
 * @author HGarciaJoel
 */

/**
 * Clase que recrea una flauta
 */
public class Flauta extends InstrumentoDeViento{
    /**
     * Atributos:
     * @param nombreInstrumetno se refeiere a una cadena que contiene el nombre del intrumetno
     */
    private String nombreInstrumento;

    public Flauta(String nombreInstrumento) {
        this.nombreInstrumento = nombreInstrumento;
    }


    @Override
    public void tocar() {

    }

    @Override
    public void afinar() {

    }

    @Override
    public String toString(){
        return super.toString() + "\nNombre del instrumento: " + nombreInstrumento;
    }
}
