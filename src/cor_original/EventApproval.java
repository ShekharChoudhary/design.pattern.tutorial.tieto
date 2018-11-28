package cor_original;

public interface EventApproval {
	
	public String getApprovalMessage(Event event);
	
	public void setNextApprover(EventApproval eventApprover);

}
