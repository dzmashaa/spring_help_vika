package example.spring_labs.web.api;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;
import example.spring_labs.data.Task;
import example.spring_labs.repositories.TaskRepository;

import java.util.Date;

@RepositoryRestController
@RestController
public class TasksRestController {
//    @Autowired
    private final TaskRepository taskRepository;

//    public void setTaskRepository(TaskRepository taskRepository) {
//        this.taskRepository = taskRepository;
//    }

    public TasksRestController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @PutMapping("/tasks/{taskId}")
    public Task updateTask(@PathVariable("taskId") Long taskId, @RequestBody Task task) {
        task.setId(taskId);
        task.setCreationTime(new Date());
        return taskRepository.save(task);
    }
}
