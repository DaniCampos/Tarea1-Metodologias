package HeartStone.tests;

import static org.junit.Assert.*;

import org.junit.*;

import HeartStone.*;

public class DruidTest {
	private Assassin a;
	private Druid d;
	private Healer he;
	private Hunter hu;
	private Knight k;
	private Mage m;
	private Paladin p;
	private Shaman s;
	private Warlock w;
	
	@Before
	public void setUp() throws Exception {
		a = new Assassin("Juan", 100, 10);
		d = new Druid("Jose", 90, 8);
		he = new Healer("Diego", 110, 12);
		hu = new Hunter("Felipe", 80, 14);
		k = new Knight("Joaquin", 70, 16);
		m = new Mage("Francisco", 100, 8);
		p = new Paladin("Pedro", 90, 6);
		s = new Shaman("Martin", 60, 12);
		w = new Warlock("Gonzalo", 60, 8);
		
	}
	
	@Test
	public void testPlayerHasName() {

		assertNotNull(d.getName());
		assertEquals(d.getName(), "Jose");
	}
	
	@Test
	public void testPoints() {
		
		assertNotNull(d.getLifePoints());
		assertEquals(d.getLifePoints(), 90);
		
		assertNotNull(d.getActionPoints());
		assertEquals(d.getActionPoints(), 8);
		
		assertNotNull(d.getDamagePoints());
		assertEquals(d.getDamagePoints(), 0);
	}
	
	
	@Test
	public void testInteraction() {
		
		d.receivesAttackAssassin(a);
		assertEquals(d.getDamagePoints(), 10);
		
		d.receivesAttackHealer(he);
		assertEquals(d.getDamagePoints(), 4);
		
		d.receivesAttackHunter(hu);
		assertEquals(d.getDamagePoints(), 18);
		
		d.receivesAttackKnight(k);
		assertEquals(d.getDamagePoints(), 34);
		
		d.receivesAttackMage(m);
		assertEquals(d.getDamagePoints(),42);
		
		d.receivesAttackPaladin(p); 
		assertEquals(d.getActionPoints(), 12);
		assertEquals(d.getDamagePoints(), 38);
		
		d.receivesAttackShaman(s); 
		assertEquals(d.getActionPoints(), 4);
		assertEquals(d.getDamagePoints(), 46);
		
		d.receivesAttackWarlock(w);
		assertEquals(d.getDamagePoints(),54);

		d.attack(he);
		assertEquals(he.getDamagePoints(),2);	
		
	}
	

}
