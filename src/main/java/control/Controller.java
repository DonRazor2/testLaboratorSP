package control;

import com.fasterxml.jackson.core.JsonProcessingException;
import entity.BackEndDeveloper;
import entity.Employee;
import entity.FrontEndDeveloper;
import entity.FullStackDeveloper;
import entity.HRGuy;
import entity.Manager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;



import javax.ejb.Stateless;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class Controller {
    private List<Employee> employees;

    public String getAllEmployees() throws JsonProcessingException {
        if (employees.isEmpty()) {
            initiateData();
        }

        final ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(employees);
    }

//    public String addEmployee() {
//        Nu am mai apucat...
//    }

    // Nici asta...
    public String getAverageSalary() {
        List<Integer> salaries = employees.stream().map(Employee::getSalary).collect(Collectors.toList());
        return String.valueOf(calculateAverage(salaries));
    }

    private double calculateAverage(List <Integer> marks) {
        Integer sum = 0;
        if(!marks.isEmpty()) {
            for (Integer mark : marks) {
                sum += mark;
            }
            return sum.doubleValue() / marks.size();
        }
        return sum;
    }

    // I did it like this because there's no time to create an actual database for this test
    public void initiateData() {
        final Manager managerDevelopers = new Manager("0", 7500);
        final FrontEndDeveloper Vasile = new FrontEndDeveloper("1", 3000, managerDevelopers);
        final BackEndDeveloper Ion = new BackEndDeveloper("2", 4000, managerDevelopers);
        final FullStackDeveloper John = new FullStackDeveloper("3", 5000, managerDevelopers);
        final FullStackDeveloper Don = new FullStackDeveloper("4", 5500, managerDevelopers);
        final HRGuy Maria = new HRGuy("5", 2800, managerDevelopers, Arrays.asList(Vasile, Ion, John, Don));

        employees.addAll(Arrays.asList(managerDevelopers, Maria, Vasile, Ion, John, Don));
    }

}
