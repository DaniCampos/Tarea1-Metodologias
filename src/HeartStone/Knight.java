package HeartStone;

/**
 * Clase que implementa el constructor y los metodos asociados al Knight.
 * @author Daniela Campos
 */
public class Knight extends AbstractCard {
	
	/**
	 * Constructor de un objeto de la clase Knight.
	 * @param aName nombre del objeto
	 * @param initial_Life_Points cantidad de puntos de vida inciales
	 * @param attackPoints cantidad de puntos de ataque iniciales
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
		hasBeenDamaged(card.getActionPoints()/2);
	}
	
	@Override
	public void receivesAttackHunter(Card card) {
		hasBeenDamaged(card.getActionPoints()*2);	
	}
}
