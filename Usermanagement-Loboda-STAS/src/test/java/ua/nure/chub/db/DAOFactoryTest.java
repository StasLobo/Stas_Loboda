package test.java.ua.nure.loboda.db;

import junit.framework.TestCase;
import main.java.ua.nure.loboda.db.DAOFactory;
import main.java.ua.nure.loboda.db.UserDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author Stas
 * created 23.10.2017.
 */

public class DAOFactoryTest extends TestCase {

    private DAOFactory daoFactory;

    @Before
    public void setUp() throws Exception {
        daoFactory = DAOFactory.getInstance();
    }

    @Test
    public void testGetDAOFactory() {
        Assert.assertNotNull("DAOFactory instance is null", daoFactory);
    }

    @Test
    public void testGetUserDAO() {
        UserDAO userDAO = daoFactory.getUserDAO();
        Assert.assertNotNull("UserDAO instance is null", userDAO);
    }
}
