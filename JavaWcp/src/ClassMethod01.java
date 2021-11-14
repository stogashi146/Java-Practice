
public class ClassMethod01 {
	public static void main(String[] args) {
		Human01_1 yamada = new Human01_1();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

		Human01_1 sato = new Human01_1("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です");
	}

}
