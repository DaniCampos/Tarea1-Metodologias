package HeartStone;

/**
 * Class that implements the constructor and methods associated to the Warlock Card.
 * 
 * @author Daniela Campos
 */
public class Warlock extends AbstractCard {

  /**
   * Constructor of an object of the Warlock Class
   * 
   * @param aName object name
   * @param initial_Life_Points amount of initial life points
   * @param attackPoints amount of initial attack points
   */
  public Warlock(String aName, int initial_Life_Points, int attackPoints) {
    NAME = aName;
    LIFE_POINTS = initial_Life_Points;
    actionPoints = attackPoints;
  }

  @Override
  public void attack(Card card) {
    if (this.stillAlive() & card.stillAlive()) {
      card.receivesAttackWarlock(this);
    }
  }

  @Override
  public void receivesAttackHealer(Card card) {
    hasBeenDamaged(card.getActionPoints());
  }

  @Override
  public void receivesAttackShaman(Card card) {
    if (getActionPoints() > 0) {
      this.setActionPoints(-card.getActionPoints() * 2 / 3);
    }
    hasBeenDamaged(card.getActionPoints() * 2 / 3);
  }
}
