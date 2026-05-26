package aaa.model_p;

import lombok.Data;

import java.util.Comparator;
import java.util.List;


@Data
public class Exam {
    List<Stud> studs;
    String ordTitle, ordDir;

    class MyComp implements Comparator<Stud>{

        @Override
        public int compare(Stud o1, Stud o2) {
            return 0;
        }
    }


    public void calc(){

    }
}
