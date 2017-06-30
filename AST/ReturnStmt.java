/*
Vinicius Yamamoto     RA 490105
Daniel Valim    RA  511315
*/
package AST;
import java.util.*;

public class ReturnStmt{
	public ReturnStmt(ArrayList<OrTest> ort){
		this.ort = ort;
	}

	public void genC(PW pw) {
		int i;
		pw.print("return");
		if(!ort.isEmpty()){
			pw.out.print(" ");
			for(i=0;i<ort.size();i++){
				ort.get(i).genC(pw);
			}
		}
		pw.out.println(";");
	}
	private ArrayList<OrTest> ort;
}