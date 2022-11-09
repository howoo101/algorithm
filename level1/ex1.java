package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/*
 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
 *  이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
 *   배열 arr에서 제거 되고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
 *    단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
	예를들면
	
	arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
	arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
 */
class ex1 {

	@Test
	void test() {
		String a = Arrays.toString(solution1(new int[] { 1, 1, 3, 3, 0, 1, 1 }));
		String b = Arrays.toString(new int[] { 1, 3, 0, 1 });
		assertTrue(a.equals(b));
	}

	@Test
	void test2() {
		String a = Arrays.toString(solution1(new int[] { 4, 4, 4, 3, 3 }));
		String b = Arrays.toString(new int[] { 4, 3 });
		assertTrue(a.equals(b));
	}

	public static int[] solution1(int[] arr) {
		int[] answer = {};
		int count = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == arr[i])
				continue;
			else
				count++;
		}

		answer = new int[count + 1];
		answer[0] = arr[0];
		count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] != arr[i]) {
				answer[count] = arr[i];
				count++;
			}
		}
		return answer;

	}
}
