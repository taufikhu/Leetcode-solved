class subset{
    public static void findSubsets(String st, String ans, int i){
        if(i == st.length()){  // every time it reach to 3, i=3 
            if(ans.length() == 0){ 
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        findSubsets(st, ans+st.charAt(i), i+1); // 
        findSubsets(st, ans,i+1);

    }
    public static void main(String args[]){
        String str = "abcd";
        findSubsets(str, "", 0);
    }
}