package ex_13_Construtors;

import javax.xml.namespace.QName;

public class ex_176 {
    public static void main(String[] args) {
        Person p1 = new Person("aman","122asdasd3344", 12323123);
        Person p2 = new Person("dad","122asdsaddasd3344", 12344556);
    }

   static class Person{
        String name;
        long phone;
        String address;

        Person(){


        }
        Person(String name_arg,String add_arg, long phone_args){
           this.name = name_arg;
           this.phone = phone_args;
           this.address = add_arg;
        }
    }
}
