//import java.util.Scanner;

public class exer {

    /*public static void main(String[] args){

        int nums[] = {12, 8, 100, 15, 14, 45, 58};

        int size = nums.length;

        int temp = 0;

        System.out.println("Before Sorting");
        for(int n : nums){
            System.out.print(" "+n);

        }

        for(int i = 0; i<size; i++){

            for(int j =0 ; j<size-1; j++){
                if(nums[j]>nums[j+1]){

                    temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]=temp;
        
                }
            }
        }

        System.out.println();
        System.out.println("After Sorting");
        for(int n : nums){
            System.out.print(" "+ n);
        }
    
    
    
    
    }
        
        /*Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number from the Array");

        int tar = sc.nextInt();

        int result = binarySearch(nums , tar);

        if(result!=-1){

        System.out.println("Index of "+ tar + " found on "+result);
        }
        else
        System.out.println("Index not found");  


    }

    public static int linearSearch(int[] nums, int tar){

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==tar){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int tar){

        int start = 0;
        int end = nums.length;

        while (start<=end) {
            int mid = (start+end)/2;

            if(nums[mid]==tar){
                return mid;

            }
            else if (nums[mid]<tar){
                start = mid + 1;

            }
            else 

            end = mid -1;
            
        }


        return -1;
    }*/


    /*public static void main(String args[]){

        int arr[] = {8, 9, 2, 1, 7, 5};

        int tar = 7;

        int result = linearSearch(arr , tar);

        if(result!=-1){
            System.out.println("Index of "+tar+ " Found at "+result);
        }
        else{
             System.out.println("Index not Found");
        }

    }

     public static int linearSearch(int[] arr, int tar){

        for(int i = 0; i<arr.length; i++){

            if(arr[i]==tar){
                return i;
            }
            
        }
        return -1;
     }*/

     public static void main(String args[]){
      
        int arr[] = {4, 9, 10, 11, 47, 55};

        int tar = 55;

       int result = binarySearch(arr, tar);

       if(result!=-1){
            System.out.println("Index of "+tar+ " Found at "+result);
        }
        else{
             System.out.println("Index not Found");
        }
     }

    public static int binarySearch(int arr[], int tar) {

        int left = 0;
        int right = arr.length-1;
        int mid = 0;

     
        while (left<=right) {

            mid = (left+right)/2;

            if(arr[mid] == tar){
                return mid;
            }
            else if(arr[mid]>tar){
                mid = right -1;
            }
            else 
            {
                mid = left +1;
            }
            
        }
        
        return -1;
    }
    
}

