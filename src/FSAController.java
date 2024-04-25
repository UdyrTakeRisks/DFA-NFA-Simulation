import java.util.*;

public class FSAController {
    static Map<Integer, Map<Character, Integer>> dfaStateTransitions;
    static Set<Integer> dfaFinalStates;
    static DFASimulationService dfaSimulation;
    static Map<Integer, Map<Character, Set<Integer>>> nfaStateTransitions;
    static Set<Integer> nfaFinalStates;
    static NFASimulationService nfaSimulation;

    public static void simulateProblem1(String inputString) {
        // Define Problem 1 transitions from either transition functions or transition table
        // Define Problem 1 final states
        dfaStateTransitions = new HashMap<>();
        dfaStateTransitions.put(0, Map.of('a', 0, 'b', 1));
        dfaStateTransitions.put(1, Map.of('a', 2, 'b', 1));
        dfaStateTransitions.put(2, Map.of('a', 2, 'b', 2));

        dfaFinalStates = new HashSet<>();
        dfaFinalStates.add(0);
        dfaFinalStates.add(1);

        dfaSimulation = new DFASimulationService(dfaStateTransitions, dfaFinalStates);

        if (dfaSimulation.parseString(inputString))
            FSAFileService.writeToFile("True");
        else
            FSAFileService.writeToFile("False");
    }

    public static void simulateProblem2(String inputString) {
        // Define Problem 2 transitions from either transition functions or transition table
        // Define Problem 2 final states
        // Define Problem 2 transitions from either transition functions or transition table
        // Define Problem 2 final states
        dfaStateTransitions = new HashMap<>();
        dfaStateTransitions.put(0, Map.of('0', 1, '1', 5));
        dfaStateTransitions.put(1, Map.of('0', 2, '1', 3));
        dfaStateTransitions.put(2, Map.of('0', 1, '1', 4));
        dfaStateTransitions.put(3, Map.of('0', 1, '1', 3));
        dfaStateTransitions.put(4, Map.of('0', 1, '1', 3));
        dfaStateTransitions.put(5, Map.of('0', 1, '1', 6));
        dfaStateTransitions.put(6, Map.of('0', 1, '1', 6));

        dfaFinalStates = new HashSet<>();
        dfaFinalStates.add(4);
        dfaFinalStates.add(5);

        dfaSimulation = new DFASimulationService(dfaStateTransitions, dfaFinalStates);

        if (dfaSimulation.parseString(inputString))
            FSAFileService.writeToFile("True");
        else
            FSAFileService.writeToFile("False");
    }

    public static void simulateProblem3(String inputString) {
        // Define Problem 3 transitions from either transition functions or transition table
        // Define Problem 3 final states
        dfaStateTransitions = new HashMap<>();
        dfaStateTransitions.put(0, Map.of('x', 1, 'y', 0));
        dfaStateTransitions.put(1, Map.of('x', 0, 'y', 1));


        dfaFinalStates = new HashSet<>();
        dfaFinalStates.add(1);

        dfaSimulation = new DFASimulationService(dfaStateTransitions, dfaFinalStates);

        if (dfaSimulation.parseString(inputString))
            FSAFileService.writeToFile("True");
        else
            FSAFileService.writeToFile("False");
    }

    public static void simulateProblem4(String inputString) {
        // Define Problem 4 transitions from either transition functions or transition table
        // Define Problem 4 final states
        dfaStateTransitions = new HashMap<>();
        dfaStateTransitions.put(0, Map.of('a', 1, 'b', 4));
        dfaStateTransitions.put(1, Map.of('a', 2, 'b', 3));
        dfaStateTransitions.put(2, Map.of('a', 2, 'b', 3));
        dfaStateTransitions.put(3, Map.of('a', 2, 'b', 3));
        dfaStateTransitions.put(4, Map.of('a', 5, 'b', 6));
        dfaStateTransitions.put(5, Map.of('a', 5, 'b', 6));
        dfaStateTransitions.put(6, Map.of('a', 5, 'b', 6));

        dfaFinalStates = new HashSet<>();
        dfaFinalStates.add(1);
        dfaFinalStates.add(2);
        dfaFinalStates.add(4);
        dfaFinalStates.add(6);

        dfaSimulation = new DFASimulationService(dfaStateTransitions, dfaFinalStates);

        if (dfaSimulation.parseString(inputString))
            FSAFileService.writeToFile("True");
        else
            FSAFileService.writeToFile("False");
    }

    public static void simulateProblem5(String inputString) {
        // Define Problem 5 transitions from either transition functions or transition table
        // Define Problem 5 final states
        dfaStateTransitions = new HashMap<>();
        dfaStateTransitions.put(0, Map.of('0', 0, '1', 2));
        dfaStateTransitions.put(1, Map.of('0', 0, '1', 2));
        dfaStateTransitions.put(2, Map.of('0', 1, '1', 2));

        dfaFinalStates = new HashSet<>();
        dfaFinalStates.add(0);

        dfaSimulation = new DFASimulationService(dfaStateTransitions, dfaFinalStates);

        if (dfaSimulation.parseString(inputString))
            FSAFileService.writeToFile("True");
        else
            FSAFileService.writeToFile("False");
    }

