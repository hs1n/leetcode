package leetcode.easy.benchmark;

import leetcode.BenchmarkTest;
import leetcode.easy.PalindromeNumber;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;


@State(Scope.Thread)
public class PalindromeNumberBenchmarkTest extends BenchmarkTest {
    private static final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Benchmark
    public void myBenchmark() {
        palindromeNumber.isPalindrome(123454321);
    }
}