package HeartStone;

/**
 * Class that implements the constructor and methods associated to the Shaman Card.
 * 
 * @author Daniela Campos
 */
public class Shaman extends AbstractCard {

  /**
   * Constructor of an object of the Shaman Class
   * 
   * @param aName object name
   * @param initial_Life_Points amount of initial life points
   * @param attackPoints amount of initial attack points
   */
  public Shaman(String aName, int initial_Life_Points, int attackPoints) {
    NAME = aName;
    LIFE_POINTS = initial_Life_Points;
    actionPoints = attackPoints;
  }

  @Override
  public void attack(Card card) {
    if (this.stillAlive() & card.stillAlive()) {
      card.receivesAttackShaman(this);
    }
  }

  @Override
  public void receivesAttackHunter(Card card) {
    hasBeenDamaged(card.getActionPoints() * 2);
  }
}
