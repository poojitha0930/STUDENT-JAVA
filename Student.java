import java.util.Scanner;
import java.io.*;
public class Student
{
    String USN;
    String Name;
    String Branch;
    String Phone;
    Student(String reg,String Name,String Branch,String Phone)
    {
        this.USN=reg;
        this.Name=Name;
        this.Branch=Branch;
        this.Phone=Phone;
    }
    void displayRecord()
    {
        System.out.println(USN +"\t\t"+ Name+"\t\t"+Branch+"\t\t"+Phone);
    }
    public static void main(String args[])
    {
        Student s[]=new Student[100];
        System.out.println("Enter the number of students");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter students details");
        for(int i=0;i<n;i++)
        {
            System.out.print("USN: ");
            String USN=sc.next();
            System.out.print("\nName: ");
            sc.nextLine();
            String Name=sc.nextLine();
            System.out.print("\nBranch: ");
            String Branch=sc.nextLine();
            System.out.print("\nPhone: ");
            String Phone=sc.next();
            s[i]=new Student(USN,Name,Branch,Phone);
        }
        System.out.println("USN\t\tName\t\tBranch\t\tPhone");
        for(int j=0;j<n;j++)
        {
            s[j].displayRecord();
        }
    }
}
 