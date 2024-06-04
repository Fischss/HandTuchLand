package fish.ue115;

import java.util.Scanner;

public class MinMax {

    public void benutzerdialog(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie eine zahl ein:");
        int x = sc.nextInt();
        System.out.println("Geben sie eine weitere zahl ein:");
        int y = sc.nextInt();

        if(x > y){
            System.out.printf("Die Zahl %d ist größer als die zahl %d\n", x, y);
        } else if(x == y) {
            System.out.printf("Die Zahlen %d und %d sind gleich\n", x, y);
        }else  {
            System.out.printf("Die Zahl %d ist kleiner als die zahl %d \n", x, y);
        }

    }

}
