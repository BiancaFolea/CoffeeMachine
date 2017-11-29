package coffeeMachineSimulator;

import java.util.HashMap;
import java.util.Scanner;

public class CoffeeMachine extends StateMachine {

	CoffeeMachine()
	{		
		transitionTable = new HashMap<Integer, HashMap<Integer, Integer>>();
		
		HashMap<Integer, Integer> state0 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> state5 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> state10 = new HashMap<Integer, Integer>();
		
		state0.put(5,5);
		state0.put(10, 10);
		
		state5.put(5, 10);
		state5.put(10, 15);
		
		state10.put(5, 15);
		state10.put(10, 20);

		transitionTable.put(0, state0);
		transitionTable.put(5, state5);
		transitionTable.put(10, state10);
		
		currentState=0;
	}
	
	@Override
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		int action;

		while(true)
		{
			
			System.out.println("Credit: " + currentState);
			System.out.println("Introduceti o bacnota: ");
			action = scanner.nextInt();

			
				if(Transition(action))
				{
					currentState = transitionTable.get(currentState).get(action);
				}
				else
				{
					System.out.println("\nError: Nu se poate");
				}
				

			
			
			if(currentState >= 15)
			{
				
					currentState -=15;
					System.out.println("\n Ai cumparat o cafea la 15 lei. ");

			}
			
		}
	}
}