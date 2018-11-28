package cor_original;

public class ParentsApproval extends AbstractEventApprover {

	@Override
	public String getApprovalMessage(Event event) {
		
		if(event == Event.RECEPTION){
			return "Parents : " + event.getDescription() + " reception is approved...";
		}else if(eventApprover != null){
			return eventApprover.getApprovalMessage(event);
			
		}else {
			throw new RuntimeException("Son : Grow up now,  cannot approve Unknown event...");
		}
	}

}
