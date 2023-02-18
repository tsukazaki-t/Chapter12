import java.sql.SQLException;

public class Chapter12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			int array[] = { 1, 3, 5 };
			Chapter12.validIndex(array, 2);
			Chapter12.validIndex(array, 3);

			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}

		// tryを記述
		// ・throwSQLExceptionメソッドを呼び出す
		// catchを記述
		// ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
		// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
		try {
			Chapter12.throwSQLException();
		}catch(SQLException e){
			System.out.println("SQLExceptionが発生");
			e.printStackTrace();
		}finally{
			// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
			// 例外発生しても出力するため、finallyブロックに記述
			System.out.println("throwSQLExceptionの呼び出し終了");
			
		}

	}
	
	// validIndexメソッドを作成		
		
	public static void validIndex(int[]array,int index) {
	// ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
	// ・サイズの範囲外なら、IllegalArgumentExceptionをスロ
		if(array.length <= index) {
			throw new IllegalArgumentException(index + "はサイズの範囲外です");		
		}else {
			System.out.println("インデックス" + index + "の要素は" + array[index] + "です");
		}
	}
	
	// throwSQLExceptionメソッドの作成
	public static void throwSQLException() throws SQLException {
		// SQLExceptionは、通常、SQLでエラーの場合に発生する例外
		throw new SQLException("SQLエラーです");
	}
}
