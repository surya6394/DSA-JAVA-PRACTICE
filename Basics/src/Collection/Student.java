//package Collection;
//
//import java.util.Objects;
//
//public class Student {
//
//    String name;
//    int rollNo;
//
//    public Student(String name, int rollNo){
//        this.name = name;
//        this.rollNo = rollNo;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", rollNo=" + rollNo +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return rollNo == student.rollNo;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(rollNo);
//    }
//}


package Collection;

import java.util.Objects;

public class Student implements Comparable<Student>{

    String name;
    int rollNo;

    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

//    We Can compare and sort by name.
//    @Override
//    public int compareTo(Student that) {
//        return this.name.compareTo(that.name);
//    }

//    We Can compare and sort by rollNo.
    @Override
    public int compareTo(Student that) {
        return this.rollNo - that.rollNo;
    }}
