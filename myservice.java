import io.quarkus.runtime.Quarkus;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/hello")
@ApplicationScoped
public class myservice {
    
    @GET
    public String sayHello(){

        return "Hello Testing !!";
    }

}
