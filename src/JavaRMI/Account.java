package JavaRMI;

import java.io.Serializable;

/**
 * Created by zz on 2015/5/6.
 */
public class Account implements Serializable,Cloneable {
    private static final long seriaVersionUID = -1858518369668584532L;
    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
