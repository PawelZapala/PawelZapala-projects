import java.util.Scanner;
public class AverageValue {
        public static void main(String[] args) {
            int n;
            double res=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter how many numbers you want to calculate the average ");
            n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter   " + n + "  numbers");
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=0;i<n;i++)
                res =res+a[i];
            System.out.println("average="+res/n);
        }
}