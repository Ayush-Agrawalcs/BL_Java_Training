package Builder;
import java.util.*;

class Http1 {
    protected String url;
    protected String method = "GET";
    protected Map<String, String> query = new HashMap<>();
    protected Map<String, String> header = new HashMap<>();
    protected String body;
    protected int timeout = 3000;

    public void execute() {
        System.out.println("Executing " + method + " request to " + url);

        if (!query.isEmpty()) {
            System.out.println("Query Parameters:");
            for (String p : query.keySet()) {
                System.out.println(" " + p + " = " + query.get(p));
            }
        }

        if (!header.isEmpty()) {
            System.out.println("Headers:");
            for (String h : header.keySet()) {
                System.out.println(" " + h + " = " + header.get(h));
            }
        }

        if (body != null && !body.isEmpty()) {
            System.out.println("Body: " + body);
        }

        System.out.println("Timeout: " + timeout);
        System.out.println("Request executed successfully!");
    }
}


class HttpBuilder1 {
    private Http1 req;

    public HttpBuilder1() {
        req = new Http1();
    }

    public HttpBuilder1 withUrl(String url) {
        req.url = url;
        return this;
    }

    public HttpBuilder1 withMethod(String method) {
        req.method = method;
        return this;
    }

    public HttpBuilder1 withHeader(String key, String value) {
        req.header.put(key, value);
        return this;
    }

    public HttpBuilder1 withQuery(String key, String value) {
        req.query.put(key, value);
        return this;
    }

    public HttpBuilder1 withBody(String body) {
        req.body = body;
        return this;
    }

    public HttpBuilder1 withTimeout(int timeout) {
        req.timeout = timeout;
        return this;
    }

    public Http1 build() {
        if (req.url == null || req.url.isEmpty()) {
            throw new RuntimeException("URL cannot be empty");
        }
        return req;
    }
}

class Director{
public static Http1 createGetRequest(String url){
    return new HttpBuilder1().withUrl(url).withMethod("Get").build();
}

public static Http1 createJsonpostRequest(String url,String jsonBody){
    return new HttpBuilder1().withUrl(url).withMethod("Post").withHeader("Content-type","application/json").withHeader("Accept","application/json").withBody(jsonBody).build();
}
}


public class BuilderWithDirector {
    public static void main(String[] args) {
        Http1 getRequest=Director.createGetRequest("https://api.example.com/users");
        getRequest.execute();
        System.out.println("\n------------------------------------\n");
        Http1 post=Director.createJsonpostRequest("https://api.example.com/users","{\"name\":\"Aditya\" ,\"email\":\"aditya@example.com\"}");
        post.execute();
    }
    
}
