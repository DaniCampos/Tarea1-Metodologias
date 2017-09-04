package HeartStone;

/**
 * Clase que implementa el constructor y los metodos asociados al Mage.
 * @author Daniela Campos
 */
public class Mage extends AbstractCard {
	
	/**
	 * Constructor de un objeto de la clase Mage.
	 * @param aName nombre del objeto
	 * @param initial_Life_Points cantidad de puntos de vida inciales
	 * @param attackPoints cantidad de puntos de ataque iniciales
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
		hasBeenDamaged(card.getActionPoints()*2);	
	}

	@Override
	public void receivesAttackWarlock(Card card) {
		hasBeenDamaged(card.getActionPoints()/2);	
	}
}
