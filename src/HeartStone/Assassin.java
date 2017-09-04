package HeartStone;

/**
 * Clase que implementa el constructor y los metodos asociados al Assassin.
 * @author Daniela Campos
 */
public class Assassin extends AbstractCard {
	
	/**
	 * Constructor de un objeto de la clase Assassin.
	 * @param aName nombre del objeto
	 * @param initial_Life_Points cantidad de puntos de vida inciales
	 * @param attackPoints cantidad de puntos de ataque iniciales
	 */
	public Assassin(String aName, int initial_Life_Points, int attackPoints) {
		NAME = aName;
		LIFE_POINTS = initial_Life_Points;
		actionPoints = attackPoints;
	}

	@Override
	public void attack(Card card) {
		if (this.stillAlive() & card.stillAlive()) {
			card.receivesAttackAssassin(this);	
		}
	}

	@Override
	public void receivesAttackDruid(Card card) {
		this.setActionPoints(card.getActionPoints()/2);
	}

	@Override
	public void receivesAttackWarlock(Card card) {
		hasBeenDamaged(card.getActionPoints() * 2);
	}	
}
