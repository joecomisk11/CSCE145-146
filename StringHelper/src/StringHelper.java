/*
 * Created by Joe Comiskey
 */
public class StringHelper {

		public static boolean hasAllUniqueCharacters(String str)
		{
			str = str.toUpperCase();
			for(int i =0; i<str.length();i++)
			{
				for(int j=i+1;j<str.length();j++)
				{
					if(str.charAt(i) == str.charAt(j))
						return false;
				}
			}
			return true;
		}
		
		
		public static String meshString(String str1, String str2)
		{
			if(str1 == null || str2 == null)
				return null;
			String bigString = str1;
			String smallString = str2;
			if(str1.length() < str2.length())
			{
				bigString = str2;
				smallString = str1;
			}
			String ret = "";
			for(int i=0; i<smallString.length();i++)
			{
				ret += (str1.charAt(i)+""+str2.charAt(i));
			}
			ret += bigString.substring(smallString.length());
			return ret;
		}
		public static String replaceVowelswithOodle(String str)
		{
			String ret = "";
			str = str.toLowerCase();
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				{
					ret += "oodle";
				}
				else
				{
					ret += str.substring(i,i+1);
				}
			}
			return ret;
		}
		public static double weight(String str)
		{
			double ret = 0.0;
			str = str.toLowerCase();
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				{
					ret += 2.5;
				}
				else
				{
					ret += 3.4;
				}
			}
			return ret;
			
		}
}
