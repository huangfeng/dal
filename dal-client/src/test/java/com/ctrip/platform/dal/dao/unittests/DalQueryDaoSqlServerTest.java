package com.ctrip.platform.dal.dao.unittests;

import com.ctrip.platform.dal.dao.unitbase.SqlServerDatabaseInitializer;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class DalQueryDaoSqlServerTest extends DalQueryDaoTestStub {
	private static SqlServerDatabaseInitializer initializer = new SqlServerDatabaseInitializer();
	public DalQueryDaoSqlServerTest() {
		super(initializer.DATABASE_NAME, initializer.diff);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		initializer.setUpBeforeClass();
		DalQueryDaoTestStub.prepareData(initializer.DATABASE_NAME);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		initializer.tearDownAfterClass();
	}
}
