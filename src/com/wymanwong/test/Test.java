package com.wymanwong.test;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wymanwong.domain.Person;
import com.wymanwong.domain.PersonName;

public class Test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory();

		Session s = null;
		Transaction t = null;

		try {
			s = sf.openSession();
			t = s.beginTransaction();

			saveData(s, t);
			// findData(s, t);
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		} finally {
			s.close();
		}
	}

	private static void saveData(Session s, Transaction t) {
		// Name name = new Name("王伟文", "wyman");
		// Student stu = new Student();
		// stu.setStudentNo("AP1005608");
		// stu.setAddress("珠海斗门12");
		// stu.setName(name);
		// stu.setMoblie("13427283922");

		Person person = new Person();
		person.setAge(26);
		PersonName personName = new PersonName("大明", "BIG");
		Map<String, Integer> power = new HashMap<String, Integer>();
		power.put("sammi1", 10);
		power.put("sammi2", 20);
		personName.setPower(power);
		person.setPersonName(personName);

		s.save(person);
		t.commit();
	}

	@SuppressWarnings("unused")
	private static void findData(Session s, Transaction t) {

	}
}
