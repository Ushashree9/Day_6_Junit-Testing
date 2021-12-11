package junitproblems;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Vending_MachineTest {
	@Test
	public void notesTest() {
		assertEquals(1, Vending_Machine.notes(100));
	}
}
