package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {

//        Set<Integer> set = new HashSet<>();
// It stores randomly all the elements in Array. Time Complexity = O(n).

//        Set<Integer> set = new LinkedHashSet<>();
// It stores elements as it order, that we add.

          Set<Integer> set = new TreeSet<>();
// It stores the array elements in ascending sorted order array. Time Complexity = O(log n).



        set.add(10);
        set.add(40);
        set.add(9);
        set.add(30);
        set.add(35);

//        set.add(30); // In set we can not add duplicate value into a set.

        System.out.println("Array of set = "+set);

        Boolean a = set.contains(30);
        System.out.println("Is 30 present in set = "+a);

        set.remove(40);
        System.out.println("Array after removed = "+set);

        set.add(55);
        set.add(65);

        System.out.println(set+ "\nThis array size is = " + set.size());

        System.out.println(set.isEmpty());
        set.clear();

        System.out.println(set);
        System.out.println(set.isEmpty());

        //Creating set of Custom class using Hashset
        Set<Student> studentSet = new HashSet<>();
//        If we add same name and roll No. than It add the object in studentSet but This should not be
//        happened with set so to avoid this behaviour we add the equals() and hashCode() method in Custom
//        class(Student) that that check the same value according to hashCode of rollNo which is generated
//        by hashCode() method.

        studentSet.add(new Student("Surya",2));
        studentSet.add(new Student("Pratap",5));
        studentSet.add(new Student("Ravi", 4));
        studentSet.add(new Student("Rahul",2));

        System.out.println("Custom Hashset = "+studentSet);

        Student s1 = new Student("Jhon",32);
        Student s2 = new Student("Doe", 32);

        System.out.println("Checked s1 is equals to s2 = "+s1.equals(s2));

    }
}
