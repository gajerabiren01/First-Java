public class Calculator {

    static int a = 10;
    static int b = 3;
    static int answer;

    public static void main(String[] args) {
        add();
        subtract();
        multiply();
        division();
        Modulus();
    }
        static void add() {
             answer = a + b;
            System.out.println("Addition of "+a+" & "+b +" = "+answer);
            //addition of 15 & 5 = 15
        }

        static void subtract() {
        answer = a-b;
        System.out.println("subtraction of "+a+" & "+b+" = "+answer);
        //subtraction of 10 & 3 = 7

        }

    static void multiply() {
        answer = a*b;
        System.out.println("Multiplication of "+a+" & "+b+" = "+answer);
        //multiplication of 10 & 3 = 7

    }
    static void division() {
         answer = (a/b);
        System.out.println("Division of "+a+" & "+b+" = "+ answer);
        //Division of 10 & 3 = 7

    }
    static void Modulus() {
        answer = a%b;
        System.out.println("Modulus of "+a+" & "+b+" = "+answer);
        //Modulus of 10 & 3 = 7

    }




    }

