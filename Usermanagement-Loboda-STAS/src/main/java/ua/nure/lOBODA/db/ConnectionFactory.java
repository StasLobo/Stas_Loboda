package main.java.ua.nure.loboda.db;

import java.sql.Connection;

/**
 * Author Stas
 * created 22.10.2017.
 */
public interface ConnectionFactory {
    Connection createConnection() throws DatabaseException;
}
