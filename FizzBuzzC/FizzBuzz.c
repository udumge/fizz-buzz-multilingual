/* FIZZBUZZに必要なヘッダファイル */
#include<stdio.h>
#include<string.h>
#include<stdlib.h>

/* CUnitに必要なヘッダファイル */
#include<CUnit/CUnit.h>
#include<CUnit/Basic.h>

// FizzBuzz宣言するときの数字と言葉
struct FIZBUZWORD {
    char WORD[256];
    int number;
};

struct FIZBUZWORD defWord[2] = {
    {"FIZZ",3},
    {"BUZZ",5}
};

char* verifyFizzBuzz(int value){

    int i;

    // 初期値は空文字にしておく
    //char result[256] = "";
    char *result = malloc(256);
    result[0] = '\0';

    // 特定のワードについて数字で割ってみる
    for(i = 0; i < 2; i++){
        if( 0 == (value % defWord[i].number) ){
             //割り切れたら文字を追加する
             strncat(result, defWord[i].WORD, 256-1);
        }
    }
    //一度も文字が追加されていない場合は、数字で返答する
    if(0 == strlen(result)) snprintf(result, 256-1, "%d", value);

    return result;
}

/* ここからCUnitテスト */
/* 本当は分けたいけど今回は面倒なので省略 */

int fizzbuzz_setup(void){
    return 0;
}

int fizzbuzz_teardown(void){
    return 0;
}

void test_verifyfb0(void){
    CU_ASSERT_STRING_EQUAL(verifyFizzBuzz(0),"FIZZBUZZ");
}

void test_verifyfb1(void){
    CU_ASSERT_STRING_EQUAL(verifyFizzBuzz(1),"1");
}

void test_verifyfb3(void){
    CU_ASSERT_STRING_EQUAL(verifyFizzBuzz(3),"FIZZ");
}

void test_verifyfb9(void){
    CU_ASSERT_STRING_EQUAL(verifyFizzBuzz(9),"FIZZ");
}

void test_verifyfb5(void){
    CU_ASSERT_STRING_EQUAL(verifyFizzBuzz(5),"BUZZ");
}

void test_verifyfb10(void){
    CU_ASSERT_STRING_EQUAL(verifyFizzBuzz(10),"BUZZ");
}

void test_verifyfb15(void){
    CU_ASSERT_STRING_EQUAL(verifyFizzBuzz(15),"FIZZBUZZ");
}

void test_verifyfb30(void){
    CU_ASSERT_STRING_EQUAL(verifyFizzBuzz(30),"FIZZBUZZ");
}

void test_verifyfbMinus(void){
    CU_ASSERT_STRING_EQUAL(verifyFizzBuzz(-1),"-1");
}

static CU_TestInfo test_fb[] = {
    {"数値0", test_verifyfb0 },
    {"数値1", test_verifyfb1 },
    {"数値3", test_verifyfb3 },
    {"数値9", test_verifyfb9 },
    {"数値5", test_verifyfb5 },
    {"数値10", test_verifyfb10 },
    {"数値15", test_verifyfb15 },
    {"数値30", test_verifyfb30 },
    {"数値マイナス", test_verifyfbMinus },
    CU_TEST_INFO_NULL,
};

static CU_SuiteInfo suites[] = {
    {"FIZZBUZZ TEST", fizzbuzz_setup, fizzbuzz_teardown, test_fb },
    CU_SUITE_INFO_NULL,
};


void main(){
    CU_initialize_registry();
    CU_register_suites(suites);
    CU_basic_set_mode(CU_BRM_VERBOSE);
    CU_basic_run_tests();
    CU_cleanup_registry();
}

