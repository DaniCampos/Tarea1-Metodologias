package HeartStone.tests;

import static org.junit.Assert.*;

import org.junit.*;
import HeartStone.*;

public class HunterTest {
	private Assassin a;
	private Druid d;
	private Hunter hu;
	private Mage m;
	
	@Before
	public void setUp() throws Exception {
		a = new Assassin("Juan", 100, 10);
		d = new Druid("Jose", 90, 8);
		hu = new Hunter("Felipe", 80, 14);
		m = new Mage("Francisco", 100, 8);
		
	}
	
	@Test
	public void testPlayerHasName() {

		assertNotNull(hu.getName());
		assertEquals(hu.getName(), "Felipe");
	}
	
	@Test
	public void testPoints() {
		
		assertNotNull(hu.getLifePoints());
		assertEquals(hu.getLifePoints(), 80);
		
		assertNotNull(hu.getActionPoints());
		assertEquals(hu.getActionPoints(), 14);
		
		assertNotNull(hu.getDamagePoints());
		assertEquals(hu.getDamagePoints(), 0);
	}
	
	
	@Test
	public void testInteraction() {
		
		hu.attack(a);
		assertEquals(a.getDamagePoints(), 14);
		
		hu.receivesAttackDruid(d);
		assertEquals(hu.getDamagePoints(), 4);
		
		hu.receivesAttackMage(m);
		assertEquals(hu.getDamagePoints(), 20);
		
	}
	

}
