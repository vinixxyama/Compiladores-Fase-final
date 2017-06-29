
/*
Vinicius Yamamoto     RA 490105
Daniel Valim    RA  511315
*/
package AST;
import java.util.*;

public class ReturnStmt{
	public ReturnStmt(OrTest ort){
		this.ort = ort;
	}

	public void genC(PW pw) {
		pw.print("return");
		if(ort != null){
			pw.out.print(" ");
			ort.genC(pw);
		}
		pw.out.println(";");
	}
	private OrTest ort;
}