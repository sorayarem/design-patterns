package iterator;

public class SCRUMBoard 
{
	private String projectName;
	private TaskList todo;
	private TaskList doing;
	private TaskList done;

	public SCRUMBoard(String projectName)
	{
		this.projectName = projectName;
		todo = new TaskList("Todo");
		doing = new TaskList("Doing");
		done = new TaskList("Done");
	}

	public void addTicket(String name, String teamMember, int difficulty)
	{
		todo.addTicket(name, teamMember, difficulty);
	}

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

	public String toString()
	{
		String s = "***** " + projectName + " *****\n";
		s += "ToDo:\n" + todo.toString();
		s += "Doing:\n" + doing.toString();
		s += "Done:\n" + done.toString();
		return s;
	}
}

