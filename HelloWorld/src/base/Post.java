package base;

//import java.text.SimpleDateFormat;
import java.util.Date;

public class Post
{
	private String userName;
	private Date postDate;
	private Date modifiedDate;
	private String title;
	private String content;
	private String externalLink;

	public Post( String userName, Date postDate, String title )
	{
		this.userName = userName;
		this.postDate = postDate;
		this.title = title;
	}

	public void setModifiedDate( Date modifiedDate )
	{
		this.modifiedDate = modifiedDate;
	}

	public void setTitle( String title )
	{
		this.title = title;
	}

	public void setContent( String content )
	{
		this.content = content;
	}

	public void setExternalLink( String externalLink )
	{
		this.externalLink = externalLink;
	}

	public Date getPostDate()
	{
		return postDate;
	}

	public String getTitle()
	{
		return title;
	}

	public String getContent()
	{
		return content;
	}

	public String getExternalLink()
	{	
		return externalLink;
	}

	/**
	 * Check if the whole post contains the keyword
	 * 
	 * @return boolean:isContain
	 */
	public boolean contains( String keyword )
	{
		return titleContains( keyword ) || contentContains( keyword );
	}

	public boolean titleContains( String keyword )
	{
		return title.toLowerCase().trim().contains( keyword.toLowerCase().trim() );
	}

	public boolean contentContains( String keyword )
	{
		return content.toLowerCase().trim().contains( keyword.toLowerCase().trim() );
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
		Date tempDate;
		output += title;
		//if( modifiedDate != null && modifiedDate.after( postDate ) )
		if( modifiedDate != null )
			tempDate = modifiedDate;
		else
			tempDate = postDate;
		if( userName == null )
			output += " by Anonymous on " + tempDate + ":\n";
		else
			output += " by " + userName + " on " + tempDate + ":\n";
		output += "Message: " + content + "\n";
		output += "Link: " + externalLink + "\n";
		return output;
	}

	@Override
	public boolean equals( Object o )
	{
		if ( o instanceof Post )
		{
			Post p = (Post)o;
			//SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
			if ( this.toString().equals( p.toString() ) )
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
		if( title != null )
			output += title.hashCode();
		if( postDate != null )
			output += postDate.hashCode();
		if( modifiedDate != null )
			output += modifiedDate.hashCode();
		if( content != null )
			output += content.hashCode();
		if( externalLink != null )
			output += externalLink.hashCode();
		return output;
	}
}
