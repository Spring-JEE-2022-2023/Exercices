package ch.hearc.beershopfull.catalog.model;

/**
 * Model of a beer
 * @author Seb
 *
 */
public class Beer {

	public String name;
	public Integer price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
