import java.io.Serializable;
import java.util.HashMap;
public class InsertRecordsIntoHashMap implements Serializable{
	/**
	 * 
	 */
	
	private static int Id;
    private static String Fname;
    private static String skill;
    private static String post;
    private static Hashamp u;  
    private static HashMap<Integer,Hashamp> map = new HashMap<Integer,Hashamp>();
    public   InsertRecordsIntoHashMap(int Id1, String Fname1, String skill1, String post1) {
    	Id=Id1;
    	Fname=Fname1;
    	skill = skill1;
    	post=post1;	
    	 Hashamp u=new Hashamp(Id,Fname,skill,post);
    	map.put(Id, u);
    	System.out.println(u.getId()+" "+u.getFname()+" "+u.getSkill()+" ");
    };
    
    public static Hashamp GetRecordsFromHashmap(int Id) 
    {
    	
    	u=map.get(Id);
    	return u;
    }
    
    

}
