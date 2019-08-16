package session9;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] EmpCode = { 001, 002, 003, 004, 005, 006 };
		String[] EmpName = { "Joe", "Jim", "Jeff", "Jill", "John", "Jack" };

		HashMap<Object, Object> hashM = new HashMap<>();

		for (int i = 0; i < 6; i++) {
			hashM.put(EmpCode[i], EmpName[i]);
		}
		System.out.println(hashM.values());

	}

}
