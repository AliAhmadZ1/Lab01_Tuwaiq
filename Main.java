import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // ///////// Lab 1 ///////////////
        System.out.println("Ali Ahmad Alshehri");
        Scanner input = new Scanner(System.in);


        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //1. Write a Java program to print the sum (addition), multiply,
        // subtract, divide and remainder of two numbers , takes two numbers as input

        double sum = 0, sub = 0, mult = 0,div = 0, remain = 0; //declaration
        System.out.println("Please enter two numbers to find (+ , - , * , / , mod)");
        // inputs
        System.out.printf("First number: ");
        double first = input.nextInt(); //First input
        System.out.printf("Second number: ");
        double second = input.nextInt(); //Second input
    //operation
        sum = first + second; //addition
        sub = first - second; //subtraction
        mult = first * second; // multiplication
        div = first / second; // division
        remain = first % second; // remainder of the division between first and second.

        // output of code
        System.out.println(first+" + "+second+" = "+sum);
        System.out.println(first+" - "+second+" = "+sub);
        System.out.println(first+" * "+second+" = "+mult);
        System.out.println(first+" / "+second+" = "+div);
        System.out.println(first+" mod "+second+" = "+remain);

        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //2. Write a Java program that takes a number as input and prints
        // its multiplication table up to 10.

//        int table=0;
        // //input
//        System.out.println("Enter a number to find multiplication table: ");
//        int num2= input.nextInt();
//        //loop to make a multiply with every number from 1 to 10 and print
//        for (int i = 1; i <= 10; i++) {
//            table=num2*i;
//        // output of code
//            System.out.println(num2+" * "+i+" = "+table);
//        }

        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //3. Write a Java program to print the area and perimeter of a circle.

//        double perimeter;
//        double area;
//        double pi = 3.14159265359;
//        double radius=34.2;
//
// //        System.out.println("Please enter the radius of a circle: ");
// //        radius = input.nextByte();
//
//        area = pi * radius * radius; //A = π r²
//        perimeter = pi * 2 * radius; //Perimeter = 2πr
//
//        System.out.println("Perimeter is: "+perimeter);
//        System.out.println("Area is: "+area);

        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //4. Java program to find out the average of a set of integers

//        double average4=0;
//        int num4=0;
//        int count4=0;
//        System.out.println("Sum calculator: ");

//        do{
        // //inputs
//            System.out.println("Please enter a number or 0 to Exit: ");
//            num4= input.nextInt();
//            average4 = average4 + num4; // ex: 1+2+3+4+5+6+7+8
//            count4++; // counter to find number of values..
//        }while (num4!=0); // exit when zero entered
//        average4 = average4/(count4-1); // average = 1+2+3+4+5+6+7+8 / number of values which is here 8
//        // output of code
//        System.out.println("The Average is: "+average4);

        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //5. Write a Java program that accepts three integers as input,
        // adds the first two integers together,
        // and then determines whether the sum is equal to the third integer.

//        int sum5=0;
//        boolean state=false; // to set a flag
//        System.out.println("Please enter three numbers: ");
//        // inputs
//        System.out.println("First number: ");
//        int num1_5 = input.nextInt();
//        System.out.println("Second number: ");
//        int num2_5 = input.nextInt();
//        System.out.println("Third number: ");
//        int num3_5 = input.nextInt();
//
//        sum5 = num1_5 + num2_5; // addition of first two number
//        if (sum5 == num3_5) //check if they are equal to third number
//            state=true; // set flag true
//
         // // output of code
//        if (state) //true
//            System.out.println("The result is: "+state);
//        else //false
//            System.out.println("The result is: "+state);


        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //6. Write a Java program to reverse a word.

//        System.out.println("Please enter a string to reverse: ");
//        String txt= input.nextLine();
//        char pick; // to handle the current character
//        String reverse = ""; // reverse variable
//           // loop to reverse the string
//        for (int i = 0; i < txt.length(); i++) {
//            pick= txt.charAt(i); //to pick one character
//            reverse = pick+reverse; //add to the left of previous char
//        }
//        System.out.println("The reverse word is: "+reverse);


        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //7 - Java program to check whether the given number is even or odd

        // //inputs
//        System.out.println("Enter a number to check even or odd: ");
//        int num7= input.nextInt();
//          // output of code
//        if (num7%2==0) // true when even which is num/2 if there isn't a remainder
//            System.out.println("The number is Even.");
//        else if (num7%2!=0) // false opposite when appear a remainder there
//            System.out.println("The number is Odd.");
//        else
//            System.out.println("Error: incorrect input\nhint:just enter a number.");


        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //8 - Java program to convert the temperature in Centigrade to Fahrenheit

//        double fahrenheit = 0;
//        System.out.println("Enter a temperature in C:");
//        double celis = input.nextDouble(); // Cْ
//
//        //°F = °C * 9/5 + 32
//            fahrenheit = celis * ((double) 9 /5) + 32;
//            System.out.println("The temp in F°: "+fahrenheit);


        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //9.Write a Java program that takes a string and a number from the user,then prints the
        //character in the given index.

//        int i9=0;
//        System.out.println("Please enter a string: ");
//        String txt = input.nextLine();
//        System.out.println("PLease enter a number: ");
//        i9= input.nextInt();
//        char pick9;
//        pick9 = txt.charAt(i9); //to pick one character at specified index
//        System.out.println("The reverse word is: " + pick9);


        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //10. Write a Java program to print the area and perimeter of a rectangle.

//        float area10=0;
//        float perimeter10=0;

