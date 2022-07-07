package Exercise_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SelfPractise_CharacterCounts_In_A_Word 
{
	public static void main(String[] args) 
	{
		String word = "JAVA";
		word = word.replaceAll(" ", "");
		word = word.toLowerCase();
		System.out.println(word);
		char a[] = word.toCharArray();
		int count = 0;
		char temp;
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		for(int i=0;i<a.length;i++)
		{
			temp = a[i];
			for(int j=0;j<a.length;j++)
			{
				if(temp==a[j])
				{
					count++;
				}
			}
			m.put(temp, count);
			count=0;
		}
		System.out.println(m);
		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		System.out.println(entrySet);
		Iterator<Entry<Character, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
