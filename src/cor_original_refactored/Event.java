package cor_original_refactored;

public enum Event {
	

	CHOOSE_SUIT("Suit up !"),
	
	WEDDING_FOOD("9 course meal"),
	
	RECEPTION("5 course meal"),
	
	DRINK("How can you do this to me !!");
	
	
	private String description;
	
	
	
	private Event(String description){
		this.description=description;
	}



	public String getDescription() {
		return description;
	}
	
}
