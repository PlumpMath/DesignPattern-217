package builder;

import java.util.ArrayList;
import java.util.List;

class Product {

	List<String> parts = new ArrayList<String>();

	// ��Ӳ���
	public void Add(String part) {
		parts.add(part);
	}

	// չʾ��Ʒ
	public void show() {
		System.out.println("\n��Ʒ ���� ---");
		for (int i = 0; i < parts.size(); i++)
			System.out.print(parts.get(i));
	}
}
