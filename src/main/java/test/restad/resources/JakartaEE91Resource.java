package test.restad.resources;

import clases.OperacionSQL;
import clases.respuestasJSON;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author
 */
@Path("jakartaee9")
public class JakartaEE91Resource {

    @GET
    public Response ping() {
        return Response
                .ok("ping Jakarta EE")
                .build();
    }

    /**
     * POST method to login in the application
     *
     * @param username
     * @param password
     * @return
     */
    @Path("login")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(@FormParam("username") String username, @FormParam("password") String password) {

        try {
            OperacionSQL op = new OperacionSQL();
            boolean loginVerificado = op.validarUsuario(username, password);
            String mensajeJSON = respuestasJSON.login(username, loginVerificado);
            if (loginVerificado) {
                return Response.ok(mensajeJSON).build();
            } else {
                return Response.status(Response.Status.UNAUTHORIZED).entity(mensajeJSON).build();
            }
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(respuestasJSON.errorServidor()).build();
        }
    }

    /**
     * POST method to register a new image – File is not uploaded
     *
     * @param title
     * @param description
     * @param keywords
     * @param author
     * @param creator
     * @param capt_date
     * @return
     */
    @Path("register")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registerImage(@FormParam("title") String title,
            @FormParam("description") String description,
            @FormParam("keywords") String keywords,
            @FormParam("author") String author,
            @FormParam("creator") String creator,
            @FormParam("capture") String capt_date){
        
        
        return null;
    }
    
    
    
}
