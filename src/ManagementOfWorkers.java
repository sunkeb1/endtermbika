import java.util.List;
import java.util.ArrayList;
public class ManagementOfWorkers {
    private List<Workers> workers;

    public ManagementOfWorkers() {
        workers = new ArrayList<>();
    }
    public void addEmployee(Workers workers) {
        this.workers.add(workers);
    }
    public Workers getEmployeeById(int id) {
        for (Workers workers : this.workers) {
            if (workers.getId() == id) {
                return workers;
            }
        }
        return null;
    }

    public void updateEmployeeContactInformation(int id, String newContactInformation) {
        Workers workers = getEmployeeById(id);
        if (workers != null) {
            workers.updateContactInformation(newContactInformation);
            System.out.println("Обновление контактов прошло успешно .");
        } else {
            System.out.println("Работник не найден.");
        }
    }
    public void deleteEmployee(int id) {
        Workers workers = getEmployeeById(id);
        if (workers != null) {
            this.workers.remove(workers);
            System.out.println("Работник удален успешно.");
        } else {
            System.out.println("Работник не найден.");
        }
    }
}
