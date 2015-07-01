package org.apache.lucene.analysis.jaso;

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.IOException;

import org.apache.lucene.util.AttributeFactory;

/**
 * JasoTokenizer
 * @since	2015-07-01
 * @author 	ikchoi
 *
 */
public final class JasoTokenizer extends TempCharTokenizer {

	public JasoTokenizer(AttributeFactory factory, int mode, boolean typo) throws IOException {
		super(factory, mode, typo);
	}

	/** Collects only characters which do not satisfy
	 * {@link Character#isWhitespace(int)}.*/
	@Override
	protected boolean isTokenChar(int c) {
		return !isSplit(c);
	}

	protected boolean isSplit(int c) {
		if ((char)c == '★')
		{
			return true;
		} else {
			return false;
		}
	}
}
