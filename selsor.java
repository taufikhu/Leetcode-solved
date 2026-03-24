public class selsor {
    public static void main(String[] args){

        int arr[] = {6, 5, 2, 8, 9, 4};

        int size = arr.length;

        int tem = 0;

        int minIndex = -1;

       
System.out.println(" Before Sorting");
        for(int n : arr){
             

            System.out.print(n+ " ");
        }

        for(int i =0; i<size-1; i++){

            minIndex = i;

            for(int j=i+1; j<size; j++){

                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            tem = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i]= tem;

        }
         System.out.println();
         System.out.println(" After Sorting");

        for(int n : arr){
            

            System.out.print(n+ " ");
        }

    }
}
