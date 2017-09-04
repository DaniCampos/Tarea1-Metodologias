package HeartStone;

/**
 * Clase que implementa el constructor y los metodos asociados al Warlock.
 * @author Daniela Campos
 */
public class Warlock extends AbstractCard {
	
	/**
	 * Constructor de un objeto de la clase Warlock.
	 * @param aName nombre del objeto
	 * @param initial_Life_Points cantidad de puntos de vida inciales
	 * @param attackPoints cantidad de puntos de ataque iniciales
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
			this.setActionPoints(-card.getActionPoints()*2/3);
		}	
		hasBeenDamaged(card.getActionPoints()*2/3);
	}
}
