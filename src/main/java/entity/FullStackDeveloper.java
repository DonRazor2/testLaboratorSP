package entity;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FullStackDeveloper extends Developer {
    // Something that's related to full-stack development

    public FullStackDeveloper(final String id, final int salary, final Manager manager) {
        super(id, salary, manager);
        manager.addEmployeeToManage(this);
    }
}
