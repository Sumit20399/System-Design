package behavioral.chainOfResponsibility.handlerInterface;

import behavioral.chainOfResponsibility.request.Request;

public interface SupportHandler {
    void handleRequest(Request request);
    void setNextHandler(SupportHandler nextHandler);
}
