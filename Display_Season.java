import java.io.*;
class sample {
    public static void main(String args[])throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         //System.out.println("enter season");
        int a = Integer.parseInt(br.readLine());
        if (a == 6 || a==4 || a==5) {
            System.out.println("Summer");
        } 
        else if (a==11||a == 10 || a==7 || a==8 ||a==9) {
            System.out.println("Rainy");
        }
        else if(a == 1 || a==11 || a==12){
            System.out.println("Winter");
        }
        else if(a==2||a==3){
            System.out.println("Spring");
        }
        else{
            System.out.println("-1");
        }
    }
    
}
