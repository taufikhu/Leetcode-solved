public class Bubso {
    

    public static void main(String[] args) {
        

        int array[] = {8, 1, 2, 0, 9, 3};

        int temp = 0;

        System.out.println("Before Sorting");
        for (int arrays : array){

            
            System.out.print(arrays+ " ");
        }

        for(int i = 0; i<array.length; i++){

            for(int j=0; j<array.length -1; j++){
                if(array[j]>array[j+1]){

                    temp = array[j];     //temp = 8
                    array[j] = array[j+1];     // array[j] now = 1
                    array[j+1]= temp;    

                }
            
            }
        }


        System.out.println();
          System.out.println("After Sorting");
        for (int arrays : array){

           
            System.out.print(arrays+ " ");
        }
    }
}
