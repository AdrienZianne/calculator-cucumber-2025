package calculator.parser;

import org.antlr.v4.runtime.misc.ParseCancellationException;


/**
 * Simple error class that store the line number and the position of the character that posed a problem during parsing.
 */
public class ParserError extends ParseCancellationException {
    /**
     * The line number of the token that caused the error
     */
    public final int lineNb;
    /**
     * The first character position of the  in the line that posed a problem
     */
    public final int charPositionInLine;

    /**
     * The default constructor of the {@link ParserError} class.
     * @param lineNb The line number of the token that caused the error.
     * @param charPositionInLine The first character position of the  in the line that posed a problem.
     * @param msg The message describing the error.
     */
    public ParserError(int lineNb, int charPositionInLine, String msg)
    {
        super(msg);
        this.lineNb = lineNb;
        this.charPositionInLine = charPositionInLine;
    }
}
