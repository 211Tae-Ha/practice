public class ag161103 {

	public static void main(String[] args) {
/*		10~1000까지 각 숫자 분해하여 곱하기의 전체 합 구하기*/
		
		int total = 0;
		
		for(int i = 10; i < 1001; i++) {
			Integer num = i;
			int def = 1; //분해하여 곱할 값
			String divNum = num.toString();//문자열로 바꾸고
			char[] array = divNum.toCharArray();//한 글자 씩 배열에
			
			for(char ch : array) {
				def *= Character.getNumericValue(ch);
			}
			total += def;
		}
		System.out.println("총합 : " + total);
	}

}
