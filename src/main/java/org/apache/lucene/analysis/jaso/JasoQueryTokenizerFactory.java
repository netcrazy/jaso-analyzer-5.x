package org.apache.lucene.analysis.jaso;
import java.util.Map;

import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.util.TokenizerFactory;
import org.apache.lucene.util.AttributeFactory;

/**
 * 쿼리시 원본키워드를 원본 그대로 리턴한다.
 * @since 	2016-07-01
 * @author 	ikchoi
 *
 */
final public class JasoQueryTokenizerFactory extends TokenizerFactory {

	public JasoQueryTokenizerFactory(Map<String, String> args) {
		super(args);
		if (!args.isEmpty()) {
			throw new IllegalArgumentException("Unknown parameters: " + args);
		}
	}

	@Override
	public Tokenizer create(AttributeFactory factory) {
		return new JasoQueryTokenizer(factory);
	}
}