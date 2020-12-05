
public class RandomNum {
	//initialize player and position
	static final int Player = 1;
	static final int Position = 0;
	
	//Method to roll the dice
	public int rollDice()
	{
		int diceNumber= (int) Math.floor(Math.random() * 6+1);
		System.out.println(diceNumber);
		return diceNumber;
	}
	public static void main(String args[])
	{
		RandomNum randomNum= new RandomNum();
		randomNum.rollDice();
		
	}

}
