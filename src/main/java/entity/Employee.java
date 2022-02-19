package entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public abstract class Employee {

    @Schema(name = "id", description = "ID of the employee")
    private String id;

    @Schema(name = "salary", description = "The earnings of the employee")
    private int salary;

}
