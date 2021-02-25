package uni.pu.fmi;
import java.util.Set;

/**
 * 
 */
public class Subject {

    /**
     * Default constructor
     */
    public Subject() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    public Set<Teacher> Teacher;

    /**
     * 
     */
    public Journal Journal;

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

}