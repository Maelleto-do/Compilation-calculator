
import java.io.*;

import abstractTree.*;

public class Main {
	public static void main(String[] args) throws Exception {
		ScannerExpr input = new ScannerExpr(new FileReader(args[0]));
		ParserExpr parser = new ParserExpr();
		
		AbstTreeInt expr = (AbstTree) parser.parse(input);

		System.out.println(expr.toString());

		 EnvironmentInt environment = new Environment();
		 try{
			 expr.readExpression(environment);
			 System.out.println("Résultat: " + expr.getValue());
		 }catch (ArithmException e){
			System.out.println(e.getMessage());
			System.out.println("program stopped");
		 }


	}
}
