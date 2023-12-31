package multimediaclass;
import interfaces.Volume;
import interfaces.play;
import java.util.Arrays;
import java.util.Random;

public class Audio extends Multimedia implements Volume,play
{

    String titolo;
    int durata;
    int vol;
    public Audio(String titolo)
    {
        Random rndm=new Random();
        this.durata=rndm.nextInt(1,10);
        this.titolo=titolo;
        this.vol=5; //volume di default
    }

    @Override
    public void alzavol()
    {
        vol=vol+1;
    }

    @Override
    public void abbassavol()
    {
        vol=vol-1;
    }

    @Override
    public void play()
    {
        for(int i=0;i<this.durata;i++)
        {
            String[] arrayvol=new String[this.vol]; //creo un array di tipo stringa con lunghezza pari al valore della proprietà vol
            for(int j=0;j<arrayvol.length;j++)
            {
                arrayvol[j]="!";
            }
            String volonscreen= Arrays.toString(arrayvol);
            System.out.println(this.titolo+volonscreen);
        }
    }

    @Override
    public String toString()
    {
        return "Audio{" +
                "titolo='" + titolo + '\'' +
                ", vol=" + vol +
                ", durata=" + durata +
                '}';
    }
}
