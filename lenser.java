import java.util.*;

public class lenser {
    

    public static void main(String[] args){

        int array[] = {5, 45, 8, 99, 105, 78};

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter the number");
        int tar= sc.nextInt(); 

        int result = linearSearch(array, tar);

        if(result!=-1){
        System.out.println("The index of "+tar+ " found in "+result);

     
        }
        else 
        System.out.println("Index not found");

    }

    public static int linearSearch(int[] array, int tar){

        for(int i = 0; i<array.length; i++){
         
            if (array[i] == tar)
            return i;
       
       }
        return -1;
    }
}
