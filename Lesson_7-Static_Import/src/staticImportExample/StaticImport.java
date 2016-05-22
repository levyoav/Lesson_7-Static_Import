package staticImportExample;

import static java.lang.Math.PI;
import static java.lang.Math.random;

public class StaticImport {

	public static void main(String[] args) {

		//Importing the static final attribute 'java.lang.Math.PI'
		//allows to use it simply as 'PI'.
		System.out.println(PI);

		//Importing the static method 'java.lang.Math.random'
		//allows to use it simply as 'random()'.
		int r = (int) (random() * 11);
		System.out.println(r);
	}

}
