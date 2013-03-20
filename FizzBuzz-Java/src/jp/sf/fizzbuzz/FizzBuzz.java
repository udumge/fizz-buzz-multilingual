/**
 *
 */
package jp.sf.fizzbuzz;

/**
 * @author sf
 * FizzBuzz�̌��ʂ��v�Z����N���X
 */
public class FizzBuzz {

    /**
     * @author sf
     * FizzBuzz�Ɛ錾����l�Ɛ錾���̌��t��g�݂ŊǗ�����N���X
     * �Ƃ肠������ʓI�Ȃ��萔�Ƃ��ĕێ�����
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

        String result = ""; // ����������͋󕶎��Ƃ���
        // ���胏�[�h�ɂ��Đ����Ŋ����Ă݂�
        for(FIZBUZWORD oneNumber : FIZBUZWORD.values()){
            // ����؂ꂽ�當����ǉ����Ă���
            if(0 == (value % oneNumber.getNumber())){
                result += oneNumber.getWord();
            }
        }
        // ��x���������ǉ�����Ă��Ȃ��ꍇ�́A�����ŕԓ�����
        if("".equals(result)) result = value.toString();

        return result;
    }
}
