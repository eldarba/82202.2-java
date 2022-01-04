package e.dao;

public class Test1 {

	public static void main(String[] args) {

		PersonDao personDao = new PersonDao();

		try {

//		{ // create
//			Person person = new Person(103, "Yafa Levi");
//			personDao.save(person);
//			System.out.println(person);
//		}

//		{ // read
//			Person p = personDao.get(102);
//			System.out.println(p);
//		}

//		{ // update
//			Person p = new Person(103, "Yafa Kohen");
//			personDao.update(p);
//			System.out.println("updated: " + p);
//		}

			{ // delete
				personDao.delete(102);
				System.out.println("deleted");
			}

		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("END OF TEST");
	}

}
