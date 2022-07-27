package com.jv.la.demo.model.request.OutBoundBeer;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

@Getter
@Setter
public class OutBoundBeerModel {
    public String name;
    @Nullable
    public String type;
}
