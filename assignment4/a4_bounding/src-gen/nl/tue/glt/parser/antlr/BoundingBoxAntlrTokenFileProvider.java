/*
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BoundingBoxAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("nl/tue/glt/parser/antlr/internal/InternalBoundingBox.tokens");
	}
}
