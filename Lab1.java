//write a program ask user for his gpa and show him (A,B,C,D,F)
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter your GPA");
        double gpa=input.nextDouble();
        if(gpa<0 || gpa>4){
            System.out.println("Please enter right GPA");
        } else if (gpa >=3.67) {
            System.out.println("Your GPA is A");
        } else if (gpa>=2.67 && gpa<3.67) {
            System.out.println("Your GPA is B");

        } else if (gpa>=2 && gpa<2.67) {
            System.out.println("Your GPA is C");
        } else if (gpa>=1&& gpa<2) {
            System.out.println("Your GPA is D");

        } else {
            System.out.println("Your GPA is F");
        }
    }
}

//write a program ask user for number and print power of number
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter a number");
        int num= input.nextInt();
        int result=num*num;
        System.out.println("The power of your number is:"+" "+result);

    }
}

//write a program ask user for number and check positive or negative
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter a number");
        double num= input.nextDouble();
        if(num>0){
            System.out.println("Your number is positive");
        } else {
            System.out.println("Your number is negative");
        }


    }
}

//write a program ask user enter character and print his ascii code
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter a character");
        char ch=input.next().charAt(0);
        int Ascii=ch;
        System.out.println(Ascii);



    }
}
