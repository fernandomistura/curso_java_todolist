package br.com.fernandomistura.todolist.user;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfaceUserRepository extends JpaRepository<userModel, UUID>{
    userModel findByName(String name);
    userModel findByUsername(String username);
}
