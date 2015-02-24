package main;

import java.util.Date;
import base.*;

public class Blog
{
	public static void main(String[] args)
	{
		User u1 = new User( "Alton", "khleeah@stu.ust.hk", new Date() );
		//Post p = new Post( "Alton", new Date(), "25 Feb 2015-Lab 2" );
		FriendsPost fp = new FriendsPost( "Bobby", new Date(), "25 Feb 2015-Lab 2" );
		fp.setContent( "This is my first post." );
		fp.setExternalLink( "www.cse.ust.hk" );
		System.out.println( fp );
		System.out.println( fp.contains( "first" ) );
		System.out.println( fp.contains( "HKUST" ) );
	}

}
