public class Cultivation {
  //attributes
  private double latitude;
  private double longtitude;
  private double area;
  private String type;
  
  //constructor
	public Cultivation(double lat, double longt, double area, String type) {
		this.latitude = lat;
		this.longtitude = longt;
		this.area = area;
		this.type = type;
	}
	
	//methods
	
	//    *****Sets&Gets*****
	public double getLatitude() {
		return this.latitude;
	}
	
	public double getLongtitude() {
		return this.longtitude;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setLatitude(double d) {
		this.latitude = d;
	}
	
	public void setLongtitude(double d) {
		this.longtitude = d;
	}
	
	public void setArea(double d) {
		this.area = d;
	}
	
	public void setType(String s) {
		this.type = s;
	}
	//  *****Sets&Gets*****
}
