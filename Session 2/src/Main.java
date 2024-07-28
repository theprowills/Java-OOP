import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Wrapper class
		int a = 10;
		Integer c = 9;
		System.out.println(c.floatValue());
		System.out.println(a + c.floatValue());

		Boolean d = true;

		System.out.println();
//		String methods
		String text = "balonku ada lima";
		System.out.println(text.startsWith("balonku"));
		System.out.println(text.startsWith("ikanku"));
		System.out.println(text.endsWith("ikanku"));

//		
		String text2 = "sunib";
		System.out.println(text2.equals("binus"));
		System.out.println(text2.equals("sunib"));

//		
		String text3 = "mAkAn AyAm";
		System.out.println(text3.toUpperCase());
		System.out.println(text3.toLowerCase());

//		
		String text4 = "gak kosong";
		String text5 = "";
		System.out.println(text4.isEmpty());
		System.out.println(text5.isEmpty());

//		
		String name = "Zenli Huangtara";
		String[] nameSplit = name.split(" ");
		String firstName = nameSplit[0];
		String lastName = nameSplit[1];
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);

//		
		String text6 = "main bola";
		System.out.println(text6.length());

		System.out.println();
//		Type Casting: merubah tipe data/ class sebuah object
		int aa = 9;
		float bb = (float) aa;
		System.out.println(aa);
		System.out.println(bb);

//		
		Integer cc = 10;
		Float dd = (Float) cc.floatValue();
		System.out.println(cc);
		System.out.println(dd);

		System.out.println();
//		ASCII
		char temp = 'a';
		System.out.println((int) temp);
		System.out.println((char) 97);

		System.out.println((int) 'A' - (int) 'a');

		System.out.println();
//		Math methods
		// abs
		System.out.println(Math.abs(10.1f));
		System.out.println(Math.abs(-10));

		// max
		System.out.println(Math.max(1, 100));

		// min
		System.out.println(Math.min(1, 100));

		// round
		System.out.println(Math.round(15.5));
		System.out.println(Math.round(15.4));
		System.out.println(Math.round(15.6));

		// sqrt
		System.out.println(Math.sqrt(16));

		// pow
		System.out.println(Math.pow(2, 3));

		// ceil
		System.out.println(Math.ceil(15.01));

		// floor
		System.out.println(Math.floor(15.99));

		System.out.println();
//		Random Methods
		// nextInt
		Random rand = new Random();
		System.out.println(rand.nextInt(11));

		// nextDouble
		System.out.println(rand.nextDouble());

		// Static Method &
		// kalau bisa langung panggil methodnya -> Static
		// ->

		// Exception/ Error Handling
		Scanner scan = new Scanner(System.in);
		int umur = 0;

		System.out.print("Input umur: ");

		try {
			umur = scan.nextInt();
		} catch (Exception e) {
			// System.out.println(e);
			System.out.println("Please input integer");
		}
		scan.nextLine();

		System.out.println("Umur " + umur);

		System.out.println();
		// Repetition

		while (umur == 0) {
			System.out.print("Input umur: ");
			try {
				umur = scan.nextInt();
			} catch (Exception e) {
				// System.out.println(e);
				System.out.println("Please input integer");
			}
			scan.nextLine();
		}

	}

}
