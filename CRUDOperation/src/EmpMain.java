import java.sql.SQLException;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc=new Scanner(System.in);
		Employee emp=null;
		EmpDAO dao=null;
		while(true) {
			System.out.println("1.create data 2. insert 3.update 4.delete 5.display 6.exit");
			System.out.println("please enter your option from the menu");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:dao=new EmpDAO();
					emp=dao.createdata();
				break;
			case 2:dao=new EmpDAO();
					int row=dao.insert(emp);
					if(row>0) {
						System.out.println("inserted successfully");
					}
					else {
						System.out.println("not inserted ");
					}
				break;
			case 3:new EmpDAO();
			int row1=dao.update();
			if(row1>0) {
				System.out.println("updated successfully");
			}
			else {
				System.out.println("not updated ");
			}
				break;
			case 4: new EmpDAO();
		 int row2=dao.drop();
			if(row2==0)
			{
				System.out.println("deleted successfully");
			}
			else {
				System.out.println("not deleted ");
			}
				break;
			case 5:dao=new EmpDAO();
			dao.display();
				break;
			case 6:System.exit(0);
				break;
			default :System.out.println("Wrong choice");
				break;

			}
		}


	}

}
