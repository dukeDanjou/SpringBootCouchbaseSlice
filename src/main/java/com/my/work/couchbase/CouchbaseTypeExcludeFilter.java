package com.my.work.couchbase;

import org.springframework.boot.test.autoconfigure.filter.StandardAnnotationCustomizableTypeExcludeFilter;

public final class CouchbaseTypeExcludeFilter extends StandardAnnotationCustomizableTypeExcludeFilter<DataCouchbaseTest> {

    CouchbaseTypeExcludeFilter(Class<?> testClass) {
        super(testClass);
    }
}