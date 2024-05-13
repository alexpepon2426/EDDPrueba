package Principal;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@ParameterizedTest
	@MethodSource("datos")
	static Stream <Arguments>datos()
	{
		return Stream.of(
					Arguments.of(2.71828),
					Arguments.of(-1),
					Arguments.of(0),
					Arguments.of()
				);
	}

}
