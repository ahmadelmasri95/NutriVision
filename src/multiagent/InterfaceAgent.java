package multiagent;

import jade.core.Agent;

import java.util.HashSet;
import java.util.Set;

import jade.core.AID;
import jade.core.behaviours.SimpleBehaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class InterfaceAgent extends Agent {

	public Set<AID> classifierAgents = new HashSet<>();

	@Override
	protected void setup() {
		System.out.printf("Interface Agent %s has been initialized%n", getLocalName());
	}
	
}