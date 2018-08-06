import org.junit.Test;
import org.junit.Assert;

import cars.core.Car;

public class CarTest {
	@Test
	public void testConstructor() {
		Car car = new Car(4, "Dodge", 82.0);
	}

	@Test
	public void testToString() {
		Car car = new Car(4, "Dodge", 82.0);
		String expected = "4 Dodge 82.0";
		String actual = car.toString();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void exampleOfFail() {
		Car car = new Car(4, "Dodge", 82.00000000000000000000000000000000000000001);
		String expected = "4 Dodge 82.0";
		String actual = car.toString();
		Assert.assertNotEquals(expected, actual);
	}
}