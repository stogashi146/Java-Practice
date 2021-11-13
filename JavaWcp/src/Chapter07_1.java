
public class Chapter07_1 {
	public static void main(String args[]) {
		int distance = 12;
		if (distance <= 5) {
			System.out.println("とても近いです");
		} else if (distance <= 10) {
			System.out.println("近いです");
		} else if (distance <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}

		String color = "yellow";
		switch(color) {
		case "red":
			System.out.println("赤です");
			break;
		case "blue":
			System.out.println("青です");
			break;
		case "yellow":
			System.out.println("黄色です");
			break;
		default:
			System.out.println("何色でもありません");
		}
	}
}
