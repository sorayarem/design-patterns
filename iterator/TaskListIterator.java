package iterator;

import java.util.Iterator;

public class TaskListIterator 
{
	private Ticket[] tickets;	
	private int position;

	public TaskListIterator(Ticket[] tickets)
	{
		this.tickets = tickets;
		position = 0;
	}

	public boolean hasNext()
	{
		return (position < tickets.length);
	}

	public Ticket next()
	{
		position++;
		return tickets[position];
	}
}

