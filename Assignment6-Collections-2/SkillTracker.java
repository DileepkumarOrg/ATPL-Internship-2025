
import java.util.*;

public class SkillTracker {
    private Map<String, Set<String>> employeeSkills = new HashMap<>();

    public void findEmployeesWithSkill(String skill) {
        List<String> employeesWithSkill = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : employeeSkills.entrySet()) {
            if (entry.getValue().contains(skill)) {
                employeesWithSkill.add(entry.getKey());
            }
        }
        System.out.println("Employees with skill " + skill + ": " + employeesWithSkill);
    }    

    public void addEmployeeSkills(String emp, Set<String> skills) {
        employeeSkills.put(emp, skills);
    }

    public void findCommonSkills(String emp1, String emp2) {
        Set<String> commonSkills = new HashSet<>();
        Set<String> skills1 = employeeSkills.get(emp1);
        Set<String> skills2 = employeeSkills.get(emp2);

        if (skills1 != null && skills2 != null) {
            commonSkills.addAll(skills1);
            commonSkills.retainAll(skills2); 
        }
        System.out.println("Common skills between Dileep and Naveen: " + commonSkills);
    }

    public static void main(String[] args) {
        SkillTracker skillTrackerObject = new SkillTracker();
        Set<String> skillsDileep = new HashSet<>(Arrays.asList("Java", "JavaScript", "Python"));
        Set<String> skillsMahesh = new HashSet<>(Arrays.asList("Java", "SQL", "CSS"));
        Set<String> skillsNaveen = new HashSet<>(Arrays.asList("Python", "JavaScript", "SQL"));
        skillTrackerObject.addEmployeeSkills("Dileep", skillsDileep);
        skillTrackerObject.addEmployeeSkills("Mahesh", skillsMahesh);
        skillTrackerObject.addEmployeeSkills("Naveen", skillsNaveen);
        skillTrackerObject.findCommonSkills("Dileep", "Naveen");
        String skillToFind = "Python";
        skillTrackerObject.findEmployeesWithSkill(skillToFind);
        

    }
}

