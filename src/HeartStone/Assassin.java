package HeartStone;

public class Assassin extends AbstractCard{
	//public static int initial_Life_Points = 100;
	//public int attackPoints = 10;
	
	public Assassin(String aName, int initial_Life_Points, int attackPoints) {
		name = aName;
		lifePoints = initial_Life_Points;
		actionPoints = attackPoints;
		
	}

	@Override
	public void attack(Card card) {
		if (this.stillAlive() & card.stillAlive()){
			card.receivesAttackAssassin(this);	
		}
		
	}

	@Override
	public void receivesAttackDruid(Card card) { //Listo
		actionPoints += card.getActionPoints() * 1/2;
		
		
		
	}

	@Override
	public void receivesAttackWarlock(Card card) { //Listo
		hasBeenDamaged(card.getActionPoints() * 2);
	}	
	

}
