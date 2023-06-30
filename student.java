package collegeday7home2;

public class student extends department{
	
	public void studentName() {
		System.out.println("Comes from child studentName");
	}
	
	public void studentDept() {
		System.out.println("Comes from child studentDept");
	}
    
	public void studentId() {
		System.out.println("Comes from child studentId");
	}
	public static void main(String[] args) {
		 
		student st=new student();
	st.collegeName();
	st.collegeCode();
	st.collegeRank();
	st.deptName();
	st.studentName();
	st.studentDept();
	st.studentId();
	}

}
