
class Communication_Farmer_Agri extends Communication{

 //attributes
	protected Agriculturist agriculturist;
	
	//Constructor
	public Farmer_Agriculturist_Communication(Farmer farmer, Agriculturist agriculturist, String topic) {
		super(farmer, topic);
		this.agriculturist = agriculturist;
	}
	
	//Methods
	public Agriculturist getAgriculturist() {
		return this.agriculturist;
	}
 
}

 
