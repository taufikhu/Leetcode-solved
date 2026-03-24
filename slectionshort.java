public class slectionshort{

    public static void main(String args[]){

        int arr[] = {11,1,4,2,6,3};
         
        int size = arr.length;
        int temp = 0;

        int minIndex = -1;

        for(int num : arr){

            System.out.print(num+" ");

        }
        System.out.println();
        
         for(int i=0 ; i<size-1;i++){
            minIndex = i;

            for(int j=i+1; j<size;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }

                    temp = arr[minIndex];
                    arr[minIndex] = arr[j];
                    arr[j] = temp;
                
            }
         }

         for(int num : arr){

            System.out.print(num+" ");

        }
         
    }
}