package net.bakulinav.psd.server.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-01-30T10:06:52.317+04:00[Europe/Saratov]")

@Controller
@RequestMapping("${openapi.bGPSD2.base-path:/psd2}")
public class CardAccountsApiController implements CardAccountsApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CardAccountsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
