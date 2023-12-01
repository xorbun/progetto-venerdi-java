package multimediaclass;
import interfaces.volume;
public class audio extends multimedia implements volume
{

    String titolo;
    int vol;
    public audio(String titolo, int durata)
    {
        super(durata);
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
}
