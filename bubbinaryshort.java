public class bubbinaryshort{

    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6};

        int target = 6;

        int result = binarySearch(arr , target);

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

    public static int binarySearch(int[] arr , int target){

        int left=0;
        int right=arr.length;
        

        while (left<=right) {

            int mid=(left + right)/2;

            if(arr[mid]==target){

                return mid;
            }
            else if(arr[mid]>target)
            right = mid-1;

            else

            left =mid+1;

            
        }
        return -1;
    }
}