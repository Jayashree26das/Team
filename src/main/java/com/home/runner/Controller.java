package com.home.runner;

import java.util.Date;

import org.hibernate.Session;

import com.home.entity.Team;
import com.home.util.TeamUtil;

public class Controller {

	public static void main(String[] args) {
		Session ss=TeamUtil.getSessionFactory().openSession();
		Team t=new Team();
		t.setIsDelete("No");
		t.setCreatedBy("mamun");
		t.setCreatedDate(new Date());
		t.setUpdatedDate(new Date());
		ss.beginTransaction();
		ss.save(t);
		ss.getTransaction().commit();
		System.out.println(t);
		ss.close();
	}

}
