package tim.app.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idUser;
    String userName;
    String rootFolder;
    String ROULE;

//    String userPassword;
//    String[] curFold;



}
