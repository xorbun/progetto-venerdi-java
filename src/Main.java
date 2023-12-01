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

        Scanner input=new Scanner(System.in);
        selector=input.nextInt();
        switch (selector)
        {
            case 1:
            {
                Scanner input2=new Scanner(System.in);
                System.out.println("inserisci il titolo di 5 canzoni");
                Audio []canzone=new Audio[5];
                for(int i=0;i<5;i++)
                {
                    String titolo=input2.nextLine();
                    canzone[i]=new Audio(titolo);

                }
                for(int i=0;i<5;i++)
                {
                    System.out.println(canzone[i].toString());
                }
                input2.close();
                break;
            }
            case 2:
            {
                Scanner input2=new Scanner(System.in);
                String titolo=input2.nextLine();
                Video film= new Video(titolo);
                input2.close();
                break;
            }
            case 3:
            {
                Scanner input2=new Scanner(System.in);
                String nome=input2.nextLine();
                Immagine foto=new Immagine(nome);
                input2.close();
                break;
            }
        }





        input.close();
    }
}