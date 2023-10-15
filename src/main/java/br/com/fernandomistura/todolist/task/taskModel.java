package br.com.fernandomistura.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "curso_tarefa")
public class taskModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(name = "usuario")
    private String user;

    @Column(name = "titulo")
    private String title;

    @Column(name = "descricao")
    private String description;

    @Column(name = "dt_inicio")
    private LocalDateTime startAt;

    @Column(name = "dt_fim")
    private LocalDateTime endAt;

    @Column(name = "prioridade")
    private String priority;

    @Column(name = "dt_criacao")
    @CreationTimestamp
    private LocalDateTime createdAt;

    public void setTitle(String title) throws Exception {
        if(title.length() > 50) {
            throw new Exception("Título maior que o permitido");
        }
        this.title = title;
    }

}
