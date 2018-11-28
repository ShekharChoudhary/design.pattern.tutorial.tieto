package cor_original_refactored;

import java.util.Optional;

public class EventApprovalLambda {
	
	public static Optional<String> getApprovalMessageFromParents(Event event) {
		if(event == Event.RECEPTION){
			return Optional.of("Parents : " + event.getDescription() + " reception is approved...");
		}else{
			return Optional.empty();
		}
	}
	
	public static Optional<String> getApprovalMessageFromFiancee(Event event) {

		if (event == Event.CHOOSE_SUIT) {
			return Optional.of("Fiance -  Wedding SUIT is kind of approved...Hmmm..Hmm...Can you still try changing the color of the tie?");
		}  {
			return Optional.empty();
		}
	}
	
	
	public static Optional<String> getApprovalMessageFromInLaws(Event event) {

		if (event == Event.WEDDING_FOOD) {
			return Optional.of("In Laws : " + event.getDescription() + " is approved...");
		} else {
			return Optional.empty();
		}
	}

}
