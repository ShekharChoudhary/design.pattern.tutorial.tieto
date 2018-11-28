package cor_original;

public abstract class AbstractEventApprover implements EventApproval{
	
	protected EventApproval eventApprover;
	
	public abstract String getApprovalMessage(Event event);
	
	@Override
	public void setNextApprover(EventApproval eventApprover){
		this.eventApprover = eventApprover;
	}

}
