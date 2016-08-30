package com.career.Action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class LoginHome extends ActionSupport implements SessionAware {

    Map session;

    public Map getSession() {
        return session;
    }

    @Override
    public void setSession(Map session) {
        this.session = session;
    }

    @Override
    public String execute() {
        if (session.isEmpty()) {
            addActionError("session expired");
            return "ERROR";
        } else {
            return "SUCCESS";
        }
    }
}