package com.app;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class UserServlet extends HttpServlet {

    static final Logger LOGGER  = Logger.getLogger(UserServlet.class);

    @Autowired
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LOGGER.info("This is a logging statement from log4j");

//        String html = "<html><h2>Log4j has been initialized successfully!</h2></html>";
//        resp.getWriter().println(html);
        super.doGet(req, resp);
    }
}
