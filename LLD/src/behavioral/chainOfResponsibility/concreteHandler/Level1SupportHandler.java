package behavioral.chainOfResponsibility.concreteHandler;

import behavioral.chainOfResponsibility.handlerInterface.SupportHandler;
import behavioral.chainOfResponsibility.request.Priority;
import behavioral.chainOfResponsibility.request.Request;

public class Level1SupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.BASIC) {
            System.out.println("Level 1 Support handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }


}
