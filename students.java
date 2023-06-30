package collegeday7home2;

public class students {

	public void getStudentInfo(int	id) {
		System.out.println("The student id is  :"+id);
	}
	
	public void getStudentInfo(int id,String name) {
		System.out.println("The student id and name is  :"+id+name);
	}
	
	public void getStudentInfo(String email,String phone) {
		System.out.println("The student mail id is  :"+email+phone);
	}
	
	
	public static void main(String[] args) {
	
		students st=new students();
		st.getStudentInfo(1234);
		st.getStudentInfo(1234, "Nand");
		st.getStudentInfo("nan@gmail.com", "9940631548");
				
	}

}
