package com.mvc.spring.wordsapiwebapp.connections;

//can also be done using the @Singleton annotation
//in that case only the private constructor is necessary
public class MainConnection {
    private static MainConnection connection;
    private ApiConnection apiConnectionParameter;

    private MainConnection() {
    }

    public ApiConnection getApiConnectionParameter() {
        return apiConnectionParameter;
    }

    public void setApiConnectionParameter(ApiConnection apiConnectionParameter) {
        this.apiConnectionParameter = apiConnectionParameter;
    }

    public static synchronized MainConnection getInstance() {
        if (connection == null) {
            connection = new MainConnection();
        }
        return connection;
    }
}
