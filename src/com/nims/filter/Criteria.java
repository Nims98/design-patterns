package com.nims.filter;

import java.util.List;

public interface Criteria {
    List<Person> filtered(List<Person> persons);
}
