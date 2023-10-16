package AH3.AH3;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz(15);
        System.out.println();
        recursiveFizzBuzz(15);
    }

    public static void FizzBuzz(int num){
        for(int i = 1; i <= num; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public static void recursiveFizzBuzz(int num){
        if(num == 0) return;
        if(num % 3 == 0 && num % 5 == 0){
            recursiveFizzBuzz(num-1);
            System.out.println("FizzBuzz");
        }else if(num % 3 == 0){
            recursiveFizzBuzz(num-1);
            System.out.println("Fizz");
        }else if(num % 5 == 0){
            recursiveFizzBuzz(num-1);
            System.out.println("Buzz");
        }else{
            recursiveFizzBuzz(num-1);
            System.out.println(num);
        }
    }
}
