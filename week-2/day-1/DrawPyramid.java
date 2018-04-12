import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please give me a number!");
        int szam=scanner.nextInt();
        String csillag="*";
        String szunet="";
        int alj=szam/2;
        for(int k=1;k<szam;k++){
            szunet+=" ";
        }
        for(int i=1;i<(szam*2);i=i+2){
            System.out.println(szunet + csillag);
            csillag+="**";
            szunet=szunet.replaceFirst(".$","");
        }
        // int belj=(szam/2)-1;
        //String szunet2="";
        //String csillag2="*";
        //for(int k=1;k<(alj*2)-1;k++){
        //    szunet2+=" ";}
        //for(int j=1;j<belj;j++){
        //    csillag2+="*";}
        //for(int i=1;i<alj;i=i+2){
        //        System.out.println(szunet2 + csillag2);
        //    }
    }
}
