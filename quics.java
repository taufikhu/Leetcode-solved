public class quics {
    


    public static void quickSort(int[] arr, int low, int high){

        if(low<high){


            int pi = partition(arr, low, high);

            quickSort(arr, low, pi -1);

            quickSort(arr, pi +1, high);
        }
    }

    private static int partition(int[] arr , int low, int high){

        //8 ,4, 5, 1, 6, 3, 2

        int pivot = arr[high];
        int i = low  - 1;
        int tem = 0;

        for(int j = low; j<high ; j++){

            if (arr[j]<pivot){
                i++;

                tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;

            }
        }
        tem = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = tem;

        return i+1;
    }
    public static void main(String[] args) {
        
        int arr[] = { 8, 4, 5, 1, 6, 3, 2};

      
        quickSort(arr, 0 , arr.length-1);

        for(int nums : arr){

            System.out.print(nums+ " ");
        }

    }


}
