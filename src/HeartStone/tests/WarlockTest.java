package HeartStone.tests;

import static org.junit.Assert.*;

import org.junit.*;
import HeartStone.*;

public class WarlockTest {
  private Assassin a;
  private Healer he;
  private Shaman s;
  private Warlock w;

  @Before
  public void setUp() throws Exception {
    a = new Assassin("Juan", 100, 10);
    he = new Healer("Diego", 110, 12);
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

    w.attack(a);
    assertEquals(a.getDamagePoints(), 16);

    w.receivesAttackHealer(he);
    assertEquals(w.getDamagePoints(), 12);

    w.receivesAttackShaman(s);
    assertEquals(w.getDamagePoints(), 20);
    assertEquals(w.getActionPoints(), 0);

  }


}
