/*
Vinicius Yamamoto     RA 490105
Daniel Valim    RA  511315
*/
package AST;
import java.util.ArrayList;

public class OrList{
	public OrList(ArrayList<OrTest> ortlist){
		this.ortlist = ortlist;
	}

	public void genC(PW pw){
		int i = 0;
		while(i < ortlist.size()){
			ortlist.get(i).genC(pw);
			i++;
		}
	}

	private ArrayList<OrTest> ortlist;
}