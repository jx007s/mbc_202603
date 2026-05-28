package aaa.model_p;

import lombok.Data;

@Data
public class PData {
    String cate, service;
    int nowPage = 1;

    public String urlParam() {
        return "nowPage=" + nowPage + "&cate="+cate;
    }

    public String ca_ser() {
        return cate + "_"+service;
    }
}
