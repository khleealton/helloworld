package main;

import java.util.Date;
import base.*;

public class FriendsPost extends Post
{
	private User friend;

	public FriendsPost(String userName, Date postDate, String title)
	{
		super(userName, postDate, title);
		
	}
}
