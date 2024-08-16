import java.util.Scanner;
public class IT24100354Lab4Q2
{
      public static void main(String [] args)
      {
         Scanner input= new Scanner(System.in);
         int ex_marks,lab_marks,per_exam,per_lab,final_score,x,y;

        System.out.print("Please enter exam marks(out of 100):");
        ex_marks=input.nextInt();
        if(ex_marks<0||ex_marks>100){
                System.out.print("Invalid input for exam marks.Terminating program");
          }
       System.out.print("Please enter lab submission marks(out of 100):");
       lab_marks  =input.nextInt();
       if(lab_marks<0||ex_marks>100){
                System.out.print("Invalid input for lab submission marks.Terminating program");
         }
       System.out.print("Please enter the percentage given for the exam:");
       per_exam=input.nextInt();
       System.out.print("Please enter the percentage given for the lab submission:");
       per_lab=input.nextInt();
       if (per_exam+ per_lab>100){
               System.out.print("The percentage must add up to 100.Terminating program");
       }else{   
      x= ex_marks*per_exam/100;
      y=lab_marks*per_lab/100;
      final_score=x+y;
      System.out.print("Final Exam Mark is:" + final_score);
            }
      }
}