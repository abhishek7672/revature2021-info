package com.revature.app.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.revature.app.dao.Employeedao;

class EmplyeeDaoImplTest {

	@Test
	void test() {
		
Employeedao dao = new com.revature.app.dao.impl.EmloyeeDaoImpl();
try {
			assertTrue(dao.list().size()>0);
			
		}catch (SQLException e) {
			fail("Getting failes");
		}
	}
}


