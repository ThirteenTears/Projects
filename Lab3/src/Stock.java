
public class Stock {

	private String name = "";
	private double price = 0;
	private int volume = 0;
	
	//Sets all values to default.
	public void reset()
	{
		name = "";
		price = 0;
		volume = 0;
	}
	public void addStock(String names, double prices, int volumes)
	{
		name = names;
		price = prices;
		volume = volumes;
	}
	public void addStock2(String input)
	{
		String[] split = input.split(" ");
		name = split[0];
		price = Double.parseDouble(split[1]);
		volume = Integer.parseInt(split[2]);
	}
	
	
}
