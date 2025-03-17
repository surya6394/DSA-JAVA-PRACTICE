package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args){

//        ArrayList<String> list = new ArrayList<>();
//        It will create blank array.
//        list.add("Surya");
//        It will create an array of 10 length when we add any element in list array.
//        If array length is full then it will increase by if size = n, then n + n/2 + 1; is the new array size and copied prev. array also.

        // ArrayList no. 1
        ArrayList<Integer> a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a);

        a.add(4);
        System.out.println(a);
        a.add(1,40);
        System.out.println(a);

        // ArrayList no. 2
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);

        a.addAll(list);
        System.out.println(a);

        int i = a.get(1);
        System.out.println(i);

        a.remove(2);
        System.out.println("Removed 2nd indexed element= "+a);
        a.remove(4);
        System.out.println("4th index element removed = "+a);
        a.removeAll(list);
        System.out.println("list array removed= "+a);
        a.remove(Integer.valueOf(40));
        System.out.println("Entered Element removed= "+a);
        // Clear all List elements
        a.clear();
        System.out.println("Cleared List Element = "+ a);

        // ArrayList no. 3
        ArrayList<String> str = new ArrayList<>();
        str.add("Surya");
        str.add("Pratap");
        str.add("Nigam");
        str.add("Ravi");
        str.add("Kumar");
        System.out.println("String ArrayList 3 ->"+ str);

        str.set(2,"kumar");
        System.out.println("Repleced array element = " + str);

        System.out.println("Checked Element contains in Array = "+str.contains("Ravi"));

        str.remove(String.valueOf("Kumar"));
        System.out.println("Removed array element 'Nigam' = "+ str);

//      Iterator -> Array List no. - 4
        System.out.println("***** Iterator in ArrayList ******");
        ArrayList<Integer> n = new ArrayList<>();

        n.add(10);
        n.add(20);
        n.add(30);
        n.add(40);
        n.add(50);
        n.add(60);
        n.add(70);
        n.add(80);
        n.add(90);

        System.out.println("All element of this Array = "+n);

        for(int j = 0; j < n.size(); j++){
            System.out.println(j+" index value is = "+n.get(j));
        }

        for(Integer element: n){
            System.out.println("Array element value = "+ element);
        }

        Iterator<Integer> it =  n.iterator();

        while (it.hasNext()){
            System.out.println("Iterator Elements = "+it.next());
        }

    }
}
