package HeartStone;

/**
 * Clase que implementa el constructor y los metodos asociados al Paladin.
 * @author Daniela Campos
 */
public class Paladin extends AbstractCard {
	
	/**
	 * Constructor de un objeto de la clase Paladin.
	 * @param aName nombre del objeto
	 * @param initial_Life_Points cantidad de puntos de vida inciales
	 * @param attackPoints cantidad de puntos de ataque iniciales
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
		hasBeenDamaged(card.getActionPoints()/2);
	}

	@Override
	public void receivesAttackMage(Card card) {
		hasBeenDamaged(card.getActionPoints()*2);	
	}
}
