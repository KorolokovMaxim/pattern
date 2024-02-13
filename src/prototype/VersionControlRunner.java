package prototype;

public class VersionControlRunner {
    public static void main(String[] args) {

        try {
            Project master = new Project(1, "SuperProject", "source code = new source()");
            System.out.println(master);
            ProjectFactory factory = new ProjectFactory(master);
            Project masterClone = factory.cloneProject();
            System.out.println(masterClone);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}
