package edu.issuetracker.domain.viewmodel;

import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class PageViewModel<T> {

    private final List<T> elements;
    private final long currentSize;
    private final long totalCount;

    public static <E> PageViewModel<E> empty() {
        return new PageViewModel<>(Collections.emptyList(), 0, 0);
    }
}
