import multimediaclass.Multimedia;
import multimediaclass.Audio;
import multimediaclass.Video;
import multimediaclass.Immagine;
import interfaces.Volume;
import interfaces.Luminosità;
public class Main
{
    public static void main(String[] args)
    {
       Audio musica=new Audio("the other promise", 3);
       //musica.play();
       Video film=new Video("harry potter",113);

       film.alzalum();
       film.alzalum();
       film.show();

      

    }
}