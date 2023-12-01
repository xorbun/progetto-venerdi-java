package multimediaclass;
import interfaces.Luminosità;
import interfaces.show;
import java.util.Arrays;

public class Immagine extends Multimedia implements Luminosità,show
{
    String titolo;
    int lum;
    public Immagine( String titolo)
    {
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

    @Override
    public void show()
    {
        String[] arraylum=new String[this.lum];
        for(int i=0;i<this.lum;i++)
        {
            arraylum[i]="*";
        }
        String lumonscreen= Arrays.toString(arraylum);
        System.out.println(this.titolo+ lumonscreen);
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "titolo='" + titolo + '\'' +
                ", lum=" + lum +
                '}';
    }
}
