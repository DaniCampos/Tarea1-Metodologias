package HeartStone;

/**
 * Class that implements the constructor and methods associated to the Knight Card.
 * 
 * @author Daniela Campos
 */
public class Knight extends AbstractCard {

  /**
   * Constructor of an object of the Knight Class
   * 
   * @param aName object name
   * @param initial_Life_Points amount of initial life points
   * @param attackPoints amount of initial attack points
   */
  public Knight(String aName, int initial_Life_Points, int attackPoints) {
    NAME = aName;
    LIFE_POINTS = initial_Life_Points;
    actionPoints = attackPoints;
  }

  @Override
  public void attack(Card card) {
    if (this.stillAlive() & card.stillAlive()) {
      card.receivesAttackKnight(this);
    }
  }

  @Override
  public void receivesAttackAssassin(Card card) {
    hasBeenDamaged(card.getActionPoints() / 2);
  }

  @Override
  public void receivesAttackHunter(Card card) {
    hasBeenDamaged(card.getActionPoints() * 2);
  }
}
