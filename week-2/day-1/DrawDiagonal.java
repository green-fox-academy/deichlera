import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please give me a number!");
        int szam=scanner.nextInt();
        String elsoesut="";

        for (int j=1;j<=szam;j++){
            elsoesut+="%";
        }
        String kozte="";
        String kozte1="";
        for (int k=2;k<szam;k++){
            kozte+=" ";
        }
        String kozte2=kozte.replaceFirst(".$","");
        for (int i=1;i<=szam;i++){
            if (i==1 || i==szam){
                System.out.println(elsoesut);
            }
            else {
                System.out.println("%" + kozte1 + "%" + kozte2 + "%");
                kozte1+=" ";
                kozte2=kozte2.replaceFirst(".$","");
            }
        }
    }
}
