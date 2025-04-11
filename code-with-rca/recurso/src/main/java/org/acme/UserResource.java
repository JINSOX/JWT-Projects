package org.acme;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("")
public class UserResource {

    @GET
    @Path("/users")
    @RolesAllowed("admin")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getUsers() {
        return Response.status(200).entity("Aqui se exponen los Usuarios").build();
    }
}
