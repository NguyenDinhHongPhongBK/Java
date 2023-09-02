package StringLibrary;

public class StringBuilderLibrary {
	
	public static void main(String[] args) {
		String str;
		StringBuilder sb = new StringBuilder();
		//append : nối chuỗi
		sb.append("Hi, ");
		sb.append("My name is ");
		//insert : thêm vào vị trí thứ i
		sb.insert(sb.length(),"Phong");
		str = sb.toString();
		System.out.println(str);
		//delete : Xóa n kí tự bắt đầu từ kí tự i
		sb.delete(0, 3);
		str = sb.toString();
		System.out.println("String after delete 3 characters from first : "+str);
	}
}
