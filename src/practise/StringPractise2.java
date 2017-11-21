package practise;

/*一个子串在整串中出现的次数
 * "nbaernbatynbauinbaopnba"
 * 
 * 思路：
 * 1.要找的子串是否存在，如果存在获取其出现的位置。用indexOf
 * 2.找到了，记录出现的位置并在剩余的字符串中继续查找该子串，
 * 而剩余字符串的起始位置是出现位置+子串的长度。
 * 3.以此类推，通过循环完成查找，如果找不到就是-1，
 * 并对i每次找到用计数器记录
 * */
public class StringPractise2 {
	public static void main(String[] args) {
		String str = "nbaernbatynbauinbaopnba";
		String key = "nba";

		int count = getKeyStringCount(str, key);
		System.out.println("count=" + count);

	}

	public static int getKeyStringCount(String str, String key) {
		// 1.定义计数器
		int count = 0;
		// 2.定义变量，记录key出现的位置
		int index = 0;

		while ((index = str.indexOf(key)) != -1) {
			str = str.substring(index + key.length());
			count++;
		}
		return count;
	}
}
