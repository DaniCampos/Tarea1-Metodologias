package HeartStone;

/**
 * Class that implements the constructor and methods associated to the Assassin Card.
 * 
 * @author Daniela Campos
 */
public class Assassin extends AbstractCard {

  /**
   * Constructor of an object of the Assassin Class
   * 
   * @param aName object name
   * @param initial_Life_Points amount of initial life points
   * @param attackPoints amount of initial attack points
   */
  public Assassin(String aName, int initial_Life_Points, int attackPoints) {
    NAME = aName;
    LIFE_POINTS = initial_Life_Points;
    actionPoints = attackPoints;
  }

  @Override
  public void attack(Card card) {
    if (this.stillAlive() & card.stillAlive()) {
      card.receivesAttackAssassin(this);
    }
  }

  @Override
  public void receivesAttackDruid(Card card) {
    this.setActionPoints(card.getActionPoints() / 2);
  }

  @Override
  public void receivesAttackWarlock(Card card) {
    hasBeenDamaged(card.getActionPoints() * 2);
  }
}
