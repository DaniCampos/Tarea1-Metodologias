package HeartStone;

/**
 * Abstract Class that implements the methods of the Card interface
 * 
 * @author Daniela Campos
 */
public abstract class AbstractCard implements Card {

  protected String NAME;

  protected int LIFE_POINTS;

  protected int damagePoints = 0;

  protected int actionPoints;

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public int getLifePoints() {
    return LIFE_POINTS;
  }

  @Override
  public int getActionPoints() {
    return actionPoints;
  }

  @Override
  public int getDamagePoints() {
    return damagePoints;
  }

  @Override
  public void setActionPoints(int points) {
    actionPoints += points;
  }

  @Override
  public void hasBeenDamaged(int points) {
    damagePoints += points;
  }

  @Override
  public boolean stillAlive() {
    if (damagePoints >= LIFE_POINTS) {
      return false;
    }
    return true;
  }

  @Override
  public abstract void attack(Card card);

  @Override
  public void receivesAttackAssassin(Card card) {
    hasBeenDamaged(card.getActionPoints());
  }

  @Override
  public void receivesAttackDruid(Card card) {
    hasBeenDamaged(card.getActionPoints() / 2);
    this.setActionPoints(card.getActionPoints());
  }

  @Override
  public void receivesAttackHealer(Card card) {
    if (getDamagePoints() > 0) {
      hasBeenDamaged(-1 * card.getActionPoints() / 2);
    }
  }

  @Override
  public void receivesAttackHunter(Card card) {
    hasBeenDamaged(card.getActionPoints());
  }

  @Override
  public void receivesAttackKnight(Card card) {
    hasBeenDamaged(card.getActionPoints());
  }

  @Override
  public void receivesAttackMage(Card card) {
    hasBeenDamaged(card.getActionPoints());
  }

  @Override
  public void receivesAttackPaladin(Card card) {
    if (getDamagePoints() > 0) {
      hasBeenDamaged(-1 * card.getActionPoints() / 3);
    }
    this.setActionPoints(card.getActionPoints() / 3);
  }

  @Override
  public void receivesAttackShaman(Card card) {
    if (getActionPoints() > 0) {
      this.setActionPoints(-card.getActionPoints() / 3);
    }
    hasBeenDamaged(card.getActionPoints() / 3);
  }

  @Override
  public void receivesAttackWarlock(Card card) {
    hasBeenDamaged(card.getActionPoints());
  }
}
