
public class DessertSolvers {

  public static Guest firstDessertVariableSkips(int numberOfGuests, int guestsSkipped) {
    
    if(numberOfGuests < 0 || guestsSkipped < 0) {
      throw new IllegalArgumentException();
    }
    
    ServingQueue sque = new ServingQueue(numberOfGuests);
    
    Guest[] guests = new Guest[numberOfGuests];
    for(int i = 0; i < guests.length; i++) {
      guests[i] = new Guest();
    }
    int index = 0;
    
    Guest[] orderedGuests = new Guest[numberOfGuests];
    

    for (int i = 0; i < guests.length; i++) {
      if( i == 0) {
        orderedGuests[i] = guests[0];
      }
      else {
      index =  index%guests.length + guestsSkipped + 1;
      if(index > 8) {
        index = index%8;
      }
      orderedGuests[i] = guests[index];
      }
    }
    
    System.out.println(guests.toString());
    
    return null;
    
    
  }
  
public static Guest firstDessertVariableCourses(int numberOfGuests, int coursesServed) {
  

  if(numberOfGuests < 0 || coursesServed < 0) {
    throw new IllegalArgumentException();
  }
  
  return null;
}
}
