package by.grapesrain.entitys;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Daynekoa on 27.05.2017.
 */

@Entity
@Table(name = "request")
@ToString(callSuper = true, exclude = {"creator", "executor", "requestAnswers"})
@NoArgsConstructor
public class Request extends BaseEntity {

    public Request(String title, String body, User creator, Status status, Departament departament, Priority priority) {
        this.title = title;
        this.body = body;
        this.creator = creator;
        this.status = status;
        this.departament = departament;
        this.priority = priority;
    }

    @Getter
    @Setter
    @Column(name = "title")
    private String title;

    @Getter
    @Setter
    @Column(name = "body")
    private String body;

    @Getter
    @Column(name = "req_create")
    private LocalDateTime create = LocalDateTime.now();

    @Getter
    @Setter
    @Column(name = "req_close")
    private LocalDateTime close;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "creator_user_id")
    private User creator;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "executor_user_id")
    private User executor;

    @Getter
    @Setter
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "departament_id")
    private Departament departament;

    @Getter
    @Setter
    @Column(name = "priority")
    @Enumerated(EnumType.STRING)
    private Priority priority;

    @Getter
    @Setter
    @OneToMany(mappedBy = "request")
    private Set<RequestAnswer> requestAnswers = new HashSet<RequestAnswer>();
}
