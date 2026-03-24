public class bubshort{

    public static void main(String args[]){

        int arr[] = {11,1,4,2,6,3};
         
        int size =arr.length;
        int temp = 0;

        for(int num : arr){

            System.out.print(num+" ");

        }

        System.out.println();

        for(int i=0;i<size; i++){

            for(int j=0;j<size-1;j++){

                if(arr[j]>arr[j+1]){

                    temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}