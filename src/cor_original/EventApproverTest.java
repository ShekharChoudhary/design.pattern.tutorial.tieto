package cor_original;

public class EventApproverTest {

	public static void main(String[] args) {
		
		EventApproval parentsApproval = new ParentsApproval();
		
		EventApproval inLawsApproval = new FutureInLawsApproval();
		
		EventApproval fianceApproval = new FianceeApproval();
		
		parentsApproval.setNextApprover(inLawsApproval);
		inLawsApproval.setNextApprover(fianceApproval);
		
		Event event  = Event.RECEPTION;
		
		System.out.println(parentsApproval.getApprovalMessage(event));
		
		

	}
}
