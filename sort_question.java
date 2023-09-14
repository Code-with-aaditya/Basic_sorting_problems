package sort_prob;
import java.util.Scanner;
public class sort_question {
    public static void print(int[] arr) {
        for (int i: arr) {
            System.out.println(i);
        }
    }

    public static void print_str(String[] str) {
        for (String s: str) {
            System.out.println(s);
        }
    }
    public static void func(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] == 0 && arr[j+1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false) {
                return;
            }
        }
    }

    public static void func_str(String[] str) {
        for(int i = 0; i < str.length - 1; i++) {
            int min_idx = i;
            for(int j = i+1; j < str.length; j++) {
                if(str[j].compareTo(str[min_idx]) < 0) {
                    min_idx = j;
                }
            }
            if(min_idx != i) {
                String temp = str[i];
                str[i] = str[min_idx];
                str[min_idx] = temp;
            }
        }
    }
    public static void main(String[] args) {
//        Sort the zeros of given array in the last
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting: ");
        print(arr);
        System.out.println("After Sorting: ");
        func(arr);
        print(arr);

//       Sort the string in lexicographically
        System.out.println("Enter the size of an array: ");
        int m = sc.nextInt();
        String[] str = new String[m];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println("Before sorting: ");
        print_str(str);
        System.out.println("After sorting: ");
        func_str(str);
        print_str(str);
    }
}
