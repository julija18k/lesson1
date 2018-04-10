package com.company.handlers;

import com.company.collections.UsersCollection;
import com.company.models.Login;
import com.company.models.User;
import com.company.utils.JWT;
import com.sun.net.httpserver.HttpExchange;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.sql.SQLException;

public class SignInHandler extends Handler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        super.handle(httpExchange);

        // get data from POST request
        String request = getRequest();

        // parse data from JSON to Login model
        Login login;
        try {
            login = Login.parse(request);
        } catch (ParseException e) {
            sendResponse("Invalid input data", 400);
            return;
        }

        try {
            User u= UsersCollection.getUser(login.login, login.password);
            if (u==null){
               sendResponse("incorrect login or password",403 );
            }
            String token=JWT.createJWT(String.valueOf(u.id), "store.com", "store/user", 3600000);
            sendResponse(token,200);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        /*//////////////
        if (login.login.equalsIgnoreCase("1@") && login.password.equalsIgnoreCase("1234"))
            sendResponse(JWT.createJWT("1", "store.com", "store/user", 3600000), 200);
        else
            sendResponse("Incorrect login or password", 403);
        //////////////*/
    }
}