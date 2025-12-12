
// import java.util.Arrays;
import java.util.Scanner;
//----------------------------------------------------------------------------------------------------------------------
// 1find sum of array
// 2max of array
// 3reverse of array
// 4sort array

// 5reverse of char array
// 6no. of chars in a string

//-----------------------------------------------------------------------------------------------------------

// 5
// public class interview_imp {
//     public static void main(String[] args) {

//         char[] s = new char[5];

//         s[0] = 'A';
//         s[1] = 'B';
//         s[2] = 'C';
//         s[3] = 'D';
//         s[4] = 'E';

//         for (int i = 0; i < s.length / 2; i++) {
//             char temp = s[i];
//             s[i] = s[s.length - 1 - i];
//             s[s.length - 1 - i] = temp;
//         }

//         System.out.println(s);

//     }
// }

//-----------------------------------------------------------------------------------------------------------------

//1
// public class interview_imp{
//     public static void main(String[] args) {
//         char num[]={1,2,3,4,5,6};
//          int sum=0;

//         for(int i = 0;i<num.length;i++){
//             sum=sum+num[i];
//         }
//         System.out.println(sum);
//     }
// }

// -----------------------------------------------------------------------------------------------------------

// 2
// public class interview_imp{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter size of array");
//         int n=sc.nextInt();
//         int arr[]= new int[n];
//         System.out.println("enter"+n+"elements: ");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("You entered: ");
//         for(int num:arr){
//             System.out.println(num);
//         }

//         int max=0;
//         System.out.println("Max value is: ");
//         for(int j=0;j<arr.length;j++){
//             if(max<arr[j]){
//                 max=arr[j];
//             }
//             else{
//                 max=max;
//             }

//         }
//         System.out.println(max);
//     }
// }

//------------------------------------------------------------------------------------------------------------

//3
// public class interview_imp{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         System.out.println("size of array");
//         int n=sc.nextInt();
//         int s[]= new int[n];
//         System.out.println("enter "+" elements in array");
//         for(int i=0;i<n;i++){
//             s[i]=sc.nextInt();
//         }
//         System.out.println("Array: ");
//         for(int num=0;num<s.length;num++){
//             System.out.println(s[num]);
//         }

//         System.out.println("Reverse of array: ");
//         for(int j=0;j<s.length/2;j++){
//             int temp=s[j];
//             s[j]=s[s.length-1-j];
//             s[s.length-1-j]=temp;
//         }
//         for(int k:s){
//             System.out.println(k);
//         }

//     }

// }

//----------------------------------------------------------------------------------------------------------------------------------------------------
//4

// public class interview_imp {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter size of array");
//         int n = sc.nextInt();
//         int[] s = new int[n];
//         System.out.println("enter " + n + " elements");
//         for (int i = 0; i < n; i++) {
//             s[i] = sc.nextInt();
//         }
//         System.out.println("Entered elements");
//         for (int j : s) {
//             System.out.println(j);
//         }

//         for (int k = 0; k < s.length-1; k++) {
//             for (int m = 0; m < s.length - 1 - k; m++) {
//                 if (s[m] > s[m + 1]) {
//                     int temp = s[m];
//                     s[m] = s[m + 1];
//                     s[m + 1] = temp;
//                 }
//             }
//         }
//         System.out.println("Sorted array: ");
//         for (int h : s) {
//             System.out.println(h);
//         }

//     }
// }
//---------------------------------------------------------------------------------------------------------------------------


//6

public class interview_imp{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        char s[]=new char[n];
        System.out.println("Enter "+ n+" elemts");
        for(char i=0;i<n;i++){
            s[i]=sc.next().charAt(0);
        }
        for(int k:s){
            System.out.println(k);
        }
    }
}