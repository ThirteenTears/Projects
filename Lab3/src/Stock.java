import java.util.StringTokenizer;

/*
 * Lab 3 Written by Caleb Smith 9/9/2015, CS - 250
 * @author Caleb Smith
 */
public class Stock {

	private String name = "";
	private double price = 0;
	private int volume = 0;
	
	//Sets all values to default.
	public Stock()
	{
		name = "";
		price = 0;
		volume = 0;
	}
	public Stock(String names, double prices, int volumes)
	{
		name = names;
		price = prices;
		volume = volumes;
	}
	public Stock(String input)
	{
		StringTokenizer stk = new StringTokenizer(input);
		name = stk.nextToken();
		price = Double.parseDouble(stk.nextToken());
		volume = Integer.parseInt(stk.nextToken());
	}
	public String getValue()
	{
		String strReturn = "The stock " + name + " is priced at $" + price +". There are " + volume + " stocks available.";
		return strReturn;
	}
	public String getName()
	{
		return name;
	}
	public Double getPrice()
	{
		return price;
	}
	public Integer getVolume()
	{
		return volume;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setPrice(Double d)
	{
		price = d;
	}
	public void setVolume(Integer i)
	{
		volume = i;
	}
	public String getDesc()
	{
		String strReturn = name + " " + price + " " + volume;
		return strReturn;
	}
}
