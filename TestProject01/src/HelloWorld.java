
public class HelloWorld {

	public static void main(String[] args) {
		// Hello World!の出力
		System.out.println("Hello World!");

		System.out.println(123);

		System.out.print(456);

		System.out.print(789);

		System.out.println(101112);

		System.out.println("例外が\r\n発生しました。");

		String name ="高橋";
		//文字列を変数に代入する場合は　Stringクラスを使う！！！！
		System.out.println(name);

		char chr='A';
		//一文字の場合はStringではなくcharを使いましょう！
		//後シングルコーテーションにしか反応しないぞ！
		System.out.println(chr);
		int num1 =12345;
		//数字は intで表示させるぞ！コーテーションいらず！
		System.out.println(num1);

		int a = 3+3 ;
		//これは変数と一緒だな！そして文字列だけで表示するとなると？もうわかるね？
		System.out.println(a);

		String b ="3+3";
		System.out.println(b);
		//いつも通りintで計算が出来るけど、もし割り算やその他で小数点以下がほしい時。

		float c = (float)10 / 3;
		System.out.println(c);

		double d = (double)10 / 3;
		System.out.println(d);
		//あまりの求めかたは　「%」 な！

		int a1 = 5 % 2;
		System.out.println(a1);

		int a2 = 3 ;
		System.out.println(++a2);

		String b1 = "山田";
		if(b.equals( "山田")){
			System.out.println( b1 +"さん");
		/*　いつものif文と違うのは　文字列を＝対象にしたい時は
		 * ○「.equals」("文字")){　で対処するんだぞ！
		 */
		}

		int a3 = 5;
		if( a3 < 10 && a3 > 3){
			System.out.println("A");
		}
		
		int b2 = 5;
		if( b2>= 5 || b2 <= 0){
			System.out.println("B");
		}
		
		//配列の書き方も少し違うぞ！
		// String [] name = {"AB","CD","EF"};

		/*　多次元配列の時もすこーし違うぞ！
		 * ためしにやってみよう！
		 */
		
		//String [][] グループ名 ={{"AB","CD},{"EF","GH"}  };

	}


}