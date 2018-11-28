package cor_original_refactored;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class EventApproverTest {

	public static void main(String[] args) {
		
		Event event  = Event.CHOOSE_SUIT;
		
		System.out.println(Stream.<Function<Event,Optional<String>>>of(EventApprovalLambda::getApprovalMessageFromParents,
									EventApprovalLambda::getApprovalMessageFromInLaws,					
									EventApprovalLambda::getApprovalMessageFromFiancee)
		.map( f -> f.apply(event))
		.filter(Optional::isPresent)
		.findFirst()
		.flatMap(Function.identity()));
	}
}
