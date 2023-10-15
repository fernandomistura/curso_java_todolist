package br.com.fernandomistura.todolist.task;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;


public interface InterfaceTaskRepository extends JpaRepository<taskModel, UUID>{
    List<taskModel> findByUser(String user);
}
