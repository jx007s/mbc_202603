package aaa.exam_p.model;

import lombok.Data;

import java.util.List;

@Data
public class PageInfo {
    String service, msg, goURL, schVal, nameVal;
    int pNo=1, totalPage, limit=4, pageLimit=5, classNo;

    List<ExamDTO> arr;

    public int getOffset(){
        return (pNo-1)*limit;
    }

    public void setTot(int tot){
        totalPage = tot/limit;
        if(tot%limit!=0){
            totalPage++;
        }
    }

    public int getStartPage(){
        return (pNo-1)/pageLimit*pageLimit+1;
    }
    public int getEndPage(){
        int res =  getStartPage()+pageLimit-1;
        if(res>totalPage){
            res = totalPage;
        }
        return res;
    }
}
