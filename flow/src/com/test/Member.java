public class Member {
	
	private String name;

  public Object getInstance() {
	  System.out.println("Name="+name);
	  System.out.println("DEV-1");
    return new Member();
  }
  
}
