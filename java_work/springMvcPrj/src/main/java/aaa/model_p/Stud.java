package aaa.model_p;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.stream.IntStream;

@ToString
public class Stud {

    @Setter
    @Getter
    String pname;

    int [] jum = new int[3];

    public void setKor(int j){ jum[0] = j;}
    public void setEng(int j){ jum[1] = j;}
    public void setMat(int j){ jum[2] = j;}

    public int getTot(){
        return IntStream.of(jum).sum();
    }

    public int getAvg(){
        return (int)IntStream.of(jum).average().orElse(0);
    }
    public int getJum(int i){
        return jum[i];
    }
}
