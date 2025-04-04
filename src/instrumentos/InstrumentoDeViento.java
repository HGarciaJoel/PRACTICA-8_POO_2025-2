package instrumentos;

/**
 * @author HGarcia Joel
 */

/**
 * Clase que recrea un instrumetno de tipo viento (abstracto)
 */
public abstract class InstrumentoDeViento implements InstrumentoMusical{
    /**
     * Atributos
     * @paramm TIPO_INTRUMENTO Cadena constante y por lo tanto inmutable
     */
    private final String TIPO_INSTRUMENTO = "IntrumentoVieneto";

    /**
     * metodo abstracto
     */
    public abstract void tocar();

    /**
     * metodo abstracto
     */
    public abstract void afinar();

    /**
     * Retorna una cadena
     * @return cadena que contiene el tipo de intrumento que guarda la calase
     */
    public String tipoInstrumento(){
        return TIPO_INSTRUMENTO;
    }

    /**
     * Obtiene los parametros del objeto en forma de cadena
     * @return cadena que contiene los atributos del objeto
     */

    public void tocarOdeToTheJoy(){
        System.out.println("Tu tu ti ti tu tu ti ti tu tu");
    }

    public String toString(){
        return super.toString() +"\nTipo de instrumento: " + TIPO_INSTRUMENTO;
    }
}
