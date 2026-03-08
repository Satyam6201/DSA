public class Sort {
    public static void bubble(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1 ; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selection(int arr[]) {
        int n = arr.length;

        for (int i = 0; i< n - 1; i++) {
            int min = i; // 0
            for (int j = i+1; j< n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
           }
           
           if (arr[min] != i) {
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
           }
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        // bubble(arr);
        // print(arr);

        selection(arr);
        print(arr);
    }
}
