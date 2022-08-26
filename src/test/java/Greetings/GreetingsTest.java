package Greetings;

import FunWithWords.FunWithWords;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;



        import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {

    @Test
    public void testHelloBob() {
        assertEquals("Hello, Bob", Greetings.greeting("Bob"));
    }

    @Test
    public void test() {
        assertEquals("Hello, Bob", Greetings.greeting("Bob"));
    }

    @Test
    public void testNameIsEmpty() {
        assertEquals("Hello, my friend.", Greetings.greeting(""));
    }

    @Test
    public void testShout() {
        assertEquals("HELLO JERRY!", Greetings.greeting("JERRY"));
    }

    @Test
    public void testTwoNames() {
        String[] names = {"Jill", "Jane"};
        assertEquals("Hello, Jill and Jane.", Greetings.greeting(names));
    }

    @Test
    public void testThreeNames() {
        String[] names = {"Amy", "Brian", "Charlotte"};
        assertEquals("Hello, Amy, Brian and Charlotte.", Greetings.greeting(names));
    }

    @Test
    public void testFourNames() {
        String[] names = {"Amy", "Brian", "Charlotte", "Joe"};
        assertEquals("Hello, Amy, Brian, Charlotte and Joe.", Greetings.greeting(names));
    }

    @Test
    public void testThreeNamesWithShout() {
        String[] names = {"Amy", "BRIAN", "Charlotte"};
        assertEquals("Hello, Amy and Charlotte. AND HELLO BRIAN!", Greetings.greeting(names));
    }
}