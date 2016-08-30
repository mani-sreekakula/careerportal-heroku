/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DAOImpl;

import com.career.DAO.LoginDetailDAO;
import com.career.Model.UserLog;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author alokkumar
 */
public class LoginDetailDAOImpl extends HibernateDaoSupport implements LoginDetailDAO {

    @Override
    public UserLog retriveFromulogin(String username, String userpassword) {

        List<UserLog> users = new ArrayList<UserLog>();
        users = (List<UserLog>) getHibernateTemplate().find("from UserLog user where user.username='" + username + "' and user.userpassword='" + userpassword + "'");
        if (users != null && users.size() != 0) {
            return users.get(0);
        } else {
            return null;
        }

    }

    @Override
    public UserLog retriveChangePassword(String userId) {
        List<UserLog> users = new ArrayList<UserLog>();

        users = (List<UserLog>) getHibernateTemplate().find("from UserLog u where u.id1='" + userId+"'");
        return users.get(0);

    }

    @Override
    public void updatechangePassword(UserLog userLog) {

        getHibernateTemplate().saveOrUpdate(userLog);
    }

    @Override
    public String getMail(String userId) {
        List<UserLog> users = new ArrayList<UserLog>();
        UserLog user = new UserLog();
        users = (List<UserLog>) getHibernateTemplate().find("from UserLog u where u.id1='" + userId+"'");
        user = users.get(0);
        return user.getUsername();
    }

    @Override
    public boolean insertNewUser(UserLog userLog) {
        if (getHibernateTemplate().contains(userLog)) {
            return false;
        } else {
            getHibernateTemplate().save(userLog);
            return true;
        }
    }
    
    @Override
    public List<UserLog> fetchalluserdetails() {
        List<UserLog> users = new ArrayList<UserLog>();

        users = (List<UserLog>) getHibernateTemplate().find("from UserLog u where u.verify='yes'");
        return users; 
    }

}
