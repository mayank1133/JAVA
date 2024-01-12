import java.util.Scanner;
public class Abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[5];
        for(int n=1;n<=5;n++)
        {
            System.out.println("Enter the marks subject"+n+":");
            marks[n]=sc.nextInt();
        }
        for(int n=1;n<=5;n++)
        {
            System.out.println("Marks of Subject"+n+":"+marks[n]);
        }
        sc.close();
   }
}
