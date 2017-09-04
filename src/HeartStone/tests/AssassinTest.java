package HeartStone.tests;

import static org.junit.Assert.*;

import org.junit.*;

import HeartStone.*;

public class AssassinTest {
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

		assertNotNull(a.getName());
		assertEquals(a.getName(), "Juan");
	}
	
	@Test
	public void testPoints() {
		
		assertNotNull(a.getLifePoints());
		assertEquals(a.getLifePoints(), 100);
		
		assertNotNull(a.getActionPoints());
		assertEquals(a.getActionPoints(), 10);
		
		assertNotNull(a.getDamagePoints());
		assertEquals(a.getDamagePoints(), 0);
	}
	
	
	@Test
	public void testInteraction() {
		
		a.receivesAttackDruid(d);
		assertEquals(a.getActionPoints(), 14);
		
		a.receivesAttackHealer(he);
		assertEquals(a.getDamagePoints(), 0);
		
		a.receivesAttackHunter(hu);
		assertEquals(a.getDamagePoints(), 14);
		
		a.receivesAttackKnight(k);
		assertEquals(a.getDamagePoints(), 30);
		
		a.receivesAttackMage(m);
		assertEquals(a.getDamagePoints(),38);
		
		a.receivesAttackPaladin(p);
		assertEquals(a.getActionPoints(), 16);
		assertEquals(a.getDamagePoints(), 36);
		
		a.receivesAttackShaman(s);
		assertEquals(a.getActionPoints(), 12);
		assertEquals(a.getDamagePoints(), 40);
		
		a.receivesAttackWarlock(w);
		assertEquals(a.getDamagePoints(),56);
		
		a.attack(d);
		assertEquals(d.getDamagePoints(), 12);
		
		assertEquals(a.stillAlive(), true);
		
	}
	

}
