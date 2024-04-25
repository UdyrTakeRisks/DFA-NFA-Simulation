import java.util.*;

public class NFASimulationService {
    private Set<Integer> currentState;
    private final Map<Integer, Map<Character, Set<Integer>>> transitions;
    private final Set<Integer> finalStates;

    public NFASimulationService(Map<Integer, Map<Character, Set<Integer>>> transitions, Set<Integer> finalStates) {
        this.transitions = transitions;
        this.finalStates = finalStates;
    }

    public boolean parseString(String input) {
        currentState = new HashSet<>();
        currentState.add(0); // Start with the initial state
        epsilonClosure(); // Calculate epsilon closure for the initial state
        for (char c : input.toCharArray()) {
            Set<Integer> nextState = new HashSet<>();
            for (int state : currentState) {
                // handle undefined transitions
                if (transitions.containsKey(state) && transitions.get(state).containsKey(c)) {
                    nextState.addAll(transitions.get(state).get(c));
                }
            }
            currentState = nextState;
            epsilonClosure(); // Calculate epsilon closure for the next states
        }
        // Check if any of the current states are final states
        for (int state : currentState) {
            if (finalStates.contains(state)) {
                return true;
            }
        }
        return false;
    }

    //the epsilonClosure method adds the states reachable by epsilon transitions to the current set of states
    private void epsilonClosure() {
        // processing states in BFS level-by-level
        Queue<Integer> queue = new LinkedList<>(currentState);
        while (!queue.isEmpty()) {
            int state = queue.poll(); // removes the top of the queue, check if there are epsilon transitions from that state.
            // If there are epsilon transitions, we add the states reachable by epsilon transitions to the current set of states
            if (transitions.containsKey(state) && transitions.get(state).containsKey('ε')) {
                Set<Integer> epsilonTransitions = transitions.get(state).get('ε');
                for (int nextState : epsilonTransitions) {
                    if (!currentState.contains(nextState)) {
                        currentState.add(nextState);
                        queue.add(nextState); // push new reached states to explore their epsilon transitions
                    }
                }
            } // else, going here means no epsilon transitions
        }
    }

}
