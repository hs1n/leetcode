package leetcode.easy.benchmark;

import leetcode.BenchmarkTest;
import leetcode.easy.TwoSum;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;


@State(Scope.Thread)
public class TwoSumBenchmarkTest extends BenchmarkTest {
    private static final TwoSum twoSum = new TwoSum();

    @Benchmark
    public void hashMapBenchmark() {
        twoSum.twoSumByMap(new int[]{3, 3, 4, 5, 6}, 6);
    }

    @Benchmark
    public void bruteForceBenchmark() {
        twoSum.twoSumByBruteForce(new int[]{3, 3, 4, 5, 6}, 6);
    }
}