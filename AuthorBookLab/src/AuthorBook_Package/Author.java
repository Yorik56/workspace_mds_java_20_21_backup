package AuthorBook_Package;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name,String email,char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() 
	{
		return this.name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getEmail() 
	{
		return this.name;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public char getGender() 
	{
		return this.gender;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	

}
