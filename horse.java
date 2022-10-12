//Simple horse class created by Kim Gross
//for CTE Software Development class 2022

public class horse {
    String name;// current name of the horse
    int birthYear;//year the horse was born
    String[] names; //array of old names of the horse
    int numberofNames=0; //how many old names are there.
    public horse(String horseName, int year){ //horse constructor needs its name and birth year.
        name=horseName; //assigns the name of the horse to the horseName which was sent in the construtor.
        birthYear=year; //assigns the year to the birthYear that was sent in the constructor;
    }
    
     public int age(){
        return birthYear;
        
    } 
    public void changeName(String newName){//change the name but safe the old name
        names[numberofNames]=name;
        numberofNames++;
        name=newName;
    }
     public String toString(){
        return name;
    }
        public static void main(String[] args) {
        horse horse1=new horse("zazoom",2001);
        System.out.println(horse1); System.out.println(horse1.age()); 
        horse horse2=new horse("flash",2012); 
        System.out.println(horse2);   System.out.println(horse2.age()); 
        horse horse3=new horse("zipper",2088);
        System.out.println(horse3); System.out.println(horse3.age());        
        

}


    
}
