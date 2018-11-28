package cor_original;

public class FutureInLawsApproval extends AbstractEventApprover {

	@Override
	public String getApprovalMessage(Event event) {

		if (event == Event.WEDDING_FOOD) {
			return "In Laws : " + event.getDescription() + " is approved...";
		} else if (eventApprover != null) {
			return eventApprover.getApprovalMessage(event);
		} else {
			throw new RuntimeException("In Laws : Cannot approve unknown event...");
		}
	}

}
