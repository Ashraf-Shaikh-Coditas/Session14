class Parent {
    String firstName = " Ashraf ";
    int id = 1;

    public void display() {
        System.out.println("Name :: "+firstName+" Id :: "+id);
    }

}

class Child extends Parent {
    String lastName = "Shaikh";

    public void show() {
        System.out.println("Full name is :: "+firstName+" "+lastName);
    }

}

public class ParentMain {
    public static void main(String[] args) {
        Child obj_c1 ;
        try {
            obj_c1 = (Child) new Parent();
        } catch (ClassCastException e) {
            System.out.println("Exception occurred :: "+e);
        } finally {
            System.out.println("This will execute even if exception occur or not");
        }

        System.out.println("This is the last output");


    }
}
/*
Exception occurred :: java.lang.ClassCastException: class Parent cannot be cast to class Child
(Parent and Child are in unnamed module of loader 'app')
This will execute even if exception occur or not
This is the last output

* */