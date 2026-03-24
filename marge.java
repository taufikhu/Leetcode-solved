public class marge {
    public static void main(String args[]) {
        int arr[] = {8, 9, 4, 7, 5, 2};

        mergeSort(arr, 0, arr.length - 1);

        // Print final sorted array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            mergeArr(arr, l, mid, r);
        }
    }

    public static void mergeArr(int[] arr, int l, int mid, int r) {
        int i = l;
        int j = mid + 1;
        int k = 0;

        int temp[] = new int[r - l + 1];

        // Compare and merge
        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining right part
        while (j <= r) {
            temp[k++] = arr[j++];
        }

        // Copy temp back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[l + x] = temp[x];
        }
    }
}
