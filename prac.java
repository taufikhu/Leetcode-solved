public class prac {
   /*  public static void main(String[] args) {
     

        int result = fact(4);

        System.out.println(result);

    }

    public static int fact(int i){

        if(i!=0){

            return i*fact(i-1);
        }
        return 1;
    }*/

    /*public static void main(String[] args) {
        int arr[] = {7, 1, 4, 12,2, 9};
        int tem = 0;

        for(int i = 0; i<arr.length; i++){

            for(int j =0; j<arr.length-1; j++){

                if(arr[j]>arr[j+1]){
                    tem = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = tem;

                }
            }
        }
        for(int nums : arr){
            System.out.print(" "+ nums);
        }
    }*/


    public static void main(String[] args) {
        int arr[] = {7, 2, 8, 120,22, 9};

        int tem = 0;

        int min = -1;

        int size = arr.length;


        for(int i =0; i<size-1; i++){

            min = i;

            for(int j = i+1;j<size; j++){
                while (arr[min]> arr[j]) {
                    min = j;
                    
                }
                tem = arr[i];
                arr[i] = arr[min];
                arr[min] = tem;
            }
        }
        
        
        for(int nums : arr){
            System.out.print(" "+ nums);
        }
    }
}
