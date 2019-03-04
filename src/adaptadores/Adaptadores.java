package adaptadores;

/**
 *
 * @author Fran
 */
public class Adaptadores {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        MediaPlayer player = new MP3();
        player.play("file.mp3");
        player = new FormatAdapter(new MP4());
        player.play("file.mp4");
        player = new FormatAdapter(new VLC());
        player.play("file.avi");
    }

    private static class FormatAdapter implements MediaPlayer {

        /**
         * Atributo de tipo MediaPackage.
         */
        private MediaPackage media;

        /**
         * El constructor recibe un parametro MediaPackage para adaptarlo.
         *
         * @param media
         */
        public FormatAdapter(MediaPackage m) {
            media = m;
        }

        /**
         * implementamos el metodo play(String filename); de MediaPlayer y este
         * a su vez llama al método de MediaPackage playFile(String filename);
         *
         * @param filename
         */
        @Override
        public void play(String filename) {
            System.out.print("Using Adapter --> ");
            media.playFile(filename);
        }
    }
}
