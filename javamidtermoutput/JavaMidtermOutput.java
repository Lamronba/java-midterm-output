
package javamidtermoutput;
import java.util.ArrayList;
import java.util.Scanner;



public class JavaMidtermOutput {
  
   
    static ArrayList<String> name = new ArrayList<>();
     static Scanner cs = new Scanner(System.in);
    static ArrayList<Integer> age = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)  {
        int option = 0;
        Lamronba:
         while(true) {
            System.out.println("Options: \n1. add entry \n2. remove entry \n3. view all entry \n4. update entry \n0. exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    addEntry();
                    break;
                case 2:
                    removeEntry();
                    break;
                case 3:
                    viewAllEntry();
                    break;
                case 4:
                    UpdateEntry();
                    break;
                case 0:
                    break Lamronba;
                default:
                    System.out.println("invalid");
                    break;
        
        }
    }
}   
    static void addEntry() {
        System.out.print("Enter name: ");
        name.add(cs.nextLine());
        System.out.print("Enter age: ");
        age.add(sc.nextInt());
    }
    static void removeEntry(){
        String input;
        System.out.println("enter name to delete: ");
       input = cs.nextLine();
       if(name.contains(input))
       {
           name.remove(input);
           System.out.println(input+" has been deleted!");
       } else {
           System.out.println("no "+input+" in the list! ");
       }
        
    } 
    static void viewAllEntry(){
    int length = name.size();
    if(length !=age.size()){
      
    }
      ArrayList <String> merge = new ArrayList<String>(length);
      for (int i = 0; i<length;i++){
          
          merge.add(name.get(i)+" is "+age.get(i));
          
       
          
      }
      merge.forEach(System.out::println);
      
    
    }
    static void UpdateEntry(){
       
        System.out.print("Enter new name: ");
        String value = cs.nextLine();
        name.set(0,value);
       System.out.print("Enter new age: ");
        int index = sc.nextInt();
        
        age.add(0, index);
        
    }
        
    
}
