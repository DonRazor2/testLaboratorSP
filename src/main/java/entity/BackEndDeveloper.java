package entity;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BackEndDeveloper extends Developer {
    // Something specific about back-end development

    public BackEndDeveloper(final String id, final int salary, final Manager manager) {
        super(id, salary, manager);
        manager.addEmployeeToManage(this);
    }
}
