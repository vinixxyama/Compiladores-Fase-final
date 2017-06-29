/*  Vinicius Yamamoto   RA:490105
    Daniel Valim        RA:511315
*/
package AST;
import java.util.*;

public class FuncDef{
	public FuncDef(ArrayList<ArgsList> arl2, ArrayList<Declaration> decl, ArrayList<Stmt> st, String funcnome, String tipofunc){
		this.arl2 = arl2;
		this.decl = decl;
		this.st = st;
		this.funcnome = funcnome;
		this.tipofunc = tipofunc;
	}

	public String getfuncnome(){
		return funcnome;
	}

	public String getfunctipo(){
		return tipofunc;
	}

	public void genC(PW pw) {
		int i;
		pw.out.print(tipofunc+" ");
		pw.out.print(funcnome+"(");
		for(i=0;i<arl2.size();i++){
			arl2.get(i).genC(pw);
		}
		pw.out.println("){");
		pw.add();
		if(!decl.isEmpty()){
			for(i=0;i<decl.size();i++){
				decl.get(i).genC(pw);
			}
		}
		pw.out.println("");
		if(!st.isEmpty()){
			for(i=0;i<st.size();i++){
				st.get(i).genC(pw);
			}
		}
		pw.out.println("}");
		pw.sub();
		
	}

	private ArrayList<ArgsList> arl2;
	private ArrayList<Stmt> st;
	private ArrayList<Declaration> decl;
	private String funcnome;
    private String tipofunc;
}