/**
 *
 */
package jp.sf.fizzbuzz;

/**
 * @author sf
 * FizzBuzzの結果を計算するクラス
 */
public class FizzBuzz {

    /**
     * @author sf
     * FizzBuzzと宣言する値と宣言時の言葉を組みで管理するクラス
     * とりあえず一般的なやつを定数として保持する
     */
    public enum FIZBUZWORD {

        FIZZ("FIZZ",3),
        BUZZ("BUZZ",5);

        private final String word;
        private final Integer number;

        FIZBUZWORD(final String w, final Integer n){
            word = w;
            number = n;
        }

        public Integer getNumber(){
            return number;
        }

        public String getWord(){
            return word;
        }
    }

    public String verifyFizzBuzz(Integer value){

        String result = ""; // 初期文字列は空文字とする
        // 特定ワードについて数字で割ってみる
        for(FIZBUZWORD oneNumber : FIZBUZWORD.values()){
            // 割り切れたら文字を追加していく
            if(0 == (value % oneNumber.getNumber())){
                result += oneNumber.getWord();
            }
        }
        // 一度も文字が追加されていない場合は、数字で返答する
        if("".equals(result)) result = value.toString();

        return result;
    }
}
