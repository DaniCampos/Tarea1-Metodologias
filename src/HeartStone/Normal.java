package HeartStone;

public class Normal extends AbstractCard {

	@Override
	public void receivesAttackAssassin(Card card) {
		receivesAttack(card);
		
	}

	@Override
	public void receivesAttackDruid(Card card) {
		actionPoints = actionPoints * 2;
		hasBeenDamaged(card.getActionPoints() /2);
		
	}

	@Override
	public void receivesAttackHealer(Card card) {
		if (stillAlive()) {
			hasBeenDamaged(-1*actionPoints/2);
		}
		
	}

	@Override
	public void receivesAttackHunter(Card card) {
		receivesAttack(card);
		
	}

	@Override
	public void receivesAttackKnight(Card card) {
		receivesAttack(card);
		
	}

	@Override
	public void receivesAttackMage(Card card) {
		receivesAttack(card);
		
	}

	@Override
	public void receivesAttackPaladin(Card card) {
		actionPoints += card.getActionPoints()/3;
		hasBeenDamaged(-1*card.getActionPoints()/3);
		
	}

	@Override
	public void receivesAttackShaman(Card card) {
		actionPoints -= card.getActionPoints()/3;
		hasBeenDamaged(card.getActionPoints()/3);
		
	}

	@Override
	public void receivesAttackWarlock(Card card) {
		receivesAttack(card);
		
	}

	@Override
	public void attack(Card card) {
		// TODO Auto-generated method stub
		
	}

}
