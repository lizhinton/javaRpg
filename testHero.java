/**
 * Liz Hinton
 * CIS175 - Fall 2023
 * Jan 18, 2024
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testHero {
	hero testHero = new hero();
	
	@Before
	public void setUp() throws Exception {
	}

	//test taking damage
	@Test
	public void damageTest() {
		testHero.takeDmg(3);
		assertTrue(testHero.getCurrentHealth() == 7);
	}
	
	//test healing
	@Test
	public void healingTest() {
		testHero.takeDmg(3);
		testHero.heal();
		assertEquals(testHero.getCurrentHealth(), 9);
		testHero.heal();
		assertEquals(testHero.getCurrentHealth(), 10);
	}

	//test attacking
	@Test
	public void atkTest() {
		assertEquals(testHero.attack(),4);
	}
		
	//test level up
	@Test
	public void levelUpTest() {
		testHero.levelUp();
		assertFalse(testHero.getLevel() == 1);
		assertEquals(testHero.getMaxHealth(),20);
		assertEquals(testHero.getAtkPwr(),8);
	}
}
