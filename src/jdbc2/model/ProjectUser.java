package jdbc2.model;

public class ProjectUser {

    private long id;
    private long projectId;
    private long userId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ProjectUser{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", userId=" + userId +
                '}';
    }
}
