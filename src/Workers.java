import java.util.List;

public class Workers {
    private int id;
    private String name;
    private String contactInfo;
    private List<String> workerHistory;
    public Workers(){
    }

    public Workers(int id, String name, String contactInformation, List<String> workerHistory) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInformation;
        this.workerHistory = workerHistory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<String> getWorkerHistory() {
        return workerHistory;
    }

    public void setWorkerHistory(List<String> workerHistory) {
        this.workerHistory = workerHistory;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "№=" + id +
                ", имя='" + name + '\'' +
                ", контактинфо='" + contactInfo + '\'' +
                ", историяработника=" + workerHistory +
                '}';
    }

    public void updateContactInformation(String newContactInformation) {
    }
}
