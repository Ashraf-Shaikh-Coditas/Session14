import java.util.Scanner;

//Try it for conditions	=>1)i< 10
//        =>2)i<11
public class ABC
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;

        // good code
        System.out.println("Enter values for Array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum = sum + array[i];
        }
        System.out.println("Sum 'i<array.length'is :: "+sum);

        sum = 0;
        System.out.println("Enter values for Array");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
            sum = sum + array[i];
        }
        System.out.println("Sum is 'i<10':: "+sum);


        sum = 0;
        System.out.println("Enter values for Array");
        try{
            for (int i = 0; i < 11; i++) {
                array[i] = scanner.nextInt();
                sum = sum + array[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred :: "+e);
        } finally {
            System.out.println("Sum is 'i<11':: "+sum);
        }

    }
}

/*
Enter values for Array
1
2
3
4
5
6
7
8
9
10
Sum 'i<array.length'is :: 55

Enter values for Array
1
2
3
4
5
6
7
8
9
10
Sum is 'i<10':: 55

Enter values for Array
1
2
3
4
5
6
7
8
9
10
11
Exception occurred :: java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
Sum is 'i<11':: 55

* */

