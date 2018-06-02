public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playmp4(String filename) {
        System.out.println("Playing in mp4 ,,,, "+filename);
    }
}
