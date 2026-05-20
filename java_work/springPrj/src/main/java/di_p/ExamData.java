package di_p;

import java.util.ArrayList;
import java.util.List;

public class ExamData {
    List<Stud> data;

    public void setData(List<Stud> data) {
        this.data = data;
    }

    void calc(){
        for (Stud st : data){
            st.rankCalc(data);
        }
    }
    public void ppp(){
        calc();
        for (Stud st : data){
            System.out.println(st);
        }
    }

}
