import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number:");
        int number=input.nextInt();
        System.out.println("While Loop");
        While(number);
        System.out.println("Do-While Loop");
        DoWhile(number);
        System.out.println("For Loop");
        ForLoop(number);
        //Part 1, Problem 2:
        System.out.println("Please enter another whole number:");
        int Number=input.nextInt();
        System.out.println("While Loop with Break");
        Problem2(Number);
        //Part 1, Problem 3:
        System.out.println("For Loop with Continue");
        Problem3(Number);

        //Part 2:
        int[] array= new int[5];
        array[0]=5;
        array[1]=1;
        array[2]=3;
        array[3]=9;
        array[4]=2;
        printArrayInStars(array);
    }
    //Part 1:
    public static void While(int n){
        int i=1;
        while (i<=n){
            System.out.println("Current value="+i);
            i++;

        }
    }
    public static void DoWhile(int N){
        int I=1;
        do{
            System.out.println("Current value="+I);
            I++;
        } while(I<=N);
    }
    public static void ForLoop(int t){
        for(int j=1; j<=t; j++){
            System.out.println("Current value="+j);
        }
    }
    public static void Problem2(int T){
        int i=0;
        while (i<=T){
            System.out.println("Current value="+i);
            i++;
            if(i==T/2){
                //System.out.println("Current value="+i);
                break;
            }
        }
    }
    public static void Problem3(int J){
        for(int j=0; j<=J;j++){
            if (j==J/2){
                continue;
            }
            System.out.println("Current value="+j);
        }
    }
    //Part 2:
    public static void printArrayInStars(int[] a){
        for(int i=0; i<=a[i];i++) {
            int j=0;
            System.out.println();
            do {
                System.out.print('*');
                j++;
            } while (j < a[i]);
            System.out.print(j);
        }
        }
}

