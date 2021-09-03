package nextstep.jwp.view;

import nextstep.jwp.model.httpmessage.response.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class ModelAndView {

    private final Map<String, Object> model = new HashMap<>();
    private String viewName;
    private HttpStatus status;

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public boolean hasModel() {
        return model.size() > 0;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
