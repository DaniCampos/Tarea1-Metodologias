package HeartStone;

public class Shaman extends AbstractCard {

	public Shaman(String aName, int initial_Life_Points, int attackPoints) {
		name = aName;
		lifePoints = initial_Life_Points;
		actionPoints = attackPoints;
		
	}
	
	@Override
	public void attack(Card card) {
		if (this.stillAlive() & card.stillAlive()){
			card.receivesAttackShaman(this);	
		}
		
	}

	@Override
	public void receivesAttackHunter(Card card) {
		hasBeenDamaged(card.getActionPoints() * 2);
		
	}
}
