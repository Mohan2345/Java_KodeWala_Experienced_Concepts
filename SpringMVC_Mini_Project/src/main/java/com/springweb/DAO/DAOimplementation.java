package com.springweb.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.springweb.model.Users;

@Repository
public class DAOimplementation implements DAOLayer {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveUser(Users user) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) 
            {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) 
            {
                session.close();
            }
        }
    }

	@Override
	public Users fetchRef(String mobile) 
	{
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		Users retrivedUsers = null;
		try {
			session = sessionFactory.openSession();
			tx =  session.beginTransaction();
			String hql = "from Users where mobile = :mobile";
			retrivedUsers = session.createQuery(hql, Users.class).setParameter("mobile", mobile).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (tx != null) tx.rollback();
	        e.printStackTrace();
		} finally {
			if(session != null) 
			{
				session.close();
			}
		}
		return retrivedUsers;
	}

	@Override
	public Users fetchStatus(int id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		Users fetchedUser = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			String hql = "from Users where ref_no = :id";
			fetchedUser = session.createQuery(hql, Users.class).setParameter("id", id).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx != null)
			{
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			if(session != null)
			{
				session.close();
			}
		}
		return fetchedUser;
	}
}