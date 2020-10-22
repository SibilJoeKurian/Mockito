package business;

import data.TodoService;

import java.util.List;
import java.util.stream.Collectors;

public class TodoBusiness {
    public TodoService todoService;

    public TodoBusiness(TodoService todoService) {
        this.todoService = todoService;
    }
    public List<String> retrieveTodoList(String user){

        return todoService.retrieveTodos(user).stream()
                .filter(str->str.equals("spring"))
                .collect(Collectors.toList());
    }
}
