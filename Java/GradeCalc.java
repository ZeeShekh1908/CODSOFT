import java.util.*;
import javax.swing.*;

public class GradeCalc {
    GradeCalc(){
        int marks[];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of subjects.."));
        int[] marks=new int[n];
        for(int i=0;i<n;i++){
            marks[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Marks of Subject ->"+(i+1)));
        }
        for(int i=0;i<n;i++){
            JOptionPane.showMessageDialog(null,"Marks of subject: "+(i+1)+" "+"is"+ "->"+ marks[i]);
        }
        int totalMarks=n*100;
        JOptionPane.showMessageDialog(null,"Total marks: "+totalMarks);
        int marksObtained=0;
        for(int i=0;i<n;i++){
            marksObtained +=marks[i];
        }
        JOptionPane.showMessageDialog(null,"Marks obtained are: "+marksObtained);
        double avg=marksObtained/n;
        JOptionPane.showMessageDialog(null,"Average Percentage is: "+avg);
        if(avg>=85){
            JOptionPane.showMessageDialog(null,"Congratulations! your grade is: A");
        }
        else if(avg>=70 && avg<85){
            JOptionPane.showMessageDialog(null,"Very good! your grade is: B");
        }
        else if(avg>=55 && avg<70){
            JOptionPane.showMessageDialog(null,"Good! your grade is: C");
        }
        else if(avg>=33 && avg<55){
            JOptionPane.showMessageDialog(null,"Your grade is: D");
        }
        else{
            JOptionPane.showMessageDialog(null,"You are not promoted! :(");
        }
    }
    private static String GradeCalc() {
        throw new UnsupportedOperationException("Unimplemented method 'GradeCalc'");
    }
}
