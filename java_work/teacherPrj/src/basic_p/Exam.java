package basic_p;

public class Exam {

	public static void main(String[] args) {
		final String pname = "정우성";
		final int kor = 87, eng = 78, mat = 82;
        int tot = kor + eng + mat;
        double avg = (double)tot / 3;
        // tot : 247   , (double)tot : 247.0
        /*

        82.33333333333333
         	*100
        8233.333333333333
        	(int)
        8233
        	(double)
        8233.0
        	/100
        82.33 
         
         */
        
         System.out.println("이름 : "+pname);
         System.out.println("국어 : "+kor);
         System.out.println("영어 : "+eng);
         System.out.println("수학 : "+mat);
         System.out.println("총점 : "+tot);
         System.out.println("평균 : "+avg);
         System.out.println(247);
         System.out.println((double)247);

	}

}
