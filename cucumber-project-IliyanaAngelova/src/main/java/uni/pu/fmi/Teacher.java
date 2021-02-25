package uni.pu.fmi;
import java.util.Set;

/**
 * 
 */
public class Teacher {

    /**
     * Default constructor
     */
    public Teacher() {
    }

    /**
     * 
     */
    private String username;
    private String password;
    private String name;
    private String email;
    

    /**
     * 
     */
    public Journal Journal;

    /**
     * 
     */
    public Subject Subject;

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

    /**
     * @param grades 
     * @return
     */
    public void setGrades(Set grades) {
       
    }

    /**
     * @param grades 
     * @return
     */
    public void addGrades(Journal grades) {
       
    }

}