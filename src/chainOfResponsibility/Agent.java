package chainOfResponsibility;

public class Agent {
	private String agentId;
	private Address workLocation;
	public Agent(String agentId, Address workLocation) {
		super();
		this.agentId = agentId;
		this.workLocation = workLocation;
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public Address getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(Address workLocation) {
		this.workLocation = workLocation;
	}
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", workLocation=" + workLocation + "]";
	}
	
}
