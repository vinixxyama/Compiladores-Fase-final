
/*
Vinicius Yamamoto     RA 490105
Daniel Valim    RA  511315
*/
package AST;
import java.util.*;

public class FuncStmt{
	public FuncStmt(String funcvar, ArrayList<OrTest> ort){
		this.funcvar = funcvar;
		this.ort = ort;
	}

	public void genC(PW pw) {
		int i = 0;
		pw.print(funcvar+"(");
		while(i < ort.size()){
			ort.get(i).genC(pw);
			i++;
		}
		pw.out.println(");");
	}

	private String funcvar;
	private ArrayList<OrTest> ort;
}