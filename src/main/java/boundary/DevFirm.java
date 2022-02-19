package boundary;

import com.fasterxml.jackson.core.JsonProcessingException;
import control.Controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/getEmployees")
public class DevFirm {

    @Inject
    private Controller controller;

    @GET
    @Produces("text/text")
    public String getEmployees() throws JsonProcessingException {
        return controller.getAllEmployees();
    }
}