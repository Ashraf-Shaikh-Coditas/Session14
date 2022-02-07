//2)try to add Numeric data in String data type then handle this exception
public class Question_TwoMain {
    public static void main(String[] args) {
        String name = "Ashraf";
        int num = 10;

        try{
            int i = Integer.parseInt(name+num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            System.out.println("This is finally block");
        }


    }
}

/*
java.lang.NumberFormatException: For input string: "Ashraf10"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:786)
	at Question_TwoMain.main(Question_TwoMain.java:8)
This is finally block

*/
