package faheem.microservices.computer.ms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Computer {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String generation;

}
