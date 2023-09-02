package communityuni.com.test;

import java.text.DecimalFormat;

import communityuni.com.model.Triangle;

public class TestTriangle {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");
		Triangle t = new Triangle();
		t.setEdgeA(3);
		t.setEdgeB(4);
		t.setEdgeC(5);
		System.out.println(t.CaculateArea());
		
		Triangle t2 = new Triangle(5,7,9);
		System.out.println(df.format(t2.CaculateArea()));

	}

}
