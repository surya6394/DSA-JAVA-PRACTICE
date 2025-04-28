package Recursion;

public class ReverseArray {

    public static void printArray(int arr[], int n){
        System.out.println("Recursive Reversed Array = ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void reversedArray(int arr[], int start, int end){
        if(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reversedArray(arr,start+1,end-1);
        }

    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,6,4};

        reversedArray(arr,0,n-1);
        printArray(arr,n);
    }

}
