/*  Vinicius Yamamoto   RA:490105
    Daniel Valim        RA:511315
*/
package AST;
import Lexer.*;
import java.util.*;

public class ForStmt {
    public ForStmt(char tk, ArrayList<Stmt> st, Comparison com){
		this.tk = tk;
		this.st = st;
		this.com = com;
	}
    public ForStmt(char tk, ArrayList<Stmt> st, String var, Numbers nb1, Numbers nb2){
		this.tk = tk;
		this.st = st;
        this.var = var;
        this.nb1 = nb1;
        this.nb2 = nb2;
	}
    public void genC(PW pw){
		pw.out.print("for(");       
        pw.out.print(var);
 	    pw.out.print("=");
        nb1.genC(pw);
        pw.out.print(";");
        
        pw.out.print(var);
        int n1 = Integer.parseInt(nb1.getReal());
        int n2 = Integer.parseInt(nb2.getReal());
        
        if( n1 <= n2) {
            pw.out.print("<");
        }else { 
            pw.out.print(">");
        }
        nb2.genC(pw);
        pw.out.print(";");
       
        pw.out.print(var);
        if( n1 <= n2) {
            pw.out.print("++");
        } else { 
            pw.out.print("--");
        }
                
		pw.out.print("){\n");
		for(int i=0; i<st.size();i++){
			st.get(i).genC(pw);
		}
		pw.out.print("\n}");
	}


    private char tk;
    private ArrayList<Stmt> st;
    private Comparison com;
    private String var;
    private Numbers nb1;
    private Numbers nb2;
}
