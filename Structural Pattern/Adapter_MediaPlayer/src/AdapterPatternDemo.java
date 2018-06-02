public class AdapterPatternDemo {

    public static void main(String[] args) {

//        System.out.println("Hello World");
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3" , "bindeshitara.mp3");
        audioPlayer.play("mp4" , "Hariyegiyechi.mp4");
        audioPlayer.play("vlc" , "OniketPrantor.vlc");
        audioPlayer.play("avi" , "Purnota.avi");

    }
}
