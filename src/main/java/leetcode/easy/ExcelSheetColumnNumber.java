package leetcode.easy;

/**
 * @see <a href="https://leetcode.com/problems/excel-sheet-column-number/">171. Excel Sheet Column Number</a>
 */
class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        if (columnTitle.length() < 1 || columnTitle.length() > 7)
            throw new IllegalArgumentException("1 <= columnTitle.length <= 7");

        int sum = 0;
        int exp = 0;

        for (int i = columnTitle.length() - 1; i >= 0; i--) { // start from end of chars
            int current = (columnTitle.charAt(i) - 64); // translate char to corresponding number e.g. "A":65 -> "A":1
            int multiplier = (int) Math.pow(26, exp++);
            sum += current * multiplier;
        }

        return sum;
    }
}