import com.smu.mscda.MD5Generator;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MD5GeneratorTest {
    @Test
    public void GenerateMD5() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MD5Generator md5Generator = new MD5Generator();

        md5Generator.GenerateMD5("smu");

        System.setOut(System.out);

        String printedOutput = outputStream.toString().trim();

        assertEquals("MD5 hex is : 3773300c2f413cc7136f8d74b305519c", printedOutput);

    }
}
