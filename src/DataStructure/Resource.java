package DataStructure;

import java.util.Random;

public class Resource {
    int resourceID;
    int projectID;
    String type;
    String content;
    public Resource(String path, int projectID){
        Random random = new Random();
        this.resourceID = random.nextInt();
        this.projectID = projectID;
    }
}
