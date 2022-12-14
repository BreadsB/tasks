package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskMapper {

    public Task mapToTask(final TaskDto taskDto) {
        return new Task(taskDto.getId(), taskDto.getTitle(), taskDto.getDescription());
    }

    public TaskDto mapToTaskDto(final Task task) {
        return new TaskDto(task.getId(), task.getTitle(), task.getDescription());
    }

    public List<TaskDto> mapToTaskDtoList(final List<Task> taskList) {
        return taskList.stream()
                .map(this::mapToTaskDto)
                .collect(Collectors.toList());
    }
}
