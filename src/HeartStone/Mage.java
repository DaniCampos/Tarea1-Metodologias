package HeartStone;

/**
 * Class that implements the constructor and methods associated to the Mage Card.
 * 
 * @author Daniela Campos
 */
public class Mage extends AbstractCard {

  /**
   * Constructor of an object of the Mage Class
   * 
   * @param aName object name
   * @param initial_Life_Points amount of initial life points
   * @param attackPoints amount of initial attack points
   */
  public Mage(String aName, int initial_Life_Points, int attackPoints) {
    NAME = aName;
    LIFE_POINTS = initial_Life_Points;
    actionPoints = attackPoints;
  }

  @Override
  public void attack(Card card) {
    if (this.stillAlive() & card.stillAlive()) {
      card.receivesAttackMage(this);
    }
  }

  @Override
  public void receivesAttackAssassin(Card card) {
    hasBeenDamaged(card.getActionPoints() * 2);
  }

  @Override
  public void receivesAttackWarlock(Card card) {
    hasBeenDamaged(card.getActionPoints() / 2);
  }
}
