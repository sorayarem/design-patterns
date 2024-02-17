package iterator;

public class TaskList 
{
	private Ticket[] tickets;
	private int count;
	private String name;

	public TaskList(String name)
	{
		tickets = new Ticket[100];
		count = 0;
		this.name = name;
	}

	public void addTicket(String name, String teamMember, int difficulty)
	{	
		if(count<100)
		{
			tickets[count] = new Ticket(name, teamMember, difficulty);
			count++;
		}
		else
			System.out.println("Too many tasks in the TaskList!");
	}

	public void addTicket(Ticket ticket)
	{
		if(count<100)
		{
			tickets[count] = ticket;
			count++;
		}
		else
			System.out.println("Too many tasks in the TaskList!");
	}

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

	public TaskListIterator createIterator()
	{
		return new TaskListIterator(tickets);
	}

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

