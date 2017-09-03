package HeartStone;

/**
 * Class that implements the constructor and methods associated to the Druid Card.
 * 
 * @author Daniela Campos
 */
public class Druid extends AbstractCard {

  /**
   * Constructor of an object of the Druid Class
   * 
   * @param aName object name
   * @param initial_Life_Points amount of initial life points
   * @param attackPoints amount of initial attack points
   */
  public Druid(String aName, int initial_Life_Points, int attackPoints) {
    NAME = aName;
    LIFE_POINTS = initial_Life_Points;
    actionPoints = attackPoints;
  }

  @Override
  public void attack(Card card) {
    if (this.stillAlive() & card.stillAlive()) {
      card.receivesAttackDruid(this);
    }
  }

  @Override
  public void receivesAttackPaladin(Card card) {
    if (getDamagePoints() > 0) {
      hasBeenDamaged(-1 * card.getActionPoints() * 2 / 3);
    }
    this.setActionPoints(card.getActionPoints() * 2 / 3);
  }

  @Override
  public void receivesAttackShaman(Card card) {
    if (getActionPoints() > 0) {
      this.setActionPoints(-card.getActionPoints() * 2 / 3);
    }
    hasBeenDamaged(card.getActionPoints() * 2 / 3);
  }
}
