class swap{
    public static void main(String args[]){
        int a = 6;
        int b = 7;

        // int c = a + b;
        // b = c - b;
        // a = c - a;

        a = a + b;
        b = a - b;
        a = a - b;
        

        System.out.println("a = "+a+ " "+" b = " +b);
    }
}