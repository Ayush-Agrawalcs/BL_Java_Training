package Builder;
import java.util.*;

class Http2 {
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

interface UrlStep{
    MethodStep withUrl(String URL);
}
interface MethodStep{
    HeaderStep withMethod(String method);
}
interface HeaderStep{
    OptionalStep withHeader(String key,String value);
}

interface OptionalStep {
    OptionalStep withBody(String body);
    OptionalStep withTimeout(int time);
    Http2 build();
} 
class HttpBuilder2 implements UrlStep,MethodStep,HeaderStep,OptionalStep{

    private Http2 req;

    private HttpBuilder2() {
        req = new Http2();
    }
    public MethodStep withUrl(String url){
        req.url=url;
        return this;
    } 
    public HeaderStep withMethod(String method){
        req.method=method;
        return this;
    }
    public OptionalStep withHeader(String key,String value){
        req.header.put(key, value);
        return this;
    }
    public OptionalStep withBody(String Body){
        req.body=Body;
        return this;
    }
     public OptionalStep withTimeout(int t){
        req.timeout=t;
        return this;
    }

    public Http2 build(){
        if (req.url == null || req.url.isEmpty()){
            throw new RuntimeException("Url cannot be empty");
        }
        return req;
    }
    static UrlStep getBuilder(){
        return new HttpBuilder2();
    }

}
 
public class StepBuilder {
    public static void main(String[] args) {
        Http2 step=HttpBuilder2.getBuilder()
        .withUrl("https://api.example.com/users")
        .withMethod("post")
        .withHeader("Content-type", "application/json")
        .withBody("{\"name\":\"Aditya\" ,\"email\":\"aditya@example.com\"}")
        .withTimeout(3000)
        .build();

        step.execute();
        
    }
    
}
