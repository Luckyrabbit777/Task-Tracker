package Model;
public class Tasks {
    String taskName;
    int id;
    String Description;
    String status;
    boolean done;
    int createdAt;
    int updatedAt;

    public Tasks(String taskName, int id, String Description, String status, boolean done, int createdAt, int updatedAt) {
        this.taskName = taskName;
        this.id = id;
        this.Description = Description;
        this.status = status;
        this.done = done;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
