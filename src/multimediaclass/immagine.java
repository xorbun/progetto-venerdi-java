package multimediaclass;
import interfaces.luminosità;
public class immagine extends multimedia implements luminosità
{
    String titolo;
    int lum;
    public immagine(int durata,String titolo)
    {

        super(durata);
        this.titolo=titolo;
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
}
