package Builder;
import java.util.*;

class Http {
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

class HttpBuilder {
    private Http req;

    public HttpBuilder() {
        req = new Http();
    }

    public HttpBuilder withUrl(String url) {
        req.url = url;
        return this;
    }

    public HttpBuilder withMethod(String method) {
        req.method = method;
        return this;
    }

    public HttpBuilder withHeader(String key, String value) {
        req.header.put(key, value);
        return this;
    }

    public HttpBuilder withQuery(String key, String value) {
        req.query.put(key, value);
        return this;
    }

    public HttpBuilder withBody(String body) {
        req.body = body;
        return this;
    }

    public HttpBuilder withTimeout(int timeout) {
        req.timeout = timeout;
        return this;
    }

    public Http build() {
        if (req.url == null || req.url.isEmpty()) {
            throw new RuntimeException("URL cannot be empty");
        }
        return req;
    }
}

public class RemoveProblems {
    public static void main(String[] args) {
        Http http = new HttpBuilder()
                .withUrl("https://api.example.com")
                .withMethod("POST")
                .withHeader("Content-Type", "application/json")
                .withQuery("page", "1")
                .withBody("Request Body")
                .withTimeout(5000)
                .build();

        http.execute();
    }
}