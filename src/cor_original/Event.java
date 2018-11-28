package cor_original;

public enum Event {
	

	CHOOSE_SUIT("Suit up !"),
	
	WEDDING_FOOD("9 course meal"),
	
	RECEPTION("5 course meal");
	
	
	private String description;
	
	
	
	private Event(String description){
		this.description=description;
	}



	public String getDescription() {
		return description;
	}
	
}
