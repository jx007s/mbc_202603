package aaa.model_p;

import lombok.Data;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


@Data
public class Exam implements Comparator<Stud>{
    List<Stud> studs;
    String ordTitle, ordDir;


    @Override
    public int compare(Stud o1, Stud o2) {

        int res = 0;
        if(ordTitle.equals("pname")){
            res=o1.pname.compareTo(o2.pname);
        }
        if(ordTitle.equals("tot")){
            res=o1.getTot()-o2.getTot();
        }
        if(res==0){
            res = 1;
        }

        if(ordDir.equals("desc")){
            res*=-1;
        }
        return res;
    }

    public TreeSet<Stud> calc(){

        TreeSet<Stud> res = new TreeSet<Stud>(this);
        res.addAll(studs);
        return res;
    }
}

