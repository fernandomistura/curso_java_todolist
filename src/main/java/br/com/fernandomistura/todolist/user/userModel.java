package br.com.fernandomistura.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "curso_usuario")
public class userModel {

    @Id
    @GeneratedValue( generator = "UUID")
    private UUID ID;

    @Column(name = "usuario")
    private String username;

    @Column(name = "nome")
    private String name;

    @Column(name = "senha")
    private String password;

    @Column(name = "dt_atualizacao")
    @CreationTimestamp
    private LocalDateTime createdAT;
    
}
