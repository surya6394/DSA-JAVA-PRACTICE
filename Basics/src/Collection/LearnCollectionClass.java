package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {

//        For Custom Class Sorting
        List<Student> list = new ArrayList<>();

        list.add(new Student("Surya",4));
        list.add(new Student("Pratap",3));
        list.add(new Student("Ravi",1));
        list.add(new Student("Kumar",2));
        list.add(new Student("Rahul",7));

        Collections.sort(list);
        System.out.println("Sorted array = "+list);

            Student s1 = new Student("Jay",5);
            Student s2 = new Student("Veeru",9);

        System.out.println("Compared Array is here = "+s1.compareTo(s2));

//       We Can also use Comparator() to sort by name

//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });

//        We will convert this in lemda

        Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));

        System.out.println("Sort by using Comaprator = "+list);

//         For General Use
//        List<Integer> list = new ArrayList<>();
//
//        list.add(8);
//        list.add(13);
//        list.add(22);
//        list.add(1);
//        list.add(3);
//        list.add(9);
//        list.add(9);
//        list.add(5);
//        list.add(10);
//
//        System.out.println("Minimum value in Array = "+ Collections.min(list));
//        System.out.println("Max Value in Array = "+Collections.max(list));
//
//        Collections.sort(list);
//        System.out.println("Sorted Array in assending order => \n "+ list);
//
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println("Desending Order Sorting = \n"+list);
    }
}
