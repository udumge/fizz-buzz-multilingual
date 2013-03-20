/* QUnitを使用したFizzBuzzテスト */

test("FizzBuzz- length", function() {
  strictEqual(FBWORDLIST.length, 2, "OK");
});

test("FizzBuzz- 0", function() {
  strictEqual(verifyFizzBuzz(0), "FIZZBUZZ", "OK:0");
});

test("FizzBuzz- 1", function() {
  strictEqual(verifyFizzBuzz(1), "1", "OK:1");
});

test("FizzBuzz- 3", function() {
  strictEqual(verifyFizzBuzz(3), "FIZZ", "OK:3");
});

test("FizzBuzz- 9", function() {
  strictEqual(verifyFizzBuzz(9), "FIZZ", "OK:9");
});

test("FizzBuzz- 5", function() {
  strictEqual(verifyFizzBuzz(5), "BUZZ", "OK:5");
});

test("FizzBuzz- 10", function() {
  strictEqual(verifyFizzBuzz(10), "BUZZ", "OK:10");
});

test("FizzBuzz- 15", function() {
  strictEqual(verifyFizzBuzz(15), "FIZZBUZZ", "OK:15");
});

test("FizzBuzz- 30", function() {
  strictEqual(verifyFizzBuzz(30), "FIZZBUZZ", "OK:30");
});

test("FizzBuzz- Minus", function() {
  strictEqual(verifyFizzBuzz(-1), "-1", "OK:-1");
});
