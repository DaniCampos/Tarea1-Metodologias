package HeartStone;

/**
 * Interface that has the following methods to implement the heartStone Game
 * 
 * @author Daniela Campos
 */
public interface Card {

  /**
   * Returns the name of a Card.
   * 
   * @return name
   */
  String getName();

  /**
   * Returns the life points of a Card.
   * 
   * @return lifePoints
   */
  int getLifePoints();

  /**
   * Returns the action points of a Card.
   * 
   * @return actionPoints
   */
  int getActionPoints();

  /**
   * Returns the damage points of a Card.
   * 
   * @return damagePoints
   */
  int getDamagePoints();

  /**
   * Sums the indicated points to the actionPoints of the Card.
   * 
   * @param points amount of action points
   */
  void setActionPoints(int points);

  /**
   * Changes the value of the damage points.
   * 
   * @param points amount of points with witch the card was attacked
   */
  void hasBeenDamaged(int points);

  /**
   * Verifies that the card is still alive
   * 
   * @return false if the life points are less than the damage points, true if not.
   */
  boolean stillAlive();

  /**
   * Attacks the corresponding card.
   * 
   * @param card Card that will be attacked by the current card
   */
  void attack(Card card);

  /**
   * Executes the attack of an Assassin.
   * 
   * @param card Card that's attacking the current card
   */
  void receivesAttackAssassin(Card card);

  /**
   * Executes the attack of a Druid.
   * 
   * @param card Card that's attacking the current card
   */
  void receivesAttackDruid(Card card);

  /**
   * Executes the attack of a Healer.
   * 
   * @param card Card that's attacking the current card
   */
  void receivesAttackHealer(Card card);

  /**
   * Executes the attack of a Hunter.
   * 
   * @param card Card that's attacking the current card
   */
  void receivesAttackHunter(Card card);

  /**
   * Executes the attack of a Knight.
   * 
   * @param card Card that's attacking the current card
   */
  void receivesAttackKnight(Card card);

  /**
   * Executes the attack of a Mage.
   * 
   * @param card Card that's attacking the current card
   */
  void receivesAttackMage(Card card);

  /**
   * Executes the attack of a Paladin.
   * 
   * @param card Card that's attacking the current card
   */
  void receivesAttackPaladin(Card card);

  /**
   * Executes the attack of a Shaman.
   * 
   * @param card Card that's attacking the current card
   */
  void receivesAttackShaman(Card card);

  /**
   * Executes the attack of a Warlock.
   * 
   * @param card Card that's attacking the current card
   */
  void receivesAttackWarlock(Card card);
}
