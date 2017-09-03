package HeartStone;

/**
 * Class that implements the constructor and methods associated to the Paladin Card.
 * 
 * @author Daniela Campos
 */
public class Paladin extends AbstractCard {

  /**
   * Constructor of an object of the Paladin Class
   * 
   * @param aName object name
   * @param initial_Life_Points amount of initial life points
   * @param attackPoints amount of initial attack points
   */
  public Paladin(String aName, int initial_Life_Points, int attackPoints) {
    NAME = aName;
    LIFE_POINTS = initial_Life_Points;
    actionPoints = attackPoints;
  }

  @Override
  public void attack(Card card) {
    if (this.stillAlive() & card.stillAlive()) {
      card.receivesAttackPaladin(this);
    }
  }

  @Override
  public void receivesAttackKnight(Card card) {
    hasBeenDamaged(card.getActionPoints() / 2);
  }

  @Override
  public void receivesAttackMage(Card card) {
    hasBeenDamaged(card.getActionPoints() * 2);
  }
}
