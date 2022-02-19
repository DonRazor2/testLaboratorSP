package entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Developer extends Employee {

    @Schema(name = "manager", description = "Managed by")
    public Manager manager;

    public Developer(final String id, final int salary, final Manager manager) {
        super(id, salary);
        this.manager = manager;
    }

}