//        System.out.println("Enter the length and the width of a rectangle: ");
// //inputs
//        System.out.println("Enter Length: ");
//        float length = input.nextFloat();
//        System.out.println("Enter width: ");
//        float width = input.nextFloat();
//
//        area10 = length * width; //area of rectangle is A = l × w
//        perimeter10 = (2 * length) + (2* width); //P = 2l + 2w
//
//        System.out.println("The area is: "+area10);
//        System.out.println("The perimeter is: "+perimeter10);


        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //11. Write a Java program to compare two numbers. == < <=

//        System.out.println("Please enter two numbers to compare ");
//        System.out.printf("First number: ");
//        int first11 = input.nextInt();
//        System.out.printf("Second number: ");
//        int second11 = input.nextInt();
//        if (first11 != second11) {
//            System.out.println(first11 + " != " + second11);
//            if (first11 < second11) {
//                System.out.println(first11 + " < " + second11);
//                System.out.println(first11 + " <= " + second11);
//            } else {
//                System.out.println(first11 + " > " + second11);
//                System.out.println(first11 + " >= " + second11);
//            }
//        }else {
//            System.out.println(first11 + " == " + second11);
//            System.out.println(first11 + " >= " + second11);
//            System.out.println(first11 + " <= " + second11);
//        }


        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //12. Write a Java program to convert seconds to hours, minutes and seconds.
        //Sample Output:
        //Input seconds: 86399
        //23:59:59

//        int seconds=0;
//        int h=0;
//        int m=0;
//        int s=0;
//        System.out.println("Enter the seconds to calculate the clock: ");
//        seconds = input.nextInt();
//
//        h = seconds / 3600;
//        seconds = seconds % 3600;
//        m= seconds/60;
//        seconds = seconds %60;
//
//        System.out.println("The clock is "+h+":"+m+":"+seconds);
//        System.out.printf("The clock is %1$2d:%2$2d:%3$2d",h,m,seconds);

        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //13. Write a Java program that accepts four integers from the user and prints equal if all
        //four are equal, and not equal otherwise.

//        System.out.println("Enter first: ");
//        int num1_13= input.nextInt();
//        System.out.println("Enter second: ");
//        int num2_13= input.nextInt();
//        System.out.println("Enter third: ");
//        int num3_13= input.nextInt();
//        System.out.println("Enter fourth: ");
//        int num4_13= input.nextInt();
//
//        if (num1_13 == num2_13 && num1_13 == num3_13 && num1_13 == num4_13)
//            System.out.println("The numbers are equals.");
//        else
//            System.out.println("The numbers aren't equals.");


        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //14. Write a Java program that reads an integer and check whether it is negative, zero, or
        //positive.

//        System.out.println("Enter a number to check Positive, negative or zero : ");
//        int num7= input.nextInt();
//
//        if (num7>0)
//            System.out.println("The number is Positive.");
//        else if (num7<0)
//            System.out.println("The number is Negative.");
//        else if (num7==0)
//        System.out.println("The number is Zero.");
//        else
//            System.out.println("Error!!");

        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //15.Write a program to enter the numbers till the user wants and at the end it
        //should display the count of positive, negative and zeros entered (End loop use -1 ,
        //Don’t count -1).

//        int num7 = 0;
//        int positive = 0;
//        int negative = 0;
//        int zeros = 0;
//        while (num7 != -1) {
//            System.out.printf("Enter a number to count Positive, negative or zero (-1 to exit): ");
//            num7 = input.nextInt();
//            if (num7 > 0)
//                positive++;
//            else if (num7 < 0)
//                negative++;
//            else if (num7 == 0)
//                zeros++;
//            else
//                System.out.println("ERORR!!");
//        }
//        System.out.println(negative+" Negative numbers.");
//        System.out.println(positive+" Positive numbers.");
//        System.out.println(zeros+" Zeros.");

        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //16 - Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed
        //For example, if the input is 12345, the output should be 54321.

//        System.out.println("Please enter an integer to reverse: ");
//        int num= input.nextInt();
//
//        int reverseNum=0;
//        while (num > 0) {
//            reverseNum = reverseNum * 10 + num % 10;
//            num = num / 10;
//        }
//
//        System.out.println(reverseNum);

        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //17 - Write a program to enter the numbers till the user wants and at the end the
        //program should display the largest and smallest numbers entered.

//        int num17;
//        int largest = 0;
//        int smallest = 0;
//        System.out.println("how many numbers do you have? ");
//        int setnum=input.nextInt();
//        for (int i = 1; i <= setnum; i++) {
//            System.out.print("Enter numbers to find the greatest: ");
//            num17 = input.nextInt();
//            if (i==1)
//                largest = smallest = num17;
//            if (num17 > largest)
//                largest = num17;
//            else
//                if (num17 < smallest)
//                    smallest = num17;
//        }
//        System.out.println(" Largest number is: "+largest);
//        System.out.println(" Smallest number is: "+smallest);

        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        //18 - Determine and print the number of times the character ‘a’ appears in the input
        //entered by the user.

//        int count18=0;
//        System.out.println("Please enter a string to count a's: ");
//        String txt= input.nextLine();
//        char pick;
//        String reverse = "";
//        for (int i = 0; i < txt.length(); i++) {
//            pick= txt.charAt(i); //to pick one character
//            reverse = pick+reverse;
//            if (reverse.equalsIgnoreCase("a"))
//                count18++;
//            reverse="";
//        }
//        System.out.println("The number of a's is: "+count18);

    }
}
