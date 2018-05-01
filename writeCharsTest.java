import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class writeCharsTest {

	@Test
	void test() {
		writeChars w = new writeChars();
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		w.writeChars(6);
		assertEquals("<<**>>", outContent.toString());
	}

}
