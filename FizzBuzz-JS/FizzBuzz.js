
/**
 * @param word 宣言する言葉
 * @param number 宣言時の数字
 * FizzBuzz判定時の宣言する言葉と判定時の数字
 */
function FIZZBUZZWORD(word, number){
  this.word = word;
  this.number = number;
  return (this);
}

var FBWORDLIST = new Array(2);
FBWORDLIST[0] = new FIZZBUZZWORD("FIZZ",3);
FBWORDLIST[1] = new FIZZBUZZWORD("BUZZ",5);

/**
 * @param value FIZZBUZZ判定する値
 * FizzBuzz判定をする
 */
function verifyFizzBuzz(value){

  // 初期文字列は空文字にしておく
  var result = "";
  // 特定ワードについて数字で割ってみる
  for (var i = 0; i < FBWORDLIST.length ; i++ ){
    var w = FBWORDLIST[i];
    // 割り切れたら文字を追加する
    if(0 == (value % w.number)){
      result += w.word;
    }
  }
  // 一度も文字が追加されていない場合は数字で返答する
  if("" == result) result = value.toString();

  return (result);

}