package me.lundy.jalorant;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;

public class Request {

    private final String url;

    public Request(String url) {
        this.url = url;
    }

    public <T> Response<T> getAs(Class<T> type) throws IOException {
        URL u = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) u.openConnection();
        InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
        Type collectionType = TypeToken.getParameterized(Response.class, type).getType();
        Response<T> response = new Gson().fromJson(inputStreamReader, collectionType);
        inputStreamReader.close();
        connection.disconnect();
        return response;
    }

}
