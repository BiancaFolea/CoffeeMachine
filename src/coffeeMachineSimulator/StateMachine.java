package coffeeMachineSimulator;

import java.util.HashMap;
import java.util.Map;

public abstract class StateMachine {
	int currentState;
	public HashMap<Integer, HashMap<Integer, Integer>> transitionTable;
	
	StateMachine()
	{

	}
	
	public void run() 
	{}
	
	
	public Boolean Transition(int action)
	{
		if(transitionTable.get(currentState).get(action)!=null)
			return true;
		else
			return false;
	}
	
} 