package iterator;

import java.util.Iterator;

/**
 * The TaskListIterator for the TaskList.
 * @author Soraya Remaili
 */
public class TaskListIterator 
{
	private Ticket[] tickets;	
	private int position;

	/**
	 * Creates a new TaskListIterator for the given array.
	 * @param tickets The array to be iterated over.
	 */
	public TaskListIterator(Ticket[] tickets)
	{
		this.tickets = tickets;
		position = 0;
	}

	/**
	 * Checks if the array has any more items to iterate over.
	 * @return The status of the iterator.
	 */
	public boolean hasNext()
	{
		return (position < tickets.length && tickets[position] != null);
	}

	/**
	 * Advances the pointer and returns the Ticket that was passed over.
	 * @return The Ticket that was just passed over.
	 */
	public Ticket next()
	{
		return tickets[position++];
	}
}

