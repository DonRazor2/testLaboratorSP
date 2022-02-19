package entity;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
public class Manager extends Employee {

    @Schema(name = "subAlters", description = "Employees that are managed by this guy")
    private final List<Employee> subAlters = new ArrayList<>();

    public Manager(final String id, final int salary) {
        super(id, salary);
    }

    public void addEmployeeToManage(final Employee employee) {
        subAlters.add(employee);
    }
}
