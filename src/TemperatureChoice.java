import java.util.Scanner;
public class TemperatureChoice {
    public static void main(String[] args) {
        int temp;
        boolean cond1,cond2,cond3,cond4,cond5,cond6,cond7;
        System.out.print("Hava Kaç Derece?:");
        Scanner input = new Scanner(System.in);
        temp = input.nextInt();
        //If ve else yapıları kullanılarak alttaki commentdaki gibi yapabilirsiniz
       /* if ( temp < 5 ){
            System.out.println("Kayak Yapabilirsin.");
        } else if ( temp > 5 && temp < 15) {
            System.out.println("Sinemaya Gidebilirsin");
            
        } else if ( temp == 5 ) {
            System.out.println("Sinemaya Gidebilirsin Veya Kayak Yapabilirsin.");
            
        } else if ( temp > 15 && temp < 25 ) {
            System.out.println("Piknik Yapabilirsin.");
            
        } else if ( temp == 15 ) {
            System.out.println("Piknik Yapabilirsin veya Kayağa Gidebilirsin.");
            
        } else if ( temp > 25 ) {
            System.out.println("Yüzmeye Gidebilirsin.");
            
        } else if ( temp == 25 ) {
            System.out.println("Piknik Yapabilirsin Veya Yüzmeye Gidebilirsin.");*/
        //Boolean değişkenleri kullanılarak aşağıdaki gibi de yapılabilir.
        cond1 = (temp < 5 );
        cond2 = ( temp > 5 && temp < 15);
        cond3 = ( temp == 5 );
        cond4 = ( temp > 15 && temp < 25 );
        cond5 = ( temp == 15 );
        cond6 = ( temp == 25 );
        cond7 = ( temp > 25 );
        System.out.print(cond1 ? "Kayak Yapabilirsin." : "");
        System.out.print(cond2 ? "Sinemaya Gidebilirsin." : "");
        System.out.print(cond3 ? "Sinemaya Gidebilirsin Veya Kayak Yapabilirsin" : "");
        System.out.print(cond4 ? "Piknik Yapabilirsin." : "");
        System.out.print(cond5 ? "Sinemaya Gidebilirsin Veya Piknik Yapabilirsin." : "");
        System.out.print(cond6 ? "Piknik Yapabilirsin Veya Yüzmeye Gidebilirsin." : "");
        System.out.print(cond7 ? "Yüzmeye Gidebilirsin." : "");


        }
    }

