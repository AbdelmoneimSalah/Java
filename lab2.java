//write a program to sum 3 digits (use function)
public class Main {
    static double sum(double num1,double num2,double num3){
        return num1+num2+num3;

    }
    public static void main(String[] args) {
        double res=sum(2,4,2);
        System.out.println(res);


    }
}

//write a Program for Fibonacci numbers (use recursion)
import java.util.Scanner;
public class Main {
    static int fibonacci (int num){
        if(num==1){
            return 1;
        } else if (num==0) {
            return 0;
        } else {
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=input.nextInt();
        for(int i=0;i<num;i++){
            int res=fibonacci(i);
            System.out.println(res);


        }



    }
}

//write function get numbers of grades and print sum and average
import java.util.Scanner;
public class Main {
    static void sum_avg(int NumOfGrades){
        Scanner input=new Scanner(System.in);
        double sum=0;
        double avg=0;
        for(int i=0;i<NumOfGrades;i++){
            System.out.println("Please Enter "+(i+1)+"st Grade");
            double num=input.nextDouble();
            sum=sum+num;
        }
        avg=sum/NumOfGrades;
        System.out.println("The total of your grades is: "+" "+sum);
        System.out.println("The average of your grades is "+" "+avg);

    }
    public static void main(String[] args) {
        sum_avg(4);



    }
}

//write a function to get n number and print from n to 0
public class Main {
    static void NtZero(int num){
        for(int i=0;i<=num;i++){
            System.out.println(num-i);
        }
    }
    public static void main(String[] args) {
        NtZero(10);



    }
}

//Write a program to display the n terms of even natural number and their sum
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter a number");
        int num=input.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){

            System.out.println(i*2);
            sum=sum+num;
            num=num-2;
            

        }
        System.out.println(sum);




    }
}

//Write a program to print all alphabets from a to z
public class Main {
    public static void main(String[] args) {
        for(char i='a';i<='z';i++){
            System.out.println(i);
        }




    }
}
