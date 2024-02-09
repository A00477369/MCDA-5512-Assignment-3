import com.smu.mscda.StringCapitalizer;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


public class StringCapitalizerTest {
    @Test
    public void capitalize() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        StringCapitalizer stringCapitalizer = new StringCapitalizer();

        stringCapitalizer.capitalize("smu");

        System.setOut(System.out);

        String printedOutput = outputStream.toString().trim();

        assertEquals("Capitalized String is :Smu", printedOutput);

    }
}
