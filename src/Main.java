import multimediaclass.Multimedia;
import multimediaclass.Audio;
import multimediaclass.Video;
import multimediaclass.Immagine;

//l'utente può inserire solo il titolo dell' audio/film o nome dell immagine. la proprietà durata viene
//generata casualmente ogni volte che viene creata un istanza
//luminosità e volume sono settati a 5 di default alla creazione di un' istanza


import java.util.Scanner;

public class Main
{
    //
    public static void main(String[] args)
    {
        int i;
        System.out.println("cosa vuoi fare?");
        int selector;
        Multimedia [] riproduttore= new Multimedia[5];
        Scanner input=new Scanner(System.in);
        for( i=0;i< riproduttore.length;i++)
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
        System.out.println("cosa vuoi riprodurre?");
        for( i=0;i<riproduttore.length;i++)
        {
            System.out.println(i+")"+riproduttore[i]);
        }
        Scanner input2=new Scanner(System.in);
        int j=input2.nextInt();
        if(riproduttore[j] instanceof Audio)
        {
            System.out.println("1)alza volume-2)abbassa volume-3)niente");
            int volu=input2.nextInt();
            switch (volu)
            {
                case 1:
                {
                    ((Audio) riproduttore[j]).alzavol();
                    ((Audio) riproduttore[j]).play();
                    break;
                }
                case 2:
                {
                    ((Audio) riproduttore[j]).abbassavol();
                    ((Audio) riproduttore[j]).play();
                }
                case 3:
                {
                    ((Audio) riproduttore[j]).play();
                }
            }
        }
        else if(riproduttore[j] instanceof Video)
        {
            System.out.println("1)alza volume e luminosità-2)abbassa volume e luminosità-3)niente");
            int volu=input2.nextInt();
            switch (volu)
            {
                case 1:
                {
                    ((Video) riproduttore[j]).alzavol();
                    ((Video) riproduttore[j]).alzalum();
                    ((Video) riproduttore[j]).play();
                    ((Video) riproduttore[j]).show();
                }
                case 2:
                {
                    ((Video) riproduttore[j]).abbassavol();
                    ((Video) riproduttore[j]).abbassalum();
                    ((Video) riproduttore[j]).play();
                    ((Video) riproduttore[j]).show();
                }
                case 3:
                {
                    ((Video) riproduttore[j]).play();
                    ((Video) riproduttore[j]).show();
                }
            }
        }
        else if(riproduttore[j] instanceof Immagine)
        {
            System.out.println("1)alza  luminosità-2)abbassa  luminosità-3)niente");
            int volu=input2.nextInt();
            switch (volu)
            {
                case 1:
                {
                    ((Immagine) riproduttore[j]).alzalum();
                    ((Immagine) riproduttore[j]).show();
                }
                case 2:
                {
                    ((Immagine) riproduttore[j]).abbassalum();
                    ((Immagine) riproduttore[j]).show();
                }
                case 3:
                {
                    ((Immagine) riproduttore[j]).show();
                }
            }
         }
        input.close();
    }
}