package HeartStone;

/**
 * Clase que implementa el constructor y los metodos asociados al Healer.
 * @author Daniela Campos
 */
public class Healer extends AbstractCard {
	
	/**
	 * Constructor de un objeto de la clase Healer.
	 * @param aName nombre del objeto
	 * @param initial_Life_Points cantidad de puntos de vida inciales
	 * @param attackPoints cantidad de puntos de ataque iniciales
	 */
	public Healer(String aName, int initial_Life_Points, int attackPoints) {
		NAME = aName;
		LIFE_POINTS = initial_Life_Points;
		actionPoints = attackPoints;
	}
	
	@Override
	public void attack(Card card) {
		if (this.stillAlive() & card.stillAlive()) {
			card.receivesAttackHealer(this);	
		}	
	}

	@Override
	public void receivesAttackAssassin(Card card) {
		hasBeenDamaged(card.getActionPoints() * 2);
	}

	@Override
	public void receivesAttackPaladin(Card card) {
		this.setActionPoints(card.getActionPoints()*2/3);
		if (getDamagePoints() > 0) {
			hasBeenDamaged(-1*card.getActionPoints()*2/3);
		}		
	}
}
