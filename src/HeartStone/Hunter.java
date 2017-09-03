package HeartStone;

/**
 * Class that implements the constructor and methods associated to the Hunter Card.
 * 
 * @author Daniela Campos
 */
public class Hunter extends AbstractCard {

  /**
   * Constructor of an object of the Hunter Class
   * 
   * @param aName object name
   * @param initial_Life_Points amount of initial life points
   * @param attackPoints amount of initial attack points
   */
  public Hunter(String aName, int initial_Life_Points, int attackPoints) {
    NAME = aName;
    LIFE_POINTS = initial_Life_Points;
    actionPoints = attackPoints;
  }

  @Override
  public void attack(Card card) {
    if (this.stillAlive() & card.stillAlive()) {
      card.receivesAttackHunter(this);
    }
  }

  @Override
  public void receivesAttackDruid(Card card) {
    hasBeenDamaged(card.getActionPoints() / 2);
  }

  @Override
  public void receivesAttackMage(Card card) {
    hasBeenDamaged(card.getActionPoints() * 2);
  }
}
