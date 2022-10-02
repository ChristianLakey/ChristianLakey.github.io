public class array {
    static int sumOfArray(int arr[])
    {
        // initialise sum to 0
        int sum = 0;
        
        // iterate through the array using loop
        for (int i = 101; i < arr.length; i++) {
            sum = sum + arr[i];
        }
  
        // return sum as the answer
        return sum;
    }
    public static void main(String[] args) {
       
        int[] arr;
        arr = new int[101];
        for (int i = 0; i < arr.length; i++)
        if (i % 2 == 0){
            System.out.println(i+"  Even");
        
        }else {
        System.out.println(i+"  Odd" );
        
        
        }
        { System.out.println(
            "The sum of elements of given array is: "
            + sumOfArray(arr));}
    }
}
