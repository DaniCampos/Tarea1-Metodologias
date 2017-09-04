package HeartStone;

/**
 * Interface that has the following methods to implement the heartStone Game
 * @author Daniela Campos
 */
public interface Card {

	/**
	 * Retorna el nombre de una carta.
	 * @return name
	 */
	String getName();
	
	/**
	 * Retorna los puntos de vida de una carta.
	 * @return lifePoints
	 */
	int getLifePoints();
	
	/**
	 * Retorna los puntos de accion de una carta.
	 * @return actionPoints
	 */
	int getActionPoints();
	
	/**
	 * Retorna los puntos de daño de una carta.
	 * @return damagePoints
	 */
	int getDamagePoints();
	
	/**
	 * Le suma a actionPoints los puntos indicados.
	 * @param points cantidad de puntos de accion
	 */
	void setActionPoints(int points);
	
	/**
	 * Cambia el valor de los puntos de daño
	 * @param points puntos con los que fue atacada la carta
	 */
	void hasBeenDamaged(int points);
	
	/**
	 * Verifica que la carta siga viva
	 * @return false si es que los puntos de vida son menores a los de daño, true si no
	 */
	boolean stillAlive();

	/**
	 * Ataca a la carta correspondiente
	 * @param card carta que sera atacada por la carta actual
	 */
	void attack(Card card);
	
	/**
	 * Ejecuta el ataque de un Assassin.
	 * @param card carta que esta atacando a la carta actual
	 */
	void receivesAttackAssassin(Card card);
	
	/**
	 * Ejecuta el ataque de un Druid.
	 * @param card carta que esta atacando a la carta actual
	 */
	void receivesAttackDruid(Card card);
	
	/**
	 * Ejecuta el ataque de un Healer.
	 * @param card carta que esta atacando a la carta actual
	 */
	void receivesAttackHealer(Card card);
	
	/**
	 * Ejecuta el ataque de un Hunter.
	 * @param card carta que esta atacando a la carta actual
	 */
	void receivesAttackHunter(Card card);
	
	/**
	 * Ejecuta el ataque de un Knight.
	 * @param card carta que esta atacando a la carta actual
	 */
	void receivesAttackKnight(Card card);
	
	/**
	 * Ejecuta el ataque de un Mage.
	 * @param card carta que esta atacando a la carta actual
	 */
	void receivesAttackMage(Card card);
	
	/**
	 * Ejecuta el ataque de un Paladin.
	 * @param card carta que esta atacando a la carta actual
	 */
	void receivesAttackPaladin(Card card);
	
	/**
	 * Ejecuta el ataque de un Shaman.
	 * @param card carta que esta atacando a la carta actual
	 */
	void receivesAttackShaman(Card card);
	
	/**
	 * Ejecuta el ataque de un Warlock.
	 * @param card carta que esta atacando a la carta actual
	 */
	void receivesAttackWarlock(Card card);
}
