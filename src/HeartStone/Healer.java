package HeartStone;

public class Healer extends AbstractCard{
	
	public Healer(String aName, int initial_Life_Points, int attackPoints) {
		name = aName;
		lifePoints = initial_Life_Points;
		actionPoints = attackPoints;
		
	}
	@Override
	public void attack(Card card) {
		if (this.stillAlive() & card.stillAlive()){
			card.receivesAttackHealer(this);	
		}
		
	}

	@Override
	public void receivesAttackAssassin(Card card) {
		hasBeenDamaged(card.getActionPoints() * 2);
		
	}

	@Override
	public void receivesAttackPaladin(Card card) {
		actionPoints += card.getActionPoints()*2/3;
		if(getDamagePoints() > 0) {
			hasBeenDamaged(-1*card.getActionPoints()*2/3);
		}	
		
	}

}
