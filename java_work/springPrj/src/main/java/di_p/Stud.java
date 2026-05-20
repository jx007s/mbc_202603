package di_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Stud implements  Comparable<Stud>{
    //이름, 국어, 영어, 수학 , 총점, 평균
    String name;
    int [] jum;
    int rank;

    public void rankCalc( List<Stud> data){
        rank = 1;
        for (Stud you : data){
            if(getAvg()<you.getAvg()){
                rank++;
            }
        }
    }

    public void setJum(int[] jum) {
        this.jum = jum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTot(){
        return IntStream.of(jum).sum();
    }
    public int getAvg(){
        return (int)IntStream.of(jum).average().getAsDouble();
    }

    @Override
    public String toString() {
        return name + '\t' +
                Arrays.toString(jum) + '\t' +
                getTot() + '\t' +
                getAvg() + '\t' + rank;
    }

    @Override
    public int compareTo(Stud o) {
        int res = rank - o.rank;
        if(res==0){
            res = 1;
        }
        return res;
    }
}
