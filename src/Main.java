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
                    System.out.println("quale canzone vuoi riprodurre?");
                    System.out.println(i+")"+canzone[i].toString());
                }
                int selector2=input2.nextInt();
                

                canzone[selector2].play();
                input2.close();
                break;
            }
            case 2:
            {
                Scanner input2=new Scanner(System.in);
                System.out.println("inserisci il titolo di 5 film");
                Video[]film=new Video[5];
                for(int i=0;i<5;i++)
                {
                    String titolo=input2.nextLine();
                    film[i]=new Video(titolo);
                }
                for(int i=0;i<5;i++)
                {
                    System.out.println("quale film vuoi riprodurre?");
                    System.out.println(i+")"+film[i].toString());
                }
                int selector2=input2.nextInt();
                film[selector2].play();
                film[selector2].show();
                input2.close();
                break;
            }
            case 3:
            {
                System.out.println("inserisci il titolo di 5 immagini");
                Scanner input2=new Scanner(System.in);
                Immagine[] foto=new Immagine[5];
                for(int i=0;i<5;i++)
                {
                    String nome=input2.nextLine();
                    foto[i]=new Immagine(nome);
                }
                for(int i=0;i<5;i++)
                {
                    System.out.println("quale immagine vuoi visualizzare?");
                    System.out.println(i+")"+foto[i].toString());
                }
                int selector2=input2.nextInt();
                foto[selector2].show();
                input2.close();
                break;
            }
        }





        input.close();
    }
}