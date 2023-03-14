package policemanagement;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Owner {
    private String CMND;
    private String name;
    private String email;
    private static ArrayList<Integer> cmnd = new ArrayList<>();

  public Owner(String CMND,String name,String email){
      this.CMND = CMND;
      this.name= name;
      this.email = email;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.matches();
    }
    public boolean isValidateCMND(){
        if (CMND.length()==12 && !cmnd.contains(CMND)){
            return true;
        }
        return false;
    }
}
