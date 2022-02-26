package Account;

public class Editor extends User {
    public boolean createProject(String projectName) {
        return true;
    }

    public boolean assignProject(int userID, int projectID) {
        return true;
    }

    public boolean createResource(int projectID, String filepath) {
        return true;
    }

    public boolean createRevision(int submissionID, String filepath) {
        return true;
    }

    public boolean updateProjectStatus(int projectID, String status) {
        return true;
    }
}


