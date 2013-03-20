#!/usr/bin/perl

package fizzbuzz;

# PerlでFizzBuzz

# FizzBuzzを宣言する数値と言葉は連想配列として保持する
# 添字を言葉、値を数値とする
# 評価順は配列で持つ

my $n = 0;

$VERIFYORDER[$n++] = "FIZZ";
$VERIFYORDER[$n++] = "BUZZ";

$FIZBUZWORD{"FIZZ"} = 3;
$FIZBUZWORD{"BUZZ"} = 5;

sub verifyFizzBuzz{

    # 初期値は空文字にしておく
    my $result = "";
    
    # 特定ワードについて数字で割ってみる
    foreach $word (@VERIFYORDER){
        my $number = $FIZBUZWORD{$word};
        # 割り切れたら文字を追加する
        if(0 == ($_[0] % $number)) {
            $result .= $word;
        }
    }

    # 一度も文字が追加されていない場合は数字で返答する
    if($result eq ""){
         $result = $_[0];
    }

    return($result);
}

1;
