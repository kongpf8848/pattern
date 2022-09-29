package io.github.kongpf8848.pattern.chain;

import java.util.ArrayList;
import java.util.List;

public class ActionRequest {

    private List<String> headers=new ArrayList<>();

    public List<String> getHeaders() {
        return headers;
    }

    public void addHeaders(String header){
        headers.add(header);
    }



}
