import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char clr=sc.next().charAt(0);
        switch(clr){
        case 'R':
        System.out.println("Red");
        break;
        case 'B':
        System.out.println("Blue");
        break;
        case 'G':
        System.out.println("Green");
         break;
        case 'O':
        System.out.println("Orange");
         break;
        case 'Y':
        System.out.println("Yellow");
         break;
         case 'W':
        System.out.println("white");
         break;
         default:
         System.out.println("invalid code");
    }
}
}