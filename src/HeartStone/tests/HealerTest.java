package HeartStone.tests;

import static org.junit.Assert.*;

import org.junit.*;
import HeartStone.*;

public class HealerTest {
	private Assassin a;
	private Healer he;
	private Paladin p;
	
	@Before
	public void setUp() throws Exception {
		a = new Assassin("Juan", 100, 10);
		he = new Healer("Diego", 110, 12);
		p = new Paladin("Pedro", 90, 6);
		
	}
	
	@Test
	public void testPlayerHasName() {

		assertNotNull(he.getName());
		assertEquals(he.getName(), "Diego");
	}
	
	@Test
	public void testPoints() {
		
		assertNotNull(he.getLifePoints());
		assertEquals(he.getLifePoints(), 110);
		
		assertNotNull(he.getActionPoints());
		assertEquals(he.getActionPoints(), 12);
		
		assertNotNull(he.getDamagePoints());
		assertEquals(he.getDamagePoints(), 0);
	}
	
	
	@Test
	public void testInteraction() {
		
		he.attack(a);
		assertEquals(a.getDamagePoints(), 0);
		
		he.receivesAttackAssassin(a);
		assertEquals(he.getDamagePoints(), 20);
		
		he.receivesAttackPaladin(p);
		assertEquals(he.getDamagePoints(), 16);
		assertEquals(he.getActionPoints(), 16);
		
		
	}
	

}
