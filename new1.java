public class new1 {

    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6};

        int target = 5;

        int result = binarySearch(arr , target);

        if(result!=-1){
            System.out.println("Element found on index :"+result);

        
        }
        else 
        System.out.println("element not found");
    }

    public static int binarySearch(int[] arr , int target){

        int left =0;
        int right = arr.length;
         
        while(left<=right){

            int mid=(left+right)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target)

            left = mid+1;
            else 

            right = mid-1;
        }
        return -1;

    }
    
}
