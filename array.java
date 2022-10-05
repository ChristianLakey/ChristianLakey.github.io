public class array {
    
    public static void main(String[] args) {
       
        int[] arr;
        int total=0;
        
        
        
        arr = new int[101];
        
        for (int i = 0; i < arr.length; i++) 
        {total=total+i;
        if (i % 2 == 0){
            System.out.println(i+"  Even");
        
        }else {
        System.out.println(i+"  Odd" );
    }
}
    {
    System.out.println(total);
    }   
    
            
        
        
        
    }
}
