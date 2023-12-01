package multimediaclass;
import interfaces.volume;
import interfaces.luminosità;
public class video extends multimedia implements volume,luminosità
{
    String titolo;
    int vol;
    int lum;

    public video(String titolo,int durata)
    {
        super(durata);
        this.titolo=titolo;
        this.vol=5; //volume di default
        this.lum=5; //luminosità di default
    }

    @Override
    public void alzalum()
    {
        vol=vol+1;
    }

    @Override
    public void abbassalum()
    {
        vol=vol-1;
    }

    @Override
    public void alzavol()
    {
        lum=lum+1;
    }

    @Override
    public void abbassavol()
    {
        lum=lum-1;
    }

    public video(int durata)
    {
        super(durata);
    }
}
