package instrumentos;

/**
 * Interfaz base para instrumetnos
 */
interface InstrumentoMusical {

    /**
     * metodo abstracto
     */
    void tocar();
    /**
     * metodo abstracto
     */
    void afinar();

    /**
     * Posible retrono de un nombre
     * @return cadena
     */
    String tipoInstrumento();

    /**
     * Pusible solo impreison de mensaje
     */
    void tocarOdeToTheJoy();
}
