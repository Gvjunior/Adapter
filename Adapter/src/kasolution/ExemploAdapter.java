package kasolution;

public class ExemploAdapter {
    public static void main(String[] args) {
        ReprodutorAudio reprodutorMP3 = new ReprodutorAudioMP3("musica.mp3");
        reprodutorMP3.reproduzir(); // Saída: Reproduzindo arquivo MP3: musica.mp3

        ReprodutorAudio reprodutorWAV = new AdapterReprodutorAudioWAV("musica.wav");
        reprodutorWAV.reproduzir(); // Saída: Reproduzindo arquivo WAV: musica.wav
    }
}
