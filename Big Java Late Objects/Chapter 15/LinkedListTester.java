import java.util.*;

public class LinkedListTester{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();

        list.add("my");
        list.add("name");
        list.add("jeff");

        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("-------------------");

        list = reverseList(list);

        iterator = list.listIterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        
        System.out.println("-------------------");

        iterator = list.listIterator();

        iterator.next();
        iterator.next();
        iterator.remove();
        iterator.previous();
        iterator.remove();
        iterator.add("yah yeet");
        iterator.next();
        iterator.remove();

        for(String s: list)
        {
            System.out.println(s);
        }
    }

    //destorys old list
    public static LinkedList<String> reverseList(LinkedList<String> list){
        LinkedList<String> reversed = new LinkedList<String>();

        while(!list.isEmpty())
        {
            reversed.addFirst(list.removeFirst());
        }

        return reversed;
    }
}