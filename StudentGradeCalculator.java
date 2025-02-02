import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int num = sc.nextInt();
        float marks[]= new float [num];
        float totalMarks = 0;
        for(int i=0;i<num;i++){
        System.out.print("Enter marks(1-100) of subject "+(i+1)+ ": ");
        marks[i]=sc.nextInt();
        totalMarks = totalMarks+marks[i];
    }
    float avgPercentage = totalMarks/num;
    char grade;
        if(avgPercentage>=90){
        grade = 'A';
    }else if(avgPercentage>=80){
        grade = 'B';
    }else if(avgPercentage>=70){
        grade = 'C';
    }else if(avgPercentage>=60){
        grade = 'D';
    }else{
        grade = 'F';
    }
    System.out.println("Results:-");
    System.out.println("Total Marks: "+totalMarks);
    System.out.println("Average Percentage: " +avgPercentage);
    System.out.println("Grade: "+grade);
    sc.close();
}
}