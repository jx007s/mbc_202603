package aaa.exam_p.model;

import lombok.Data;

@Data
public class PageInfo {
    String service;
    int pNo, startPage, endPage, totalPage, limit;
}
