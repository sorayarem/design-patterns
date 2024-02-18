package iterator;

/**
 * The Ticket of a SCRUM Board
 * @author Soraya Remaili
 */
public class Ticket 
{
	private String name;
	private String teamMember;
	private int difficulty;

	/**
	 * Creates a Ticket object with the given parameters.
	 * @param name The name of the task.
	 * @param teamMember The name of the team member.
	 * @param difficulty The difficulty of the task.
	 */
	public Ticket(String name, String teamMember, int difficulty)
	{
		this.name = name;
		this.teamMember = teamMember;
		this.difficulty = difficulty;
	}

	/**
	 * Creates a string representation of the Ticket's task name.
	 * @return A string representation of the task name.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Creates a formatted string representation of the Ticket.
	 * @return A string representation of the Ticket.
	 */
	public String toString()
	{
		return name + "(" + difficulty + ") - " + teamMember;
	}
}

