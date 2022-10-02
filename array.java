public class array {
   
    public static void main(String[] args) {
       
        int[] arr;
        arr = new int[101];
        for (int i = 0; i < arr.length; i++)
        if (i % 2 == 0){
            System.out.println(i+"  Even");
        
        }else {
        System.out.println(i+"  Odd" );
        
        
        }
       
    }
}
