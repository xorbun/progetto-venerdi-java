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
        System.out.println("1)inserisci nuova canzone-2)inserisci nuovo video-3)inserisci nuova immagine");
        int selector;
        Multimedia [] riproduttore= new Multimedia[5];

        int selectore=0;
        Scanner input=new Scanner(System.in);
        for(int i=0;i< riproduttore.length;i++)
        {
            selectore=input.nextInt();
            switch (selectore)
            {
                case 1:
                {
                   System.out.println("inserisci il titolo canzone");
                   Scanner input2=new Scanner(System.in);
                   String titolo=input2.nextLine();
                   Audio canzone=new Audio(titolo);
                   riproduttore[i]=canzone;
                   input2.close();
                   break;
                }
                case 2:
                {
                    System.out.println("inserisci il titolo del film");
                    Scanner input2=new Scanner(System.in);
                    String titolo=input2.nextLine();
                    Video film=new Video(titolo);
                     riproduttore[i]=film;
                    input2.close();
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
            input.close();
        }
        for(int i=0;i<riproduttore.length;i++)
        {
            System.out.println(riproduttore[i]);
        }

    }
}