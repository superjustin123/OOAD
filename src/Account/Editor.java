package Account;

import DataStructure.Resource;
import DataStructure.Revision;
import Handler.GetHandler;
import Handler.SaveHandler;
import Handler.UpdateHandler;

public class Editor extends User {


    public boolean createProject(String projectName) {
        return true;
    }

    public boolean assignProject(int userID, int projectID) {
        return true;
    }

    public boolean createResource(int projectID, String filepath) {
        // upload the file
        Resource resource = new Resource(filepath , projectID);
        // save file to database
        return SaveHandler.saveResource(resource);
    }

    public boolean createRevision(int submissionID, String filepath) {
        // upload the file
        Revision revision = new Revision(filepath);
        // save file to db
        return SaveHandler.saveRevision(revision);
    }

    public boolean updateProjectStatus(int projectID, String status) {
        return UpdateHandler.updateProjectStatus(projectID, status);
    }
}


