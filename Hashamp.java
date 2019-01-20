import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

// create a users class
public class Hashamp implements Serializable{
    public int Id;
    public String Fname;
    public String Skill;
    public String Post;
    
    public Hashamp(){}
    public Hashamp(int id1, String fname1,String skill1,String post1){
        Id = id1;
        Fname = fname1;
        Skill = skill1;
        Post = post1;
    }
    
     int getId(){
        return Id;
    }
    
     String getFname(){
        return Fname;
    }
    
        String getSkill(){
        return this.Skill;
    }
       
      String getPost(){
        return this.Post;
    }
	 void setId(int Id) {
		this.Id = Id;
	}
	 void setFname(String Fname) {
		this.Fname = Fname;
	}
	 void setSkill(String Skill) {
		this.Skill = Skill;
	}
	 void setPost(String Post) {
		this.Post = Post;
	}
     
     
}
