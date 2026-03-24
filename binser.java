public class binser {
    

    public static void main(String[] args) {
        
        int array[] = {8, 9, 45, 89, 90, 100};

        int tar = 100;

        int result = binarySearch(array, tar);

        if(result!=-1)

        System.out.println(" Index of "+tar+ " found on " + result);

        else 

        System.out.println("Index not found");
    }

    public static int binarySearch(int[] array, int tar){


        int start = 0;
        int end = array.length-1;

        while (start<=end) {

            int mid = (start+end)/2;

            if(array[mid] == tar){
                return mid;
            }
            else if (array[mid]<tar){
                start = mid+1;
            }
            else {
                end = mid -1;
            }
    
        }
        return -1;

    }
}
