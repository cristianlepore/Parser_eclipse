package parser;

import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ParserRuleContext;

public class My_run {

	public static void main(String args[]) throws IOException {

		String fileToRead = "/var/www/html/SecTeal/secteal-string.txt";
		String oracle = "";
		try (// pass the path to the file as a parameter
				FileReader fr = new FileReader(fileToRead)) {
			int i;
			while ((i = fr.read()) != -1) {
				oracle += (char) i;
			}
		}

		try {
			File myObj = new File("/var/www/html/SecTeal/secteal-string-java.txt");
			if (myObj.createNewFile()) {
				// System.out.println("File created: " + myObj.getName());
			} else {
				// System.out.println("File already exists.");
				PrintWriter writer = new PrintWriter(myObj);
				writer.print("");
				writer.close();
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		// oracle = "((tx(0).snd <= 40000) and (tx(0).crcv = addr ZZAF5ARA4MEC5PVDOP64JM5O5MQST63Q2KOY2FLYFLXXD3PFSNJJBYAFZM))";

		// oracle = "((tx(0).type = int close) and (((tx(0).fv > int 3000) and (tx(0).crcv = addr a)) or (((arg(0) = byte base64 0) and (versig(arg(0),arg(1),addr o) and (tx(0).crcv = addr a))) or ((arg(0) = byte base64 1) and (versig(arg(0),arg(1),addr o) and (tx(0).crcv = addr b))))))";
		
		List<String> lines = new ArrayList<String>();
		String[] lineOracle = oracle.split(System.getProperty("line.separator"));
		String myString = "";

		for(int i = 0; i < lineOracle.length; i++) {
			lineOracle[i] = lineOracle[i].trim();
			if(!lineOracle[i].equals(""))
				lines.add(lineOracle[i]);
		}
		
		for(int i = 0; i < lines.size(); i++) {
			String line = ((String) lines.get(i)).trim();
			switch(line.charAt(0)) {
			  case '+':
				  line = " " + line;				
				  break;
			  case '-':
				  line = " " + line;				
				  break;
			  case '<':
				  line = " " + line;				
				  break;
			  case '=':
				  line = " " + line;				
				  break;
			  case '>':
				  line = " " + line;				
				  break;
			  case '*':
				  line = " " + line;				
				  break;
			  case '/':
				  line = " " + line;				
				  break;
			  case '%':
				  line = " " + line;				
				  break;
			}
			switch(line.charAt(line.length()-1)) {
			  case '+':
				  line += " ";				
				  break;
			  case '-':
				  line += " ";				
				  break;
			  case '<':
				  line += " ";				
				  break;
			  case '=':
				  line += " ";				
				  break;
			  case '>':
				  line += " ";				
				  break;
			  case '*':
				  line += " ";				
				  break;
			  case '/':
				  line += " ";				
				  break;
			  case '%':
				  line += " ";				
				  break;
			}
			myString += line;				
		}
		
		oracle = myString;
		myString = "";
		stealLexer lexer = new stealLexer(CharStreams.fromString(oracle));
		// stealLexer lexer = new stealLexer(CharStreams.fromString(basic));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		stealParser parser = new stealParser(tokens);

		ParserRuleContext tree = parser.exp();
		// was: ParserRuleContext <Token> tree = parser.exp();

		// create standard walker
		ParseTreeWalker walker = new ParseTreeWalker();
		ABB__stealBaseListener extractor = new ABB__stealBaseListener();// (parser);
		walker.walk(extractor, tree);// initiate walk of tree with listener
	}
}
