package com.home.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.home.entity.Team;

public class TeamUtil {
	public static SessionFactory getSessionFactory(){
		Configuration con=new Configuration();
		con.addAnnotatedClass(Team.class);
		return con.buildSessionFactory();
	}
}