    public static void simulateProblem6(String inputString) {
        // Define Problem 6 transitions from either transition functions or transition table
        // Define Problem 6 final states
        dfaStateTransitions = new HashMap<>();
        dfaStateTransitions.put(0, Map.of('0', 4, '1', 1));
        dfaStateTransitions.put(1, Map.of('0', 4, '1', 2));
        dfaStateTransitions.put(2, Map.of('0', 4, '1', 3));
        dfaStateTransitions.put(3, Map.of('0', 4, '1', 4));
        dfaStateTransitions.put(4, Map.of('0', 4, '1', 4));

        dfaFinalStates = new HashSet<>();
        dfaFinalStates.add(0);
        dfaFinalStates.add(1);
        dfaFinalStates.add(4);

        dfaSimulation = new DFASimulationService(dfaStateTransitions, dfaFinalStates);

        if (dfaSimulation.parseString(inputString))
            FSAFileService.writeToFile("True");
        else
            FSAFileService.writeToFile("False");
    }

    public static void simulateProblem7(String inputString) {
        // Define transitions and final states for problem 7
        nfaStateTransitions = new HashMap<>();
        nfaStateTransitions.put(0, Map.of('0', new HashSet<>(List.of(1)), '1', new HashSet<>(List.of(2))));
        nfaStateTransitions.put(1, Map.of('ε', new HashSet<>(List.of(3))));
        nfaStateTransitions.put(2, Map.of('ε', new HashSet<>(List.of(4))));
        nfaStateTransitions.put(3, Map.of('0', new HashSet<>(List.of(3, 5)), '1', new HashSet<>(List.of(3))));
        nfaStateTransitions.put(4, Map.of('0', new HashSet<>(List.of(4)), '1', new HashSet<>(List.of(4, 6))));

        nfaFinalStates = new HashSet<>(List.of(0, 1, 2, 5, 6));

        nfaSimulation = new NFASimulationService(nfaStateTransitions, nfaFinalStates);

        if (nfaSimulation.parseString(inputString))
            FSAFileService.writeToFile("True");
        else
            FSAFileService.writeToFile("False");
    }

    public static void simulateProblem8(String inputString) {
        // Define transitions and final states for problem 8
        nfaStateTransitions = new HashMap<>();
        nfaStateTransitions.put(0, Map.of('1', new HashSet<>(List.of(0, 1)), '0', new HashSet<>(List.of(0, 3))));
        nfaStateTransitions.put(1, Map.of('0', new HashSet<>(List.of(2))));
        nfaStateTransitions.put(2, Map.of('1', new HashSet<>(List.of(5))));
        nfaStateTransitions.put(3, Map.of('1', new HashSet<>(List.of(4))));
        nfaStateTransitions.put(4, Map.of('0', new HashSet<>(List.of(5))));
        nfaStateTransitions.put(5, Map.of('0', new HashSet<>(List.of(5)), '1', new HashSet<>(List.of(5))));

        nfaFinalStates = new HashSet<>(List.of(5));

        nfaSimulation = new NFASimulationService(nfaStateTransitions, nfaFinalStates);

        if (nfaSimulation.parseString(inputString))
            FSAFileService.writeToFile("True");
        else
            FSAFileService.writeToFile("False");
    }

    public static void simulateProblem9(String inputString) {
        // Define transitions and final states for problem 9
        nfaStateTransitions = new HashMap<>();
        nfaStateTransitions.put(0, Map.of('ε', new HashSet<>(List.of(1, 4))));
        nfaStateTransitions.put(1, Map.of('0', new HashSet<>(List.of(2))));
        nfaStateTransitions.put(2, Map.of('1', new HashSet<>(List.of(3))));
        nfaStateTransitions.put(3, Map.of('ε', new HashSet<>(List.of(1))));
        nfaStateTransitions.put(4, Map.of('1', new HashSet<>(List.of(5))));
        nfaStateTransitions.put(5, Map.of('0', new HashSet<>(List.of(6))));
        nfaStateTransitions.put(6, Map.of('ε', new HashSet<>(List.of(4))));

        nfaFinalStates = new HashSet<>(List.of(1, 2, 4, 5));

        nfaSimulation = new NFASimulationService(nfaStateTransitions, nfaFinalStates);

        if (nfaSimulation.parseString(inputString))
            FSAFileService.writeToFile("True");
        else
            FSAFileService.writeToFile("False");
    }

    public static void simulateProblem10(String inputString) {
        // Define transitions and final states for problem 10
        nfaStateTransitions = new HashMap<>();
        nfaStateTransitions.put(0, Map.of('1', new HashSet<>(List.of(0)), '0', new HashSet<>(List.of(1))));
        nfaStateTransitions.put(1, Map.of('1', new HashSet<>(List.of(2))));
        nfaStateTransitions.put(2, Map.of('1', new HashSet<>(List.of(2)), 'ε', new HashSet<>(List.of(0))));

        nfaFinalStates = new HashSet<>(List.of(0));

        nfaSimulation = new NFASimulationService(nfaStateTransitions, nfaFinalStates);

        if (nfaSimulation.parseString(inputString))
            FSAFileService.writeToFile("True");
        else
            FSAFileService.writeToFile("False");
    }

}
