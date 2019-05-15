
public class QueueTests {
 
  /*
   * Test method for reserNextGuestIndex method
   */
  public static boolean testResetNextGuestIndex() {
    boolean testPassed = true;
    Guest guest = new Guest();
    Guest guest2 = new Guest();
    Guest.resetNextGuestIndex();
    if(Guest.arrivalIndex != 0) {
      testPassed = false;
    }
    return testPassed;
  }
 
  /*
   * Test method for add() method of ServingQueue Class
   */
  public static boolean testAddServingQueue() {
    boolean testPassed = true;
    ServingQueue serQue = new ServingQueue(4);
    
    Guest guest1 = new Guest();
    Guest guest2 = new Guest();
    Guest guest3 = new Guest();
    
    serQue.add(guest1);
    serQue.add(guest2);
    serQue.add(guest3);
   
    if(serQue.isEmpty()) {
      return false;
    }
    return testPassed;
  }
  
  /*
   * Test method for remove() method of ServingQueue Class
   */
  public static boolean testRemoveServingQueue() {
    boolean testPassed = true;
    ServingQueue serQue = new ServingQueue(4);
    
    Guest guest1 = new Guest();
    
    serQue.add(guest1);
    serQue.remove();
   
    if(!serQue.isEmpty()) {
      return false;
    }
    return testPassed;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println(testResetNextGuestIndex());
    System.out.println(testAddServingQueue());
    System.out.println(testRemoveServingQueue());
    
  }

}
