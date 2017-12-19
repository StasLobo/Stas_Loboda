package main.java.ua.nure.loboda.servlet;

import main.java.ua.nure.loboda.User;
import main.java.ua.nure.loboda.db.DAOFactory;
import main.java.ua.nure.loboda.db.DatabaseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author Stas
 * created 19.11.2017.
 */

public class AddServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        showPage(req, resp);
    }

    protected void processUser(User user) throws DatabaseException {
        DAOFactory.getInstance().getUserDAO().create(user);
    }

    protected void showPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/add.jsp").forward(req, resp);
    }
}
