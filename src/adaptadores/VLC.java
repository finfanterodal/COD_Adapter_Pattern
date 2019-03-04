package adaptadores;

/**
 * Clase del reproductor en formato vcl.
 *
 * @author Fran
 */
public class VLC implements MediaPackage {

    /**
     * Método implementado de MediaPackage que reproducirá video en fomato VCL.
     *
     * @param filename nombre del archivo.
     */
    @Override
    public void playFile(String filename) {
        System.out.println("Playing VLC File " + filename);
    }

}
