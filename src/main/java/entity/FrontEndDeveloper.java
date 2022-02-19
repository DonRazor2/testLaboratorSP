package entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class FrontEndDeveloper extends Developer {
    // Something that's related to front-end only

    public FrontEndDeveloper(final String id, final int salary, final Manager manager) {
        super(id, salary, manager);
        manager.addEmployeeToManage(this);
    }
}
