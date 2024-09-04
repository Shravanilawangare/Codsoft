import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("GRADE CALCULATOR");
        System.out.println("Enter the number of subjects");
        int sub=sc.nextInt();
        int totalmarks=0;
        for(int i=0;i<sub;i++){
            System.out.println("Enter marks obtained in subject :"+ (i+1) + ":");
            int marks=sc.nextInt();
            totalmarks += marks;
        }
        double average=(double)totalmarks/sub;
        char Grade='A';
        if (average>=90) {
            System.out.println(Grade='O');
        }else if(average>=80){
            System.out.println(Grade='A');
        }else if(average>=70){
            System.out.println(Grade='B');
        }else if(average>=60){
            System.out.println(Grade='C');        
        }else if(average>=50){
            System.out.println(Grade='D');        
        }else{
            System.out.println("Fail");
        }
        System.out.println("Total Marks :"+ totalmarks);
        System.out.println("Average Percentage :"+ average);
        System.out.println("Grade obtained:"+ Grade);
    }
}
