import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please give me a whole number!");
        int szam1=scanner.nextInt();
        double szam=szam1/2.+1;
        System.out.println(szam);
        String csillag="*";
        String szunet="";
        for(int k=1;k<szam-1;k++){
            szunet+=" ";
        }
        for(int i=1;i<szam1+1;i=i+2){
            System.out.println(szunet + csillag);
            csillag+="**";
            szunet=szunet.replaceFirst(".$","");
        }
        String csillag2="";
        for(int k=1;k<szam1-1;k++){
            csillag2+="*";}
        for(double j=szam1;j>0;j=j-1){
            szunet+=" ";
            System.out.println(szunet + csillag2);
            csillag2=csillag2.replaceFirst(".$","");
            csillag2=csillag2.replaceFirst(".$","");
        }

    }
}
