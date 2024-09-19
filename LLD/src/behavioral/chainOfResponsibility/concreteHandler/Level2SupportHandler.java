package behavioral.chainOfResponsibility.concreteHandler;

import behavioral.chainOfResponsibility.handlerInterface.SupportHandler;
import behavioral.chainOfResponsibility.request.Priority;
import behavioral.chainOfResponsibility.request.Request;

public class Level2SupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.INTERMEDIATE) {
            System.out.println("Level 2 Support handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

}
