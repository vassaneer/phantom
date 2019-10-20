package phantomnetbean.Client.Personal;

import java.util.ArrayList;
import java.util.Arrays;

public class Role implements  java.io.Serializable{
        public Role(){
        }
        public Role(String rl){
            role = rl;
        }
        public boolean Show(){
            return role.equals(Roles.get(1));
        }
        private String role;
        public final ArrayList<String> Roles = new ArrayList<String>(Arrays.asList("SHERIFF","VICE","OUTLAW"
                ,"OUTLAW","RENEGADE"));
        public ArrayList<String> Roles (){
            return Roles;
        }
        public String checkRole(){return role;}
    }
