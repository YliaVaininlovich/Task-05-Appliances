package by.company.task.service.impl;

import by.company.task.bean.User;
import by.company.task.dao.DAOException;
import by.company.task.dao.impl.DAOProvider;
import by.company.task.dao.UserDAO;
import by.company.task.service.ClientService;
import by.company.task.service.ServiceException;

public class ClientServiceImpl implements ClientService {
    @Override
    public boolean logination(String login, String password) throws ServiceException {

         if(login == null || "".equals(login)) {
             throw new ServiceException("error login is null");
         }

        DAOProvider provider = DAOProvider.getInstance();
        UserDAO userDAO = provider.getUserDAO();

        boolean result;
        try{
            result = userDAO.logination(login, password);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return result;
    }

    @Override
    public String changeUser(User user, User newUser) throws ServiceException {

        String response = "логин и пароль успешно изменены";
        boolean result;
        try {
            result = logination(user.getLogin(), user.getPassword());
        } catch (ServiceException e){
            throw new ServiceException(e);
        }

        if (result==false){
            response = "пользователя с таким логином и паролем не существует";
            return response;
        }

        try {
            result = logination(newUser.getLogin(), newUser.getPassword());
        } catch (ServiceException e){
            throw new ServiceException(e);
        }

        if (result==true){
            response = "такой логин и пароль уже существуют";
            return response;
        }

        DAOProvider provider = DAOProvider.getInstance();
        UserDAO userDAO = provider.getUserDAO();


        try{
            userDAO.changeUser(user, newUser);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        return response;


    }
}
