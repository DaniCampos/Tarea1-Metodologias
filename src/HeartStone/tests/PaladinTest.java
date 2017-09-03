package HeartStone.tests;

import static org.junit.Assert.*;

import org.junit.*;
import HeartStone.*;

public class PaladinTest {
  private Assassin a;
  private Knight k;
  private Mage m;
  private Paladin p;


  @Before
  public void setUp() throws Exception {

    a = new Assassin("Juan", 100, 10);
    k = new Knight("Joaquin", 70, 16);
    m = new Mage("Francisco", 100, 8);
    p = new Paladin("Pedro", 90, 6);
  }

  @Test
  public void testPlayerHasName() {

    assertNotNull(p.getName());
    assertEquals(p.getName(), "Pedro");
  }

  @Test
  public void testPoints() {

    assertNotNull(p.getLifePoints());
    assertEquals(p.getLifePoints(), 90);

    assertNotNull(p.getActionPoints());
    assertEquals(p.getActionPoints(), 6);

    assertNotNull(p.getDamagePoints());
    assertEquals(p.getDamagePoints(), 0);
  }


  @Test
  public void testInteraction() {

    p.attack(a);
    assertEquals(a.getDamagePoints(), 0);
    assertEquals(a.getActionPoints(), 12);

    p.receivesAttackKnight(k);
    assertEquals(p.getDamagePoints(), 8);

    p.receivesAttackMage(m);
    assertEquals(p.getDamagePoints(), 24);
  }


}
