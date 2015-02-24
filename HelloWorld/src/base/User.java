package base;

import java.util.Date;

public class User
{
	private String userName;
	private String email;
	private Date registerDate;
	private Date lastLogin;
	private int numOfPost;
	private int numOfFollowers;

	public User( String userName, String email, Date registerDate )
	{
		this.userName = userName;
		this.email = email;
		this.registerDate = registerDate;
		numOfPost = 0;
		numOfFollowers = 0;
	}

	public void setUserName( String userName )
	{
		this.userName = userName;
	}

	public void setEmail( String email )
	{
		this.email = email;
	}

	public void setRegisterDate( Date registerDate )
	{
		this.registerDate = registerDate;
	}

	public void setLastLogin( Date lastLogin )
	{
		this.lastLogin = lastLogin;
	}

	public void setNumOfPost( int numOfPost )
	{
		if( numOfPost < 0 )
			return;
		this.numOfPost = numOfPost;
	}

	public void setNumOfFollowers( int numOfFollowers )
	{
		if( numOfFollowers < 0 )
			return;
		this.numOfFollowers = numOfFollowers;
	}

	public String getUserName()
	{
		return userName;
	}

	public String getEmail()
	{
		return email;
	}

	public Date getRegisterDate()
	{
		return registerDate;
	}

	public Date getLastLogin()
	{
		return lastLogin;
	}

	public int getNumOfPost()
	{
		return numOfPost;
	}

	public int getNumOfFollowers()
	{
		return numOfFollowers;
	}

	/**
	 * Change the object to a string
	 * 
	 * @return String:output
	 */
	@Override
	public String toString()
	{
		String output = "";
		output += "Name: " + userName + "\n";
		output += "Email: " + email + "\n";
		output += "Registered: " + registerDate + "\n";
		output += "Last login: " + lastLogin + "\n";
		output += "No. of Post(s)" + numOfPost + "\n";
		output += "No. of Follower(s)" + numOfFollowers + "\n";
		return output;
	}

	@Override
	public boolean equals( Object o )
	{
		if ( o instanceof Post )
		{
			User u = (User)o;
			if ( this.toString().equals( u.toString() ) )
				return true;
		}
	    return false;
	}

	@Override
	public int hashCode()
	{
		int output = 0;
		if( userName != null )
			output += userName.hashCode();
		if( email != null )
			output += email.hashCode();
		if( registerDate != null )
			output += registerDate.hashCode();
		if( lastLogin != null )
			output += lastLogin.hashCode();
		if( numOfPost != 0 )
			output += numOfPost;
		if( numOfFollowers != 0 )
			output += numOfFollowers;
		return output;
	}
}
