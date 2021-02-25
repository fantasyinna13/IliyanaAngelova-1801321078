package uni.pu.fmi;
import java.util.Set;

/**
 * 
 */
public class Student {

    /**
     * Default constructor
     */
    public Student() {
    }


    private String username;
    private String password;
    private String name;
    private String email;
    
    public Set<Parent> Parent;

    /**
     * 
     */
    public Journal Journal;

    /**
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
       this.password = password;
    }

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

    /**
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     */
    public Set getGrades() {
        // TODO implement here
        return null;
    }

}