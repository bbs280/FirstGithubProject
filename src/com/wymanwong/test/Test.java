package com.wymanwong.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wymanwong.domain.Name;
import com.wymanwong.domain.News;
import com.wymanwong.domain.Student;

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
		// User user = new User();
		// user.setUsername("wyman");
		// user.setPassword("123456");

		// News news = new News();
		// news.setTitle("吃什么好呢？");
		// news.setContent("吃香蕉");

		// Person person = new Person();
		// person.setName(new Name("王伟文", "wyman"));
		// List<String> l = new ArrayList<String>();
		// l.add("1");
		// l.add("2");
		// person.setSchoolLists(l);
		// SortedSet<String> set = new TreeSet<String>();
		// set.add("c");
		// set.add("a");
		// set.add("b");
		// person.setSchoolSets(set);
		// person.setSchoolCollections(l);
		//
		// Map<String, Float> scores = new HashMap<String, Float>();
		// scores.put("物理", 90f);
		// person.setScores(scores);

		Student stu = new Student();
		stu.setStudentNo("AP1005608");
		stu.setAddress("珠海斗门");
		stu.setName(new Name("王伟文", "wyman"));
		stu.setMoblie("13427283922");

		s.save(stu);
		t.commit();
	}

	@SuppressWarnings("unused")
	private static void findData(Session s, Transaction t) {
		News news = (News) s.get(News.class, 1L);
		System.out.println(news.toString());
	}
}
