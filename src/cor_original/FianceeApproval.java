package cor_original;

public class FianceeApproval extends AbstractEventApprover {

	@Override
	public String getApprovalMessage(Event event) {

		if (event == Event.CHOOSE_SUIT) {
			return "Fiance -  Wedding SUIT is kind of approved...Hmmm..Hmm...Can you still try changing the color of the tie?";
		} else if (eventApprover != null) {
			return eventApprover.getApprovalMessage(event);
		} else {
			throw new RuntimeException("Fiance : This is an unknown event, Grrrrr !!!!"+ event.getDescription());
		}
	}

}
