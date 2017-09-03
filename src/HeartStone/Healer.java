package HeartStone;

/**
 * Class that implements the constructor and methods associated to the Healer Card.
 * 
 * @author Daniela Campos
 */
public class Healer extends AbstractCard {

  /**
   * Constructor of an object of the Healer Class
   * 
   * @param aName object name
   * @param initial_Life_Points amount of initial life points
   * @param attackPoints amount of initial attack points
   */
  public Healer(String aName, int initial_Life_Points, int attackPoints) {
    NAME = aName;
    LIFE_POINTS = initial_Life_Points;
    actionPoints = attackPoints;
  }

  @Override
  public void attack(Card card) {
    if (this.stillAlive() & card.stillAlive()) {
      card.receivesAttackHealer(this);
    }
  }

  @Override
  public void receivesAttackAssassin(Card card) {
    hasBeenDamaged(card.getActionPoints() * 2);
  }

  @Override
  public void receivesAttackPaladin(Card card) {
    this.setActionPoints(card.getActionPoints() * 2 / 3);
    if (getDamagePoints() > 0) {
      hasBeenDamaged(-1 * card.getActionPoints() * 2 / 3);
    }
  }
}
