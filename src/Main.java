import multimediaclass.Multimedia;
import multimediaclass.Audio;
import multimediaclass.Video;
import multimediaclass.Immagine;
import interfaces.Volume;
import interfaces.Luminosità;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("cosa vuoi fare?");
        int selector;
        Multimedia [] riproduttore= new Multimedia[5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i< riproduttore.length;i++)
        {
            System.out.println("1)inserisci nuova canzone-2)inserisci nuovo video-3)inserisci nuova immagine");
            selector=input.nextInt();
            switch (selector)
            {
                case 1:
                {
                   System.out.println("inserisci il titolo canzone");
                   Scanner input2=new Scanner(System.in);
                   String titolo=input2.nextLine();
                   Audio canzone=new Audio(titolo);
                   riproduttore[i]=canzone;
                   break;
                }
                case 2:
                {
                    System.out.println("inserisci il titolo del film");
                    Scanner input2=new Scanner(System.in);
                    String titolo=input2.nextLine();
                    Video film=new Video(titolo);
                    riproduttore[i]=film;
                    break;
                }
                case 3:
                {
                    System.out.println("inserisci il nome dell immagine");
                    Scanner input2=new Scanner(System.in);
                    String nome=input2.nextLine();
                    Immagine foto=new Immagine(nome);
                    riproduttore[i]=foto;
                    break;
                }
            }
        }
        for(int i=0;i<riproduttore.length;i++)
        {
            System.out.println(i+")cosa vuoi riprodurre?");
            System.out.println(riproduttore[i]);
        }
        Scanner input2=new Scanner(System.in);
        int j=input2.nextInt();
        if(riproduttore[j] instanceof Audio)
        {
            ((Audio) riproduttore[j]).play();
        }
        else if(riproduttore[j] instanceof Video)
        {
            ((Video) riproduttore[j]).play();
            ((Video) riproduttore[j]).show();
        }
        else if(riproduttore[j] instanceof Immagine)
        {
            ((Immagine) riproduttore[j]).show();
        }
        input.close();
    }
}