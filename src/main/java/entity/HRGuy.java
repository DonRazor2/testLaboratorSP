package entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
public class HRGuy extends Employee {

    @Schema(name = "manager", description = "Managed by")
    private Manager manager;

    @Schema(name = "hrOver", description = "Will handle HR stuff over")
    private List<Developer> developers;

    public HRGuy(final String id, final int salary, final Manager manager, final List<Developer> listOfDevs) {
        super(id, salary);
        this.manager = manager;
        this.developers = new ArrayList<>(listOfDevs);
    }
}
