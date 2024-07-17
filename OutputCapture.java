import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OutputCapture {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    public void tearDown() {
        System.setOut(originalOut);
    }

    public String getOutput() {
        return outContent.toString().trim();
    }
}
