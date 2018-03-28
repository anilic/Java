//Anýl Çelik - 160302021 

public class Electronics implements KDV
{
	protected String model;
	protected double price;
	private int count;
	
	public Electronics(String model, double price)
	{
		this.model = model;
		this.price = price;
	}
	
	public void setCounter(int count) { this.count = count; } //setter for count variable because count is not taken as a parameter in the constructor
	public String getModel() { return model; }
	public double getPrice() { return price; }
	public int getCounter() { return count; }
	
	public double priceWithKDV(double price) { return price += (0.18 * price); }
	
	public String toString() { return model + ", " + price; } //this should be declared as an abstract method but in order to declare this method as abstract,
															  //we also need to declare the class as abstract class. so, i just wrote a temporary function 
															  //rather than declaring the class as abstract.
}

class Notebook extends Electronics
{
	private int RAM, HDD;
	private String cpuDesc, gpuDesc;
	
	public Notebook(String model, double price, int RAM, int HDD, String cpuDesc, String gpuDesc)
	{
		super(model, price);
		
		this.RAM = RAM;
		this.HDD = HDD;
		this.cpuDesc = cpuDesc;
		this.gpuDesc = gpuDesc;
	}
	
	public int getRAM() { return RAM; }
	public int getHDD() { return HDD; }
	public String getcpuDesc() { return cpuDesc; }
	public String getgpuDesc() { return gpuDesc; }

	public String toString() { return model + " costs " + priceWithKDV(price) + " TL " + "and has following features: " + RAM + "GB RAM, " + HDD + "GB storage, " + cpuDesc + " CPU, " + gpuDesc + " GPU."; }
}

class TV extends Electronics
{
	private String resolution, type; //type is LED or LCD
	private double inch;
	
	public TV(String model, double price, String resolution, String type, double inch)
	{
		super(model, price);
		
		this.resolution = resolution;
		this.type = type;
		this.inch = inch;
	}
	
	public String getResolution() { return resolution; }
	public String getType() { return type; }
	public double getSize() { return inch; }
	
	public String toString() { return model + " costs " + priceWithKDV(price) + " TL " + "and has following features: " + type + " TV, " + inch + " inches, " + resolution + " resolution."; }
}

