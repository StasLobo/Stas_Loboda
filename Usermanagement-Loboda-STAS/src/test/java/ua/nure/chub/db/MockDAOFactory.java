package test.java.ua.nure.loboda.db;

import com.mockobjects.dynamic.Mock;
import main.java.ua.nure.loboda.db.DAOFactory;
import main.java.ua.nure.loboda.db.UserDAO;

/**
 * Author Stas
 * created 06.11.2017.
 */
public class MockDAOFactory extends DAOFactory {
    private Mock mockUserDAO;

    public MockDAOFactory() {
        mockUserDAO = new Mock(UserDAO.class);
    }

    public Mock getMockUserDAO() {
        return mockUserDAO;
    }

    @Override
    public UserDAO getUserDAO() {
        return (UserDAO) mockUserDAO.proxy();
    }
}
