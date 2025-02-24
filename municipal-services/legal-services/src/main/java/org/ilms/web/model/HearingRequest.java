package org.ilms.web.model;

import javax.validation.Valid;
import org.egov.common.contract.request.RequestInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HearingRequest {
    @JsonProperty ("RequestInfo")
    private RequestInfo RequestInfo;

    @Valid
    @JsonProperty ("hearing")
    private Hearing hearing;

    @JsonProperty ("workflow")
    private Workflow workflow;
}
