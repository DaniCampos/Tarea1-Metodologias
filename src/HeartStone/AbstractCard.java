package HeartStone;

/*Comentarios:
 * podría ocupar una funcion attack en abstractcard que verifique que esté alive y dsps lo
 * llama la atack de cada clase
 * 
 * 
 */

public abstract class AbstractCard implements Card{
	
	protected String name;
	protected int lifePoints;
	protected int damagePoints;
	protected int actionPoints;
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getLifePoints() {
		return lifePoints;
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
	public void hasBeenDamaged(int points) {
		damagePoints += points;
	}
	
	@Override
	public boolean stillAlive() {
		if(damagePoints >= lifePoints) {
			return false;
		}
		return true;
	}
	
	//@Override
	//public void receivesAttack(Card card) {
	//	hasBeenDamaged(card.getActionPoints());
	//}
	
	@Override
	public abstract void attack(Card card);
	
	@Override
	public void receivesAttackAssassin(Card card) { //Listo
		hasBeenDamaged(card.getActionPoints());	
	}

	@Override
	public void receivesAttackDruid(Card card) { //Listo
		hasBeenDamaged(card.getActionPoints() /2);
		actionPoints += card.getActionPoints();
	
	}

	@Override
	public void receivesAttackHealer(Card card) { //Listo
		if (getDamagePoints() > 0) {
			hasBeenDamaged(-1*card.getActionPoints()/2);
		}
		
	}

	@Override
	public void receivesAttackHunter(Card card) { //Listo
		hasBeenDamaged(card.getActionPoints());	
	}

	@Override
	public void receivesAttackKnight(Card card) { //Listo
		hasBeenDamaged(card.getActionPoints());
		
	}

	@Override
	public void receivesAttackMage(Card card) { //Listo
		hasBeenDamaged(card.getActionPoints());
		
	}

	@Override
	public void receivesAttackPaladin(Card card) { //Listo
		if(getDamagePoints() > 0) {
			hasBeenDamaged(-1*card.getActionPoints()/3);
		}
		actionPoints += card.getActionPoints()/3;
		
		
	}

	@Override
	public void receivesAttackShaman(Card card) { //Listo
		if(getActionPoints() > 0) {
			actionPoints -= card.getActionPoints()/3; 
		}
		
		hasBeenDamaged(card.getActionPoints()/3); 
		
	}

	@Override
	public void receivesAttackWarlock(Card card) { //Listo
		hasBeenDamaged(card.getActionPoints());	
	}	
	
}
