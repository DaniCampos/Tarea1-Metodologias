package HeartStone.tests;

import static org.junit.Assert.*;

import org.junit.*;

import HeartStone.*;

public class MageTest {
	private Assassin a;
	private Mage m;
	private Warlock w;
	
	@Before
	public void setUp() throws Exception {
		a = new Assassin("Juan", 100, 10);
		m = new Mage("Francisco", 100, 8);
		w = new Warlock("Gonzalo", 60, 8);
		
	}
	
	@Test
	public void testPlayerHasName() {

		assertNotNull(m.getName());
		assertEquals(m.getName(), "Francisco");
	}
	
	@Test
	public void testPoints() {
		
		assertNotNull(m.getLifePoints());
		assertEquals(m.getLifePoints(), 100);
		
		assertNotNull(m.getActionPoints());
		assertEquals(m.getActionPoints(), 8);
		
		assertNotNull(m.getDamagePoints());
		assertEquals(m.getDamagePoints(), 0);
	}
	
	
	@Test
	public void testInteraction() {
		
		m.attack(a);
		assertEquals(a.getDamagePoints(), 8);
		
		m.receivesAttackAssassin(a);
		assertEquals(m.getDamagePoints(), 20);
		
		m.receivesAttackWarlock(w);
		assertEquals(m.getDamagePoints(), 24);
	}
	

}
