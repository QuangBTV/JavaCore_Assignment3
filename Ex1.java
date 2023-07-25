import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void Ques1(){
       float Salary1, Salary2;
       Salary1 = (float) 5240.5;
       Salary2 = (float) 10970.055;
        System.out.println("Salary1: "+ Salary1 +" || Salary2: "+ Salary2);
       int castSalary1= (int) Salary1;
       int castSalary2= (int) Salary2;
        System.out.println("Salary1': "+ castSalary1 +" || Salary2': "+ castSalary2);
    }
    public static void Ques2(){
        Random rd = new Random();
        int a = rd.nextInt(0,99999);
        while (a<10000){
            a*=10;
        }
        System.out.println("Số ngẫu nhiên 5 chữ số là: " + a);
    }
    public static void Ques3(){
        Random rd = new Random();
        int a = rd.nextInt(0,99999);
        while (a<10000){
            a*=10;
        }
        System.out.println("Số ngẫu nhiên 5 chữ số là: " + a);
//   Cách 1: = a % 100
//        System.out.println("Hai số cuối "+ (a%100));
//   Cách 2: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
        String b = String.valueOf(a);
        System.out.println("Hai số cuối: "+b.substring(3));
    }
    public static void Ques4(){
        Scanner scanner = new Scanner(System.in);
        int a ,b;
        System.out.println(" Mời nhập 2 số nguyên khác 0 ");
        System.out.print("a = ");
         a = scanner.nextInt();
        do {
            System.out.print("b = ");
             b = scanner.nextInt();
            if (b==0){
                System.out.println("Nhập b khác 0 giùm tui");
            }
        }while (b==0);
        scanner.close();
        System.out.println("Thương a/b = "+ (float) a /(float) b);
    }
}
