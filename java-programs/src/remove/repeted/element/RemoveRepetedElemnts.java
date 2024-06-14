package remove.repeted.element;

public class RemoveRepetedElemnts {
	public static void main(String[] args) {
            String str="helloo";
            String uniqueStr=removeDuplicates(str);
            System.out.println("Original String:"+str);
            System.out.println("String with duplicates removed:"+uniqueStr);
	}
	public static String removeDuplicates(String str) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char currentChat=str.charAt(i);
			if(sb.indexOf(str.valueOf(currentChat))== -1) {
				sb.append(currentChat);
			}
		}
		return sb.toString();
	}
}
