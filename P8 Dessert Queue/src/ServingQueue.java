
public class ServingQueue {

  private Guest[] array;
  private int size;
  private int start;
  private int end;
  

  /**
   * Creates a new array based queue with a capacity of "seatsAtTable" guests. This queue should be
   * initialized to be empty.
   * 
   * @param seatsAtTable the size of the array holding this queue data
   */
  public ServingQueue(int seatsAtTable) {
    
    this.array = new Guest[seatsAtTable];
    this.start = -1;
    this.end = -1;
    
  }

  /**
   * Checks whether there are any guests in this serving queue.
   * 
   * @return true when this queue contains zero guests, and false otherwise.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Adds a single new guest to this queue (to be served after the others that were previously added
   * to the queue).
   * 
   * @param newGuest is the guest that is being added to this queue.
   * @throws IllegalStateException when called on a ServingQueue with an array that is full
   */
  public void add(Guest newGuest) {
    if (this.size == this.array.length) {
      throw new IllegalStateException("Error!! Already filled the table");
    } 
    end = (end +1)%this.array.length;
    array[end] = newGuest;
    size++;
    if (start == -1) {
      start++;
    }
  }

  /**
   * Accessor for the guest that has been in this queue for the longest. This method does not add or
   * remove any guests.
   * 
   * @return a reference to the guest that has been in this queue the longest.
   * @throws IllegalStateException when called on an empty ServingQueue
   */
  public Guest peek() {
    boolean empty = isEmpty();
    if (empty) {
      throw new IllegalStateException("Your queue is empty bro");
    } else {
      return array[0];
    }
  }

  /**
   * Removes the guest that has been in this queue for the longest.
   * 
   * @return a reference to the specific guest that is being removed.
   * @throws IllegalStateException when called on an empty ServingQueue
   */
  public Guest remove() {
    boolean empty = isEmpty();
    if (empty) {
      throw new IllegalStateException("Your queue is empty bro");
    } 
    
      Guest guest = array[start];
      array[start] = null;
      start = (start + 1)%array.length;
      
      size--;
      
      return guest;
    
  }

  /**
   * The string representation of the guests in this queue should display each of the guests in this
   * queue (using their toString() implementation), and should display them in a comma separated
   * list that is surrounded by a set of square brackets. (this is similar to the formatting of
   * java.util.ArrayList.toString()). The order that these guests are presented in should be (from
   * left to right) the guest that has been in this queue the longest, to the guest that has been in
   * this queue the shortest. When called on an empty ServingQueue, returns "[]".
   * 
   * @return string representation of the ordered guests in this queue
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    String list = array.toString();
    return list;
  }


}
