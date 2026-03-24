public class bublinearshort{

    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6};

        int target = 6;

        int result = linearSearch(arr , target);

        for(int num : arr){
            System.out.print(num+ " ");

        }

        System.out.println();

        if(result!=-1){
            System.out.println("Element found on index : "+ result);

        }
        else

        System.out.println("Element not found");

    }

    public static int linearSearch(int[] arr, int target){

        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return-1;
    }
}