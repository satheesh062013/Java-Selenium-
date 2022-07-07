package Exercise_Programs;

public class SelfPractise_Find_A_Number_In_A_Word {

	public static void main(String[] args) 
	{
		String s = "Ja6va3";
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) 
		{
			if(charArray[i]>=48 && charArray[i]<=57)   //IMPORTANT
				System.out.println("Number Presence: "+charArray[i]+"      Index of the Number: "+i);
		}	
		/*
		 ASCII Values:	
		 https://www.ibm.com/docs/en/aix/7.2?topic=adapters-ascii-decimal-hexadecimal-octal-binary-conversion-table
		 A-Z: 65 to 90   
		 a-z: 97 to 122
		 0-9: 48 to 57
		 : 58 ; 59 < 60  = 61  > 62  ? 63  @ 64    
		 [ 91 \ 92 ] 93 ^ 94 - 95 ` 96
		 { 123 | 124  } 125 ~ 126 DEL 127 
		 ! 33 " 34 # 35 $ 36 % 37 & 38 ' 39 ( 40 ) 41 * 42 + 43 , 44 - 45 . 46 / 47            */
	}
}
