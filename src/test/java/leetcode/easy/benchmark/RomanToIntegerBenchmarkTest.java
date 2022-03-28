package leetcode.easy.benchmark;

import leetcode.BenchmarkTest;
import leetcode.easy.RomanToInteger;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;


@State(Scope.Thread)
public class RomanToIntegerBenchmarkTest extends BenchmarkTest {
    private static final RomanToInteger romanToInteger = new RomanToInteger();

    @Benchmark
    public void romanToInt01() {
        romanToInteger.romanToInt("MMMCMXCIX");
    }

    @Benchmark
    public void romanToIntHashMap01() {
        romanToInteger.romanToIntHashMap("MMMCMXCIX");
    }
}