package iterator;

/**
 * The SCRUM Board of a project.
 * @author Soraya Remaili
 */
public class SCRUMBoard 
{
	private String projectName;
	private TaskList todo;
	private TaskList doing;
	private TaskList done;

	/**
	 * Creates a SCRUM Board with the given name and initializes its TaskLists.
	 * @param projectName The name of the SCRUM Board.
	 */
	public SCRUMBoard(String projectName)
	{
		this.projectName = projectName;
		todo = new TaskList("Todo");
		doing = new TaskList("Doing");
		done = new TaskList("Done");
	}

	/**
	 * Adds a new Ticket with the given parameters to the SCRUM Board's ToDo TaskList.
	 * @param name The name of the Ticket's task.
	 * @param teamMember The name of the team member.
	 * @param difficulty The difficulty of the task.
	 */
	public void addTicket(String name, String teamMember, int difficulty)
	{
		todo.addTicket(name, teamMember, difficulty);
	}

	/**
	 * Moves a ticket from the ToDo TaskList to the Doing TaskList.
	 * @param name The name of the Ticket.
	 * @return A boolean representing whether or not it was moved.
	 */
	public boolean startTicket(String name)
	{
		Ticket temp = todo.getTicket(name);
		if(temp !=null)
			{
				doing.addTicket(temp);
				return true;
			}
		return false;
	}

	/**
	 * Moves a ticket from the Doing TaskList to the Done TaskList.
	 * @param name The name of the Ticket.
	 * @return A boolean representing whether or not it was moved.
	 */
	public boolean finishTicket(String name)
	{
		Ticket temp = doing.getTicket(name);
		if(temp !=null)
			{
				done.addTicket(temp);
				return true;
			}
		return false;
	}

	/**
	 * Creates a formatted string representation of the SCRUM Board.
	 * @return A string representation of the SCRUM Board.
	 */
	public String toString()
	{
		String s = "***** " + projectName + " *****\n";
		s += "ToDo:\n" + todo.toString() + "\n";
		s += "Doing:\n" + doing.toString() + "\n";
		s += "Done:\n" + done.toString();
		return s;
	}
}

