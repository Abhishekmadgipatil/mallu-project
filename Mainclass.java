package controller;

import java.util.Scanner;
import dao.Sample;

public class Mainclass {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Sample sample = new Sample();
		boolean flag = true;
		while (flag) {
			System.out.println("1.add emp\n2. fetch \n3. remove \n4. update\n5. fetchAll\n6.removeall\n7. exit");
			switch (scanner.nextInt()) {
			case 1: {
				System.out.println("enter the emp id");
				int id = scanner.nextInt();
				System.out.println("enter the name");
				String name = scanner.next();
				System.out.println("enter the salary");
				double sal = scanner.nextDouble();
				System.out.println("enter the job role");
				String job = scanner.next();
				sample.addemp(id, name, sal, job);
			}
				break;
			case 2: {
				System.out.println("enter the emp id");
				int id = scanner.nextInt();
				sample.fetchemp(id);
			}
				break;
			case 3: {
				System.out.println("enter the emp id");
				int id = scanner.nextInt();
				sample.removeemp(id);
			}
				break;
			case 4: {
				System.out.println("enter the emp id");
				int id = scanner.nextInt();
				System.out.println("enter the new salary");
				double sal = scanner.nextDouble();
				sample.updateempsal(id, sal);
			}
				break;
			case 5: {
				sample.fetchAll();
			}
				break;
			case 6: {
				sample.deleteAll();
			}
				break;
			case 7: {
				flag = false;
				System.out.println("Thank you");
			}
				break;
			default:
				System.out.println("invalid option");
				break;
			}
		}
	}

}
