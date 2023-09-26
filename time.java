import java.util.Scanner;
public class time {



        static int a =0;
        static int A =0;
        static int B =0;
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()){
                a = scanner.nextInt();
                A=(a/100)*60+a%100;
            }
            if (scanner.hasNextInt()){
                B=scanner.nextInt();

            }
            int c= A+B;
            if(c<60){
                if(c==0){
                    System.out.println("000");
                }else {
                    System.out.println("0"+c);
                }
            }else {
                int d= (c/60)*100+c%60;
                System.out.println(d);
            }
        }



}
