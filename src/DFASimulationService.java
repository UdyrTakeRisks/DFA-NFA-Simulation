import java.util.Map;
import java.util.Set;

public class DFASimulationService {
    private final Map<Integer, Map<Character, Integer>> stateTransitions;
    private final Set<Integer> finalStates;

    public DFASimulationService(Map<Integer, Map<Character, Integer>> stateTransitions, Set<Integer> finalStates) {
        this.stateTransitions = stateTransitions;
        this.finalStates = finalStates;
    }

    public boolean parseString(String input) {
        int currentState = 0; // initial state
        for (char c : input.toCharArray()) {
            // handle undefined transitions
            // no need to handle not found transitions assuming DFA states consume every input symbol (code will be faster but less robust)
            // ex: get(0).get(a) = 1 (returns value 1 which is the next state by using state 0 with input symbol a)
            // ex: get(0).get(b) = 2 (returns value 2 which is the next state by using state 0 with input symbol b)
            currentState = stateTransitions.get(currentState).get(c); // get transition to the next state by the current state
        }
        return finalStates.contains(currentState); // returns true if the state reached is a final state, false otherwise
    }

}
