public class inser {
   
    
    public static void main(String[] arg){

        int arr[] = {8, 7, 2, 5, 1, 3};
       
        
        for ( int i = 1; i<arr.length ; i++ ){

        int  key = arr[i];  // key = 7
            
        int j = i-1;    // j = 8

 
            while (j>=0 && arr[j]>key ) {

                arr[j+1] = arr[j];
                j--;

                
            }
            arr[j+1] = key;
                


        }

        for (int nums : arr){
            System.out.print(" " + nums);
        }



    }
}
