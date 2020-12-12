public class ProvisionManager {
  
  public Object getInstance() {
	  System.out.println("Verify");
    return new ProvisionManager();
  }
  
}
