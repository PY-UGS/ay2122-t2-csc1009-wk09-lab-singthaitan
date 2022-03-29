import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
public class RandomCharacterTest {
    RandomCharacter test;
    @BeforeEach
    void setUp() {
        test = new RandomCharacter();
    }

    @Test
    void getRandomLowerCaseLetter() {
        int testchar = test.getRandomLowerCaseLetter();
        assertTrue(testchar>=96 && testchar<=122);
    }

    @Test
    void getRandomUpperCaseLetter() {
        int testchar = test.getRandomUpperCaseLetter();
        assertTrue(testchar>=65 && testchar<=90);
    }

    @Test
    void getRandomDigitCharacter() {
        int testchar = test.getRandomDigitCharacter();
        assertTrue(testchar>=48 && testchar<=57);
    }

    @Test
    void getRandomCharacter() {
        int testchar = test.getRandomCharacter();
        assertTrue(testchar>=33 && testchar<=126);
    }

    @Test
    void testPrimeNumber(){
        int testchar = test.getRandomDigitCharacter();
        if(testchar >=48 && testchar<=57){
            int value = testchar-48;
            boolean flag=false;
            for (int i = 2; i <= value / 2; ++i) {
                // condition for nonprime number
                if (value % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(value + " is a prime number.");
            else
                System.out.println(value + " is not a prime number.");
        }
        else
            System.out.println("Char is not a number");

    }
}
