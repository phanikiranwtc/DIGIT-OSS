package org.ilms.web.model.notification;

import lombok.*;
import org.ilms.web.model.Recepient;
import org.ilms.web.model.enums.Source;
import org.ilms.web.model.enums.Status;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@NoArgsConstructor
@Setter
@ToString
@Builder
public class Event {

    @NotNull
    private String tenantId;

    private String id;

    private String referenceId;

    @NotNull
    private String eventType;

    private String name;

    @NotNull
    private String description;

    private Status status;

    @NotNull
    private Source source;

    private String postedBy;

    @Valid
    @NotNull
    private Recepient recepient;

    private Action actions;

    private EventDetails eventDetails;


}
