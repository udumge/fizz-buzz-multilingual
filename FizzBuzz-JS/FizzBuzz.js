
/**
 * @param word �錾���錾�t
 * @param number �錾���̐���
 * FizzBuzz���莞�̐錾���錾�t�Ɣ��莞�̐���
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
 * @param value FIZZBUZZ���肷��l
 * FizzBuzz���������
 */
function verifyFizzBuzz(value){

  // ����������͋󕶎��ɂ��Ă���
  var result = "";
  // ���胏�[�h�ɂ��Đ����Ŋ����Ă݂�
  for (var i = 0; i < FBWORDLIST.length ; i++ ){
    var w = FBWORDLIST[i];
    // ����؂ꂽ�當����ǉ�����
    if(0 == (value % w.number)){
      result += w.word;
    }
  }
  // ��x���������ǉ�����Ă��Ȃ��ꍇ�͐����ŕԓ�����
  if("" == result) result = value.toString();

  return (result);

}