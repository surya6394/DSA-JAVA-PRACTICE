package BasicExamples;

// Reverse with space optimized iterative method
public class ReverseArray2 {
    public static void printArray(int arr[], int n){
        System.out.println("Reversed Array with optimized space = ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]+ " ");
        }
    }

    public static void reverseArray(int arr[], int n){
        int p1 = 0, p2 = n-1;
        while (p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        printArray(arr,n);
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {3,8,1,4,7};
        reverseArray(arr,n);
    }
}
