
public class Guest {
  
  static int arrivalIndex;
  private String dietRestriction;
  /**
   * Resets the counting of newly constructed guest indexes, so that the next new Guest that is created
   * will be associated with the guest index of one.
   * 
   * Note: that this will be helpful when running several tests, or solving solving several 
   * dessert simulation problems.  And that this should never be called from ServingQueue.java
   */
  public static void resetNextGuestIndex() {
    arrivalIndex = 0;
  }
 
  /**
   * Constructs a new guest with no dietary restrictions.  This guest should be associated with an
   * index that is one larger than the previously constructed guest (or 1, if no prior guest, or if 
   * resetNextGuestIndex() was called more recently).
   */
  public Guest() {
    Guest.arrivalIndex = Guest.arrivalIndex + 1;
    this.dietRestriction = "";
  }
  
  /**
   * Constructs a new guest with the specified dietary restrictions.  This guest should be 
   * associated with an index that is one larger than the previously constructed guest (or 1, if 
   * no prior guest, or if resetNextGuestIndex() was called more recently).
   * @param dietaryRestriction describes requirements for what this guest can and cannot eat
   */
  public Guest(String dietaryRestriction) {
    Guest.arrivalIndex = Guest.arrivalIndex + 1;
    this.dietRestriction = dietaryRestriction;
  }
  
  /**
   * Access whether this guest has any dietary restrictions or not
   * @return true for guests constructed using new Guest(String), false otherwise
   */
  public boolean hasDietaryRestriction() {
    if (this.dietRestriction.length() > 0) {
      return true;
    }
    return false;
  }
  
  /**
   * The string representation of a Guest should be formatted as, for examples:
   * #3(no dairy)
   * for a guest with a guest index of 3 and the dietary restriction of "no dairy", or: 
   * #4
   * for a guest with a guest index of 4 and no dietary restriction
   * @return string representing the guest index and any dietary restriction they might have
   * @see java.lang.Object#toString()
   */
  public String toString() {
    String index = Integer.toString(Guest.arrivalIndex);
    String finalOutput = "#";
    if (hasDietaryRestriction()) {
      finalOutput = finalOutput + index + "("+this.dietRestriction+")";
    }
    else {
      finalOutput = finalOutput + index;
    }
   
    return finalOutput;
  }
}