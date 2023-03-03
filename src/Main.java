public class Main {
    public static void findMissingNo(int arr[], int n) {
        int temp[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            temp[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            temp[arr[i] - 1] = 1;
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if(temp[i] == 0)

            ans = i+1;


        }
        System.out.println(ans);

    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 7,2};
        int n=arr.length;
        findMissingNo(arr, n);
        // System.out.println("Hello world!");
    }
}