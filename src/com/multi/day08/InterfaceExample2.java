package com.multi.day08;

abstract class JDBCAbstract{
	public abstract void save();

	public abstract void retrieve();

	public abstract void insert();

	public abstract void delete();
}

interface JDBCInterface {
	// 1.상수
	// 2.추상메서드...public abstract는 생략가능
	void save();

	void retrieve();

	void insert();

	void delete();
	// 3.디폴트메서드
	// 4.스테틱메서드
}

class OracleDB implements JDBCInterface {

	@Override
	public void save() {
		System.out.println(getClass().getSimpleName() + " db save");
	}

	@Override
	public void retrieve() {
		System.out.println(getClass().getSimpleName() + " db retrieve");
	}

	@Override
	public void insert() {
		System.out.println(getClass().getSimpleName() + " db insert");
	}

	@Override
	public void delete() {
		System.out.println(getClass().getSimpleName() + " db delete");
	}

}

class SybaseDB implements JDBCInterface {

	@Override
	public void save() {
		System.out.println(getClass().getSimpleName() + " db save");
	}

	@Override
	public void retrieve() {
		System.out.println(getClass().getSimpleName() + " db retrieve");
	}

	@Override
	public void insert() {
		System.out.println(getClass().getSimpleName() + " db insert");
	}

	@Override
	public void delete() {
		System.out.println(getClass().getSimpleName() + " db delete");
	}

}

class MySQL extends JDBCAbstract {

	@Override
	public void save() {
		System.out.println(getClass().getSimpleName() + " db save");
	}

	@Override
	public void retrieve() {
		System.out.println(getClass().getSimpleName() + " db retrieve");
	}

	@Override
	public void insert() {
		System.out.println(getClass().getSimpleName() + " db insert");
	}

	@Override
	public void delete() {
		System.out.println(getClass().getSimpleName() + " db delete");
	}

}


public class InterfaceExample2 {
	public static void main(String[] args) {
		OracleDB oracleDB = new OracleDB();
		SybaseDB sybaseDB = new SybaseDB();
		MySQL mySQL = new MySQL();
		dbUse(oracleDB);
		dbUse(sybaseDB);
		dbUse(mySQL);
		
		
		JDBCInterface infomix = new JDBCInterface() {
			
			@Override
			public void save() {
				System.out.println("infomix save");				
			}
			
			@Override
			public void retrieve() {
				System.out.println("infomix retrieve");					
			}
			
			@Override
			public void insert() {
				System.out.println("infomix insert");					
			}
			
			@Override
			public void delete() {
				System.out.println("infomix delete");					
			}
		};
		dbUse(infomix);
		
		// 필요할때마다 그때그때 구현하고 끝내고 할때
		JDBCAbstract sqlServer = new JDBCAbstract() {
			
			@Override
			public void save() {
				System.out.println("sqlServer save");
				
			}
			
			@Override
			public void retrieve() {
				System.out.println("sqlServer retrieve");
				
			}
			
			@Override
			public void insert() {
				System.out.println("sqlServer insert");
				
			}
			
			@Override
			public void delete() {
				System.out.println("sqlServer delete");
				
			}
		};
		dbUse(sqlServer);
		
	}

	public static void dbUse(JDBCInterface jdbcInterface) {
		jdbcInterface.save();
		jdbcInterface.retrieve();
		jdbcInterface.insert();
		jdbcInterface.delete();
	}
	
	public static void dbUse(JDBCAbstract jdbcAbstract) {
		jdbcAbstract.save();
		jdbcAbstract.retrieve();
		jdbcAbstract.insert();
		jdbcAbstract.delete();
	}

}
