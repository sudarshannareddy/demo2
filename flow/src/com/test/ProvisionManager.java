public class ProvisionManager {
  
  public Object loadInstance() {
	  System.out.println("On Reuest");
    return new ProvisionManager();
  }
  
}
