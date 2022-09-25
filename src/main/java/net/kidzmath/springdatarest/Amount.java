package net.kidzmath.springdatarest;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Amount {
    public String currency;
    public BigDecimal value;
}
