package iterator;

/**
 * The TaskList of a SCRUM Board.
 * @author Soraya Remaili
 */
public class TaskList 
{
	private Ticket[] tickets;
	private int count;
	private String name;

	/**
	 * Creates a TaskList with the given name and initializes its other fields to default values.
	 * @param name The name of the TaskList.
	 */
	public TaskList(String name)
	{
		tickets = new Ticket[100];
		count = 0;
		this.name = name;
	}

	/**
	 * Adds a new Ticket with the given parameters to the TaskList.
	 * @param name The name of the Ticket's task.
	 * @param teamMember The name of the team member.
	 * @param difficulty The difficulty of the task.
	 */
	public void addTicket(String name, String teamMember, int difficulty)
	{	
		if(count<100)
		{
			tickets[count++] = new Ticket(name, teamMember, difficulty);
		}
		else
			System.out.println("Too many tasks in the TaskList!");
	}

	/**
	 * Adds an existing Ticket to the TaskList.
	 * @param ticket The Ticket to be added.
	 */
	public void addTicket(Ticket ticket)
	{
		if(count<100)
		{
			tickets[count++] = ticket;
		}
		else
			System.out.println("Too many tasks in the TaskList!");
	}

	/**
	 * Finds the Ticket with the given name and removes it, shifting the array to fill the gap, or returns null.
	 * @return The Ticket that was removed, or null if not found.
	 */
	public Ticket getTicket(String name)
	{
		for(int i = 0; i<=count; i++)
		{
			if(tickets[i].getName().toUpperCase().equals(name.toUpperCase()))
				{
					Ticket temp = tickets[i];
					for(int j = i; j<count; j++)
					{
						tickets[j] = tickets[j+1];
					}
					count--;
					return temp;
				}
		}
		return null;		
	}

	/**
	 * Creates a new TaskListIterator.
	 * @return The TaskListIterator that was created.
	 */
	public TaskListIterator createIterator()
	{
		return new TaskListIterator(tickets);
	}

	/**
	 * Creates a formatted string representation of the TaskList using the TaskListIterator.
	 * @return A string representation of the TaskList.
	 */
	public String toString()
	{
		TaskListIterator tli = createIterator();
		String s = "";
		while(tli.hasNext())
		{
			s += "- " + tli.next() + "\n";
		}
		return s;
	}
}

