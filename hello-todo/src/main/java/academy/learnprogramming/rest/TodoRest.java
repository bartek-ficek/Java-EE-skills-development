package academy.learnprogramming.rest;

import academy.learnprogramming.entity.Todo;
import academy.learnprogramming.service.TodoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("todo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TodoRest {

    @Inject
    TodoService todoService;

    @Path("new")
    @POST
    public Response createTodo(Todo todo) {
        //api/vi/_todo/new
        todoService.createTodo(todo);
        return Response.ok(todo).build();
    }

    @Path("update")
    @PUT
    public Response updateTodo(Todo todo) {
        todoService.updateTodo(todo);
        return Response.ok(todo).build();
    }

    @Path("{id}")
    @GET
    public Todo getTodo(@PathParam("id") Long id) {
        return todoService.findTodoBYId(id);
    }

    @Path("list")
    @GET
    public List<Todo> getTodos() {
        return todoService.getTodos();
    }
}







