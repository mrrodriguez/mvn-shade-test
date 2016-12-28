package shade;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class ShadeJava {
	
	static {
		IFn requireFn = Clojure.var("clojure.core", "require");
		requireFn.invoke(Clojure.read("shade.main"));
	}
	
	public static void main(String[] args) {
		Clojure.var("shade.main", "-main").invoke();
	}
}
