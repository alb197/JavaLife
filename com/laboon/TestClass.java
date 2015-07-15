/**
 * Created by Christopher on 7/14/2015.
 */
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class TestClass {
    private int Iterations = 10000000;
    @Test
    public void testToStringWithSizeSix() {//with 10,000,000 iterations, this passed in 39 seconds before refactoring.
        World world  = new World(6, 5, 10);
        long time = System.currentTimeMillis();
        for (int j=0; j < Iterations; j++) {
            world = world.iterate();
            String result = world.toString();
            String correctResult = "  012345\n" +
                    "0 X..X..\n" +
                    "1 ....XX\n" +
                    "2 ......\n" +
                    "3 ......\n" +
                    "4 ....X.\n" +
                    "5 ...X.X\n";
            if(j == 0) {
                correctResult = "  012345\n" +
                        "0 ....XX\n" +
                        "1 ....XX\n" +
                        "2 ......\n" +
                        "3 ......\n" +
                        "4 ...X..\n" +
                        "5 ....XX\n";
            }
            assertEquals(result, correctResult);
        }
        System.out.println( System.currentTimeMillis()-time );
    }
    @Test
    public void testToStringWithSizeFour() {//with 10,000,000 iterations, this passed in 16 seconds before refactoring.
        World world  = new World(4, 5, 10);
        long time = System.currentTimeMillis();
        for (int j=0; j < Iterations; j++) {
            world = world.iterate();
            String result = world.toString();
            String correctResult = "  0123\n" +
                    "0 ....\n" +
                    "1 ....\n" +
                    "2 ....\n" +
                    "3 ....\n";
            if(j == 0) {
                correctResult = "  0123\n" +
                        "0 ....\n" +
                        "1 X...\n" +
                        "2 X...\n" +
                        "3 ....\n";
            }
            assertEquals(result, correctResult);
        }
        System.out.println( System.currentTimeMillis()-time );
    }
    @Test
    public void testToStringWithSizeTwo() {//with 10,000,000 iterations, this passed in 5 before refactoring.
        World world  = new World(2, 5, 10);
        long time = System.currentTimeMillis();
        for (int j=0; j < Iterations; j++) {
            world = world.iterate();
            String result = world.toString();
            String correctResult = "  01\n" +
                    "0 ..\n" +
                    "1 ..\n";
            assertEquals(result, correctResult);
        }
        System.out.println( System.currentTimeMillis()-time );
    }
}
