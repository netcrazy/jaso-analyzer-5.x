package org.apache.lucene.analysis.jaso;

import org.apache.lucene.analysis.util.CharTokenizer;
import org.apache.lucene.util.AttributeFactory;

/**
 * JasoQueryTokenizer
 * @since	2015-07-01
 * @author 	ikchoi
 *
 */
public class JasoQueryTokenizer extends CharTokenizer
{
	public JasoQueryTokenizer(AttributeFactory factory) {
		super(factory);
	}

	@Override
	protected boolean isTokenChar(int arg0) {
		return true;
	}
}