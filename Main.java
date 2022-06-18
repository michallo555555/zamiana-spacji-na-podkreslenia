import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("napisz tekst");
        String tekst = scan.nextLine();
        char[] tablica = tekst.toCharArray();
        char tab[] = new char[100];

      

        System.out.println("1- zamiania spacji na podkreslenia");
        int z = scan.nextInt();
        switch (z)
        {




  case 1:
            {
                for (int i=0;i< tablica.length;i++)
                {
                    if (tablica[i]==32)
                    {
                        tablica[i]=95;
                    }
                    tab[i]=tablica[i];
                    System.out.print(tab[i]);

                }break;
            }





        }
    }

}