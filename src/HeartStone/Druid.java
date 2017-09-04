package HeartStone;

/**
 * Clase que implementa el constructor y los metodos asociados al Druid.
 * @author Daniela Campos
 */
public class Druid extends AbstractCard {

	/**
	 * Constructor de un objeto de la clase Druid.
	 * @param aName nombre del objeto
	 * @param initial_Life_Points cantidad de puntos de vida inciales
	 * @param attackPoints cantidad de puntos de ataque iniciales
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
			hasBeenDamaged(-1*card.getActionPoints()*2/3);
		}
		this.setActionPoints(card.getActionPoints()*2/3);
	}

	@Override
	public void receivesAttackShaman(Card card) {
		if (getActionPoints() > 0) {
			this.setActionPoints(-card.getActionPoints()*2/3);
		}
		hasBeenDamaged(card.getActionPoints()*2/3);
	}
}
