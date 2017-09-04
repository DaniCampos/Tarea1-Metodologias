package HeartStone.tests;

import static org.junit.Assert.*;

import org.junit.*;

import HeartStone.*;

public class KnightTest {
	private Assassin a;
	private Hunter hu;
	private Knight k;
	
	@Before
	public void setUp() throws Exception {
		a = new Assassin("Juan", 100, 10);
		hu = new Hunter("Felipe", 80, 14);
		k = new Knight("Joaquin", 70, 16);
		
	}
	
	@Test
	public void testPlayerHasName() {

		assertNotNull(k.getName());
		assertEquals(k.getName(), "Joaquin");
	}
	
	@Test
	public void testPoints() {
		
		assertNotNull(k.getLifePoints());
		assertEquals(k.getLifePoints(), 70);
		
		assertNotNull(k.getActionPoints());
		assertEquals(k.getActionPoints(), 16);
		
		assertNotNull(k.getDamagePoints());
		assertEquals(k.getDamagePoints(), 0);
	}
	
	
	@Test
	public void testInteraction() {
		
		k.attack(a);
		assertEquals(a.getDamagePoints(), 16);
		
		k.receivesAttackAssassin(a);
		assertEquals(k.getDamagePoints(),5);
		
		k.receivesAttackHunter(hu);
		assertEquals(k.getDamagePoints(),33);
		
	}
	

}
