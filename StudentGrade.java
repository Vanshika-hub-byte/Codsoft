 import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        
        System.out.println("Enter number of subject :");
        try (Scanner sc = new Scanner(System.in)) {
            int sub = sc.nextInt();

            int[]marks=new int[sub];
            int totmarks=0;

            for(int i=0; i<sub; i++){
                System.out.println("enter marks obtained in " +(i+1) + " subject out of 100 :");
              marks[i] = sc.nextInt();

              totmarks+=marks[i];
            }
             
            double Percentage = (double) totmarks/(sub*100)*100;

            System.out.println("Total :"+totmarks);
            System.out.println("Percentage :"+Percentage);

            if(Percentage>=90){
                System.out.println("Grade A");
            }

            else if (Percentage>=80){
                System.out.println("Grade B");
            }

            else if(Percentage>=70){
                System.out.println("Grade C");
            }

            else if(Percentage>=60){
                System.out.println("Grade D");
            }

            else if(Percentage>=40){
                System.out.println("Grade E");
            }
            else{
                System.out.println("Grade F");
            }
        }
    }
}
