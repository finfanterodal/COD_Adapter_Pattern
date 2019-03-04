package adaptadores;

/**
 * Clase del reproductor en formato mp3.
 *
 * @author Fran
 */
public class MP3 implements MediaPlayer {

    /**
     * Método implementado de MediaPlayer que reproducirá video en fomato mp3.
     *
     * @param filename nombre del archivo.
     */
    @Override
    public void play(String filename) {
        System.out.println("Playing MP3 File " + filename);
    }

}
