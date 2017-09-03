package HeartStone.tests;

import static org.junit.Assert.*;

import org.junit.*;
import HeartStone.*;

public class ShamanTest {
  private Assassin a;
  private Hunter hu;
  private Shaman s;

  @Before
  public void setUp() throws Exception {

    a = new Assassin("Juan", 100, 10);
    hu = new Hunter("Felipe", 80, 14);
    s = new Shaman("Martin", 60, 12);
  }

  @Test
  public void testPlayerHasName() {

    assertNotNull(s.getName());
    assertEquals(s.getName(), "Martin");
  }

  @Test
  public void testPoints() {

    assertNotNull(s.getLifePoints());
    assertEquals(s.getLifePoints(), 60);

    assertNotNull(s.getActionPoints());
    assertEquals(s.getActionPoints(), 12);

    assertNotNull(s.getDamagePoints());
    assertEquals(s.getDamagePoints(), 0);
  }


  @Test
  public void testInteraction() {

    s.attack(a);
    assertEquals(a.getDamagePoints(), 4);
    assertEquals(a.getActionPoints(), 6);

    s.receivesAttackHunter(hu);
    assertEquals(s.getDamagePoints(), 28);
  }


}
