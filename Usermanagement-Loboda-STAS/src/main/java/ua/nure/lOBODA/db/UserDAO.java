package main.java.ua.nure.loboda.db;

import main.java.ua.nure.loboda.User;

import java.util.Collection;


/**
 * Author Stas
 * created 21.10.2017.
 */
public interface UserDAO {
    Long create(User user) throws DatabaseException;

    void update(User user) throws DatabaseException;

    void delete(User user) throws DatabaseException;

    User findById(Long id) throws DatabaseException;

    Collection<User> findAll() throws DatabaseException;

    void setConnectionFactory(ConnectionFactory connectionFactory);

    Collection<User> find(String firstName, String lastName) throws DatabaseException;
}
