package enums.interpret;

import language_enum.*;

import java.io.*;
import java.util.Stack;

public class Interpretor extends Walker {
	public static void main(String[] args) throws Exception {
		Parser p = new Parser(new StringReader(args[0]));
		Node tree = p.parse();
		Interpretor i = new Interpretor();
        i.eval(tree);
	}

	public void eval(Node n) {
		n.apply(this);
	}

	private Stack<String> values = new Stack<String>();
	private int count = 0;
		
	@Override
	public void outEnum_Enum(NEnum_Enum node) {
		System.out.println("enum " + node.get_Id().getText());
		for(int i = 0; i < count; i++) {
			String value = values.pop();
			if(value == null) {
				System.out.println("    " + values.pop());
			} else {
				System.out.println("    " + values.pop() + " = " + value);
			}
		}
		System.out.println("end");
	}
	
	@Override
	public void outValue_With(NValue_With node) {
		values.push(node.internalGetId$1().getText());
		values.push(node.internalGetId$2().getText());
		count++;
	}
	
	@Override
	public void outValue_Without(NValue_Without node) {
		values.push(node.get_Id().getText());
		values.push(null);
		count++;
	}
}
