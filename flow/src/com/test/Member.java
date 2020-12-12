public class Member {
	
	private String name;

  public Object getInstance() {
	  System.out.println("Name="+name);
    return new Member();
  }
  
}
