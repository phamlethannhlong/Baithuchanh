import java.util.LinkedList;

public class App38 {
    public static void main(string[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("java");
        list.add("c++");
        list.add("PHP");
        list.add("Java");
        System.out.println("ví dụ sử dụng phương thức addAll()");
        System.out.println("-------------------------------------");
         linkedList<String> listA = new Linkedlist<string>();
    
         listA.addAll(list);
         System.out.print("ListA:");
         showList(listA);
         System.out.println("\n vi dụ sử dụng phương thức retainAll()");
         System.out.println("-------------------------------------");
         linkedList<String> listB = new Linkedlist<string>();
         listB.add("Java");
        
         listA.retainAll(listB);
         System.out.println("listA");
         showList(listA);

         System.out.println("\nvi dụ sử dụng phương thức retainAll()");
         System.out.println("-------------------------------------");

         listA.removeAll(listB);
         System.out.print("List:");
         showList(listA);
    }
    public static void showList(LinkedList<String> list) {

        for (string obj : list) {
            System.out.print("t" + odj + ", ");
        }
        System.out.println();
    }

}
