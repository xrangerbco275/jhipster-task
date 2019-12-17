package com.jcruz.service.mapper;

import com.jcruz.domain.*;
import com.jcruz.service.dto.TaskDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Task} and its DTO {@link TaskDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {

    default Task fromId(Long id) {
        if (id == null) {
            return null;
        }
        Task task = new Task();
        task.setId(id);
        return task;
    }
}
