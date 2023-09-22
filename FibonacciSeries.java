public class FibonacciSeries {
    // Creating a function to print out the fibonacci series :
    static class Fibonacci{
        static int length;
        // creating getters and setters for length :

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            Fibonacci.length = length;
        }
        Fibonacci(){
            System.out.println("I am a default constructor.");
        }
        Fibonacci(int length){
            Fibonacci.length = length;
            System.out.println("The length is now set to : "+length);
        }
        // Creating a method to print out the fibonacci series upto the given length:
        public void printFibonacciSeries(){
            int num1 = 0;
            int num2 = 1;
            for (int i = length;i>0;i--){
            int num3 = num1+num2;
            System.out.println(num1);
            num1 = num2;
            num2 = num3;}
        }

    }
    public static void main(String[] args) {
        System.out.println("This is a program to print out the fibonacci series using a method and constructor.");
        Fibonacci fibonacci = new Fibonacci(10);
        fibonacci.printFibonacciSeries();
    }
}
