package org.factoriaf5.kata_fizzbuzz;
import java.util.Scanner;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KataFizzBuzzApplication {

	public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int inputNumber = sc.nextInt();

        // Llama al método fizzBuzz de la clase FizzBuzz
        System.out.println(fizzBuzz.fizzBuzz(inputNumber));

        sc.close();
    }
}