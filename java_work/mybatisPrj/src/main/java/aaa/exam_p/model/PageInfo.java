package aaa.exam_p.model;

import lombok.Data;

@Data
public class PageInfo {
    String service, msg, goURL;
    int pNo=1, totalPage, limit=3, pageLimit=4;
    public int getOffset(){
        return (pNo-1)*limit;
    }

    public void setTot(int tot){
        totalPage = tot/limit;
    }

    public int getStartPage(){
        return (pNo-1)/pageLimit*pageLimit+1;
    }
    public int getEndPage(){
        int res =  getStartPage()+pageLimit-1;
        return res;
    }
}
