public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 ,,,, "+ filename);
        }
        else if (audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType , filename);
        }
        else {
            System.out.println("Invalid media. Audiotype "+audioType+" not supported");
        }
    }
}
