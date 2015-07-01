package org.apache.lucene.analysis.jaso;

import junit.framework.TestCase;

/**
 * 자동완성 기능 유닛테스트
 * 2013-09-15
 * @author IKCHOI
 *
 */
public class JasoDecomposerTest extends TestCase {

	protected static void setUpBeforeClass() throws Exception {
	}

	protected static void tearDownAfterClass() throws Exception {
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testJasoDecomposer() {

		System.out.println("-----------------------------");
		JasoDecomposer aa=new JasoDecomposer();
		String test=aa.runJasoDecompose("원할머니",0, false);
		System.out.println(test);

	}

}


