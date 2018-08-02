package dk.pub.util;

public class StringUtil {

	/**
	 * 首字符变小写
	 * @param str
	 * @return
	 */
	public static String firstCharToLowerCase(String str){
		char firstChar = str.charAt(0);
		if(firstChar >= 'A' && firstChar <= 'Z'){
			char[] arr = str.toCharArray();
			arr[0] += ('a' - 'A');
			return new String(arr);
		}
		return str;
	}
	
	/**
	 * 首字母变大写
	 * @param str
	 * @return
	 */
	public static String firstCharToUpperCase(String str){
		char firstChar = str.charAt(0);
		if(firstChar >= 'a' && firstChar <= 'z'){
			char[] arr = str.toCharArray();
			arr[0] += ('A' - 'a');
			return new String(arr);
		}
		return str;
	}
	/**
	 * 输出char类型的ASCII码值
	 * @param c
	 * @return
	 */
	public static int charToASC2Code(char c){
		int i = (int)c;
		return i;
	}
	
	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		return (str == null) || (str.length() == 0);
	}
	/**
	 * 判断字符串是否不为空
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}
	
	/**
	 * 判断是否空白
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str){
		int strLen ;
		if((str == null) || (strLen=str.length()) == 0)
			return true;
		for(int i=0;i<strLen;i++){
			if(!Character.isWhitespace(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	/**
	 * 判断是否非空白
	 * @param str
	 * @return
	 */
	public static boolean isNotBlank(String str){
		return !isBlank(str);
	}
	
	/**
	 * 判断多个字符串全部为空
	 * @param strings
	 * @return
	 */
	public static boolean isAllEmpty(String ... strings ){
		if(strings == null) return true;
		for(String str:strings){
			if(isNotEmpty(str)){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 判断多个字符串是否存在为空的
	 * @param strings
	 * @return
	 */
    public static boolean isHasEmpty(String ...strings){
    	if(strings == null)
    		return true;
    	for(String str:strings){
    		if(isEmpty(str)){
    			return true;
    		}
    	}
    	return false;
    }	
	
    /**
     * 判断字符串是否为空，为空返回默认值，不为空返回原值
     * @param checkValue
     * @param defaultValue
     * @return
     */
    public static String isEmpty(String checkValue,String defaultValue){
    	return isEmpty(checkValue)?defaultValue:checkValue;
    }
    
    /**
     * str不为null且不为“”，而且等于other
     * @param str
     * @param other
     * @return
     */
    public static boolean isNotEmptyAndEquelsOther(String str,String other){
    	if(isEmpty(str)){
    		return false;
    	}
    	return str.equals(other);
    }
    
    /**
     * str不等于null或“”，并且不等于other
     * @param str
     * @param other
     * @return
     */
    public static boolean isNotEmptyAndNotEqualsOther(String str,String... other){
    	if(isEmpty(str)){
    		return false;
    	}
    	for(int i=0;i<other.length;i++){
    		if(str.equals(other[i])){
    			return false;
    		}
    	}
    	return true;
    }
    
    /**
     * str不等于other
     * @param str
     * @param other
     * @return
     */
    public static boolean isNotEqualsOther(String str,String ...other){
    	for(int i=0;i<other.length;i++){
    		if(other[i].equals(str)){
    			return false;
    		}
    	}
    	return true;
    }
    
    /**
     * str不为空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String ...str){
    	if(str == null){
    		return false;
    	}
    	for(String strTemp:str){
    		if(strTemp == null || "".equals(strTemp.trim())){
    			return false;
    		}
    	}
    	return true;
    }
    
	public static void main(String[] args) {
//	    String s = "abx";
//	    char firstChar = s.charAt(0);
//	    System.out.println(s.charAt(0));
//	    System.out.println(firstChar);
//		System.out.println(firstCharToLowerCase("ABCabcAbv"));
//		System.out.println(firstCharToUpperCase("aBCabcAbv"));
//		System.out.println(charToASC2Code('A')- charToASC2Code('a'));
//		System.out.println(charToASC2Code('A'));
//		System.out.println(charToASC2Code('a'));
		System.out.println(isHasEmpty(null,"1","2",""));
		
		
		
	}
	
	
	
	
	
	
	
	
}
