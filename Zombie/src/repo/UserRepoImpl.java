package repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bean.ForgetBean;
import bean.LoginBean;

import entity.User;

@Repository
public class UserRepoImpl implements UserRepo {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User authenticate(LoginBean login) {
		System.out.println("In Repo: " + login.getUserId() + "\t" + login.getPassword());
		Session session = sessionFactory.openSession();
		User u2 = (User) session.get(User.class, login.getUserId());
		if (u2 != null && (u2.getPassword().equals(login.getPassword())))
			return u2;
		else
			return null;
	}

	@Override
	public boolean validate(ForgetBean forget) {
		Session session = sessionFactory.openSession();

		User u1 = (User) session.get(User.class,forget.getUserId());
		if ((u1 != null) && (u1.getEmail().equals(forget.getEmail())))
			return true;
		else
			return false;

	}

	@Override
	public boolean changePassword(LoginBean change) {
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		try {
			User u3 = (User) session.get(User.class, change.getUserId());
			u3.setPassword(change.getPassword());
			txn.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean persist(User user) {
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();

		try {
			session.save(user);
			txn.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
			return false;
		}
	}

}
