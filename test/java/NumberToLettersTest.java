import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NumberToLettersTest {

    @Test (timeout = 2000)
    public void checkLetters() throws Exception {

        String actual = new NumberToLetters().numberToNameOfColumn(20);
        assertThat(actual, is("T"));
    }

    @Test (timeout = 2000)
    public void checkBiggerThenAlphabet() throws Exception {

        String actual = new NumberToLetters().numberToNameOfColumn(877);
        assertThat(actual, is("AGS"));
    }


}
