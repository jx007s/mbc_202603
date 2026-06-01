package aaa.exam_p.model;

import lombok.Data;

@Data
public class PageInfo {
    String service;
    int pNo=1, startPage, endPage, totalPage, limit=3;
    public int getOffset(){
        return (pNo-1)*limit;
    }
}
