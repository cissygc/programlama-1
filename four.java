import java.util.Scanner;
public class four {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("please enter a number= ");
        int n = obj.nextInt();

        for (int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }



    }

}
