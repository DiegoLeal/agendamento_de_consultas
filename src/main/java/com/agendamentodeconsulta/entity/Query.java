package com.agendamentodeconsulta.entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class Query {

    private Long id;

    private OffsetDateTime dateQuery;

    private OffsetTime timeQuery;

    private BigDecimal price;

}
