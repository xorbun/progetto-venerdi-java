package multimediaclass;
import interfaces.Volume;
import interfaces.Luminosità;

import java.util.Arrays;
import java.util.Random;

public class Video extends Multimedia implements Volume, Luminosità
{
    String titolo;
    int durata;
    int vol;
    int lum;

    public Video(String titolo)
    {
        Random rndm=new Random();
        this.durata=rndm.nextInt(1,10);
        this.titolo=titolo;
        this.vol=5; //volume di default
        this.lum=5; //luminosità di default
    }

    @Override
    public void alzalum()
    {
        lum=lum+1;
    }

    @Override
    public void abbassalum()
    {
        lum=lum-1;
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
    public void show()
    {
        String[] arraylum=new String[this.lum];
        for(int i=0;i<this.lum;i++)
        {
            arraylum[i]="*";
        }
        String lumonscreen=Arrays.toString(arraylum);
        System.out.println(this.titolo+ lumonscreen);
    }

    @Override
    public String toString() {
        return "Video{" +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                ", vol=" + vol +
                ", lum=" + lum +
                '}';
    }
}
