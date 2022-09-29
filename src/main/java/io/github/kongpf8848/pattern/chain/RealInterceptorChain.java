package io.github.kongpf8848.pattern.chain;

import java.util.List;

public class RealInterceptorChain implements Chain {

    private List<Interceptor>interceptors;
    private int index;
    private ActionRequest request;
    public RealInterceptorChain(List<Interceptor>interceptors, int index, ActionRequest request){
        this.interceptors=interceptors;
        this.index=index;
        this.request=request;

    }

    RealInterceptorChain copy(int index, ActionRequest request) {
        return new RealInterceptorChain(this.interceptors,index,request);
    }

    @Override
    public ActionRequest getRequest() {
        return request;
    }

    @Override
    public ActionResponse proceed(ActionRequest request) {

        RealInterceptorChain next = copy(index + 1,request);
        Interceptor interceptor = interceptors.get(index);

        ActionResponse response = interceptor.intercept(next);

        return response;
    }
}
