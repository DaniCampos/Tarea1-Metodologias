package HeartStone;

public class Hunter extends AbstractCard {

	
	public Hunter(String aName, int initial_Life_Points, int attackPoints) {
		name = aName;
		lifePoints = initial_Life_Points;
		actionPoints = attackPoints;
		
	}
	
	@Override
	public void attack(Card card) {
		if (this.stillAlive() & card.stillAlive()){
			card.receivesAttackHunter(this);	
		}
		
	}

	@Override
	public void receivesAttackDruid(Card card) {
		hasBeenDamaged(card.getActionPoints() / 2);	
	
	}

	@Override
	public void receivesAttackMage(Card card) {
		hasBeenDamaged(card.getActionPoints()*2);
		
	}

}
