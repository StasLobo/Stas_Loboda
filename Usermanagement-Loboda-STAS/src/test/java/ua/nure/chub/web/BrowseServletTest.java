package test.java.ua.nure.loboda.web;

import main.java.ua.nure.loboda.servlet.BrowseServlet;
import main.java.ua.nure.loboda.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Author Stas
 * created 18.11.2017.
 */
public class BrowseServletTest extends MockServletTestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        createServlet(BrowseServlet.class);
    }

    @Test
    public void testBrowse() {
        User user = new User(1000L, "Stas", "Loboda", new Date());
        List list = Collections.singletonList(user);
        getMockUserDAO().expectAndReturn("findAll", list);
        Collection collection = (Collection) getWebMockObjectFactory().getMockSession().getAttribute("users");
        Assert.assertNotNull("Couldn't find list of users in session", collection);
        Assert.assertSame(list, collection);
    }
}
