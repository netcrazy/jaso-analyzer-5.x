package org.apache.lucene.analysis.jaso;
import java.io.IOException;
import java.util.Map;

import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.util.TokenizerFactory;
import org.apache.lucene.util.AttributeFactory;

/**
 * JasoTokenizerFactory
 * Indexing 할때 자소단위로 분해한다.
 * @since	2015-07-01
 * @author 	ikchoi
 *
 */
public class JasoTokenizerFactory extends TokenizerFactory {

	/**
	 * 유형에 따른 자소분해 (테스트케이스 참고)
	 * 0 : 성과 이름만 분해 (디폴트)
	 * 1 : 이름분해시 성과 이름 외 이름만 추가분해 (요소별 추가 분해) (예) "일규", "규" 를 추가적으로 자소분해
	 * 2 : 이름분해시 성과 이름 외 이름만 추가분해 (이름만 추가 분해) (예) "일규" 를 추가적으로 자소분해
	 */
	private int mode = 0;

	/**
	 * 자소 분해시 영문으로도 추가적으로 분해할 것인지
	 */
	private boolean typo = true;

	public JasoTokenizerFactory(Map<String, String> args) {
		super(args);

		mode = getInt(args		, "mode", 0);
		typo = getBoolean(args	, "typo", true);

		if (!args.isEmpty()) {
			throw new IllegalArgumentException("Unknown parameters: " + args);
		}
	}

	@Override
	public Tokenizer create(AttributeFactory factory)  {
		try {
			return new JasoTokenizer(factory, mode, typo);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}