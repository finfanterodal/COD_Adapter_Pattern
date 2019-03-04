package adaptadores;

/**
 * Clase del reproductor en formato mp4.
 *
 * @author Fran
 */
public class MP4 implements MediaPackage {

    /**
     * Método implementado de MediaPackage que reproducirá video en fomato mp4.
     *
     * @param filename nombre del archivo.
     */
    @Override
    public void playFile(String filename) {
        System.out.println("Playing MP4 File " + filename);
    }

}
