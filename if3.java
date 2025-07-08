import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char gen=sc.next().charAt(0);
        int n=sc.nextInt();
        if(gen=='f'){
            if(n>=1&&n<=58){
            System.out.println("the percentage of interest is 8.2%");
            }
        else{
            System.out.println(" the percentage of interest is 9.2%.");
            }
        }
        if(gen=='m'){
            if(n>=1&&n<=58){
            System.out.println("the percentage of interest is 8.4 %");
            }
        else{
            System.out.println(" the percentage of interest is 10.5%.");
            }
        }
    }
}