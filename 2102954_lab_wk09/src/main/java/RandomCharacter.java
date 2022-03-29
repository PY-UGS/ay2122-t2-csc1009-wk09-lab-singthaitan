import java.util.Random;

public class RandomCharacter {
    public static char getRandomLowerCaseLetter(){
        Random random = new Random();
            // Max value is exclusive.
            // ... So this returns 1, 2, through 25.
            int n = random.nextInt(26);

            // Add 97 to move from integer to the range a to z.
            char value = (char) (n + 97);
    return value;
    }
    public static char getRandomUpperCaseLetter(){
        Random random = new Random();
        // Max value is exclusive.
        // ... So this returns 1, 2, through 25.
        int n = random.nextInt(26);

        // Add 65 to move from integer to the range A to Z.
        char value = (char) (n + 65);
        return value;
    }
    public static char getRandomDigitCharacter(){
        Random random = new Random();
        // Max value is exclusive.
        // ... So this returns 1, 2, through 25.
        int n = random.nextInt(10);
        char value = (char) (n + 48);
        return value;
    }
    public static char getRandomCharacter(){
        Random random = new Random();
        int a = random.nextInt(3);
        char value = '1';
        int n;
        switch (a){
            case 0:
                // Max value is exclusive.
                // ... So this returns 1, 2, through 25.
                n = random.nextInt(26);

                // Add 97 to move from integer to the range a to z.
                 value = (char) (n + 97);
                 break;
            case 1:
                // Max value is exclusive.
                // ... So this returns 1, 2, through 25.
                n = random.nextInt(26);

                // Add 65 to move from integer to the range A to Z.
                value = (char) (n + 65);
                break;
            case 2:
                // ... So this returns 1, 2, through 25.
                n = random.nextInt(10);
                value = (char) (n + 48);
                break;
        }

        return value;
    }

    public static void main(String[] args){
        System.out.println("Random Upper Case Letter: ");
        for(int i = 1; i<=15;i++){
            if(i<15) {
                System.out.print(getRandomUpperCaseLetter() + " ");
            }else
                System.out.println(getRandomUpperCaseLetter() + " ");
        }
        System.out.println("Random Lower Case Letter: ");
        for(int i = 1; i<=15;i++){
            if(i<15) {
                System.out.print(getRandomLowerCaseLetter() + " ");
            }else
                System.out.println(getRandomLowerCaseLetter() + " ");
        }
        System.out.println("Random Digit Character: ");
        for(int i = 1; i<=15;i++){
            if(i<15){
            System.out.print(getRandomDigitCharacter()+" ");
            }
            else
                System.out.println(getRandomDigitCharacter()+" ");
        }
        System.out.println("Random Character: ");
        for(int i = 1; i<=15;i++){
            if(i<15){
                System.out.print(getRandomCharacter()+" ");
            }
        else
            System.out.println(getRandomCharacter()+" ");
        }
    }
}
