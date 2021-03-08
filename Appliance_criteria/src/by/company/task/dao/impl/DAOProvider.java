package by.company.task.dao.impl;

import by.company.task.dao.FindApplianceDAO;
import by.company.task.dao.UserDAO;

public class DAOProvider {
    private static final DAOProvider instance = new DAOProvider();

    private final UserDAO userDAO = new UserProfile();
    private final FindApplianceDAO findApplianceDAO = new FileFindApplianceDAO();

    private DAOProvider() {}

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public FindApplianceDAO getFindApplianceDAO() {
        return findApplianceDAO;
    }

    public static DAOProvider getInstance() {
        return instance;
    }
}
